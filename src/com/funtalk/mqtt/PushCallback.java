package com.funtalk.mqtt;

import com.alibaba.fastjson.JSONObject;
import com.funtalk.pojo.SendInfoEntity;
import com.funtalk.pojo.TbOError;
import com.funtalk.pojo.TbOModelRecord;
import com.funtalk.pojo.TbSCardinfo;
import com.funtalk.receiverold.sender.MQTTSender;
import com.funtalk.service.MqttService;
import com.funtalk.start.MqttClient;
import com.funtalk.util.JsonUtil;
import com.funtalk.util.StringUtil;
import org.apache.log4j.Logger;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 发布消息的回调类
 * 
 * 必须实现MqttCallback的接口并实现对应的相关接口方法CallBack 类将实现 MqttCallBack。
 * 每个客户机标识都需要一个回调实例。在此示例中，构造函数传递客户机标识以另存为实例数据。 在回调中，将它用来标识已经启动了该回调的哪个实例。
 * 必须在回调类中实现三个方法：
 * 
 * public void messageArrived(MqttTopic topic, MqttMessage message)接收已经预订的发布。
 * 
 * public void connectionLost(Throwable cause)在断开连接时调用。
 * 
 * public void deliveryComplete(MqttDeliveryToken token)) 接收到已经发布的 QoS 1 或 QoS 2
 * 消息的传递令牌时调用。 由 MqttClient.connect 激活此回调。
 * 
 */
public class PushCallback implements MqttCallback {

	Logger logger = Logger.getLogger(PushCallback.class);

	private static final int QoS = 1;

	public static MQTTSender  mqttClient  = new MQTTSender();
	public static MqttService mqttService = new MqttService();
	public static DateFormat  sdf  = new SimpleDateFormat("yyyyMMdd HH:mm:ss");


	public void connectionLost(Throwable cause) {
		// 连接丢失后，一般在这里面进行重连
		System.out.println("connectionLost try to reconnect ...");
		String topic = "/+/device";
		String clientid = "ftk_server_listener_894";

		MqttClient.start(topic, clientid);
	}

	public void deliveryComplete(IMqttDeliveryToken token) {
		logger.info("deliveryComplete---------" + token.isComplete());
	}

	public void messageArrived(String topic,final MqttMessage message)  throws Exception {
		// subscribe后得到的消息会执行到这里面

		new Thread(() -> {

			    long startTime = System.currentTimeMillis();

			    TbSCardinfo  tbSCardinfo=null;
			    TbSCardinfo  tbSCardinfoSeed=null;
				List<TbSCardinfo>  tbSCardinfoList;

				TbOError       tbOError =null;
			    TbOModelRecord tbOModelRecord=null;

			    List<String> succList= new ArrayList<>();
			    List<String> failList= new ArrayList<>();
			    List<String> undefineList= new ArrayList<>();
			    List<String> initList= new ArrayList<>();


				tbOError =new TbOError();
				tbOError.setTopic(topic);
			    tbOError.setErrType("1");


			    int messId =message.getId();
				int messQos=message.getQos();

			    String content = new String(message.getPayload());
				JSONObject obj = JsonUtil.jsonToObject(content);
				String cardId  = obj.getString("cardId");
				String iccId   = obj.getString("iccidId");
				String orderNo = obj.getString("orderno");
				String seedIccId = obj.getString("seedCard");
				String iccId1  = obj.getString("iccidId1:");
			    String iccId5  = obj.getString("iccidId5:");
			    String iccId6  = obj.getString("iccidId6:");
			    int cardType    = obj.getIntValue("cardType");
			    int signalLevel = obj.getIntValue("signalLevel");
				String updatanum   = obj.getString("updatanum");


			    logger.info("程序开始:"+Thread.currentThread().getName()+">>>"+sdf.format(new Date())+" MQTTReceiver:"
						    + "cardId:"+cardId+ ",iccId:"+iccId+",seediccId:"+seedIccId);


			// 1-种子卡 2-业务卡
				String serverTopic = "/" + cardId + "/server";

			    tbOModelRecord =new TbOModelRecord();

			    tbOModelRecord.setTopic(topic);
			    tbOModelRecord.setMessageId(messId);
			    tbOModelRecord.setMessageQos(messQos);
			    tbOModelRecord.setCardId(cardId);
			    tbOModelRecord.setIccid(iccId);
			    tbOModelRecord.setCardType(cardType);
			    tbOModelRecord.setIccid(iccId);
			    tbOModelRecord.setIccid1(iccId1);
			    tbOModelRecord.setIccid5(iccId5);
			    tbOModelRecord.setIccid6(iccId6);
			    tbOModelRecord.setSeedIccid(seedIccId);
			    tbOModelRecord.setSignalLevel(signalLevel);
			    tbOModelRecord.setVersion(updatanum);
			    tbOModelRecord.setMessageContent(content);

				mqttService.insertCommunicationRecord(tbOModelRecord);


				if (StringUtil.isEmpty(iccId)){
					tbOError.setErrMessae("模组上传iccid为空");
					mqttService.insertError(tbOError);
					return;
				}

				if (StringUtil.isEmpty(seedIccId)){
					tbOError.setErrMessae("模组上传seediccid为空");
					mqttService.insertError(tbOError);
					return;
				}


				SendInfoEntity returnData = new SendInfoEntity();

				returnData.setCardId(cardId);

			    // 处理 所有上报后的号码初始化操作，主要是对切卡指令后的上报 清空之前的卡
			    // 查询 iccid和iccidseed的pojo
			    //tbSCardinfoList = mqttService.getCardInfo(iccId,seedIccId); // pd.getDate(iccidId);

				tbSCardinfoList = mqttService.getRelevantCardInfo(iccId,seedIccId); // pd.getDate(iccidId);


                for (TbSCardinfo tbSCardinfo1 :tbSCardinfoList){

                	if (iccId.equals(tbSCardinfo1.getIccidMaster())){

                		tbSCardinfo=tbSCardinfo1;

						if (iccId.equals(seedIccId))
							tbSCardinfoSeed=tbSCardinfo1;

						continue;
					}

                	if (seedIccId.equals(tbSCardinfo1.getIccidMaster())){
						tbSCardinfoSeed=tbSCardinfo1;
						continue;
					}

                	//将业务号(if_seed='0')初始化
                	if ("1".equals(tbSCardinfo1.getIfUse()) && "0".equals(tbSCardinfo1.getIfSeed()))
						initList.add(tbSCardinfo1.getIccidMaster());

				}

			if (tbSCardinfo == null || tbSCardinfoSeed == null) {

				tbOError.setErrType("2");
				tbOError.setErrMessae("tb_s_cardinfo中未配置iccid或者seediccid:" + iccId + "," + seedIccId);
				mqttService.insertError(tbOError);
				return;
			}

			// 更新seediccid的card_id
			if (tbSCardinfoSeed.getCardId()==null || !cardId.equals(tbSCardinfoSeed.getCardId()))
				mqttService.updateCardIdByIccid(cardId,tbSCardinfoSeed.getIccidMaster());

			// 更新之前占用的卡为初始状态
			if (initList.size() > 0)
				mqttService.initializeCardInfo(initList);

			// 处理 发送短信后的上报
			if (orderNo != null && orderNo.length() != 0) {
				//订单号不为空 更新订单号对应的任务情况
				String resultString = obj.getString("result_list");

				JSONObject resObjects = JsonUtil.jsonToObject(resultString);
				Iterator<String> resultSet = resObjects.keySet().iterator();

				while (resultSet.hasNext()) {

					String key = resultSet.next();
					String value = resObjects.getString(key);

					if (value.equals("0")) {
						succList.add(key);
					} else if (value.equals("1")) {
						failList.add(key);
					} else {
						undefineList.add(key);
					}
				}

				if (succList.size() > 0)
					mqttService.updateStateByOrderAndPhone(orderNo, succList, "2");
				if (failList.size() > 0)
					mqttService.updateStateByOrderAndPhone(orderNo, failList, "3");
				if (undefineList.size() > 0)
					mqttService.updateStateByOrderAndPhone(orderNo, undefineList, "-5");

			}

			// 删卡
			if(iccId6 != null && iccId6.length() != 0){

				List<String> delList = new ArrayList<String>();

				IntStream.range(1,10).forEach(x ->{
					if (StringUtil.isNotEmpty(obj.getString("iccidId"+ x +":")) ){
						delList.add(obj.getString("iccidId"+ x +":"));
					}
				});

				if (delList.size()>0){

					tbSCardinfoList = mqttService.getCardInfoByIccidList(delList);

					Map<String, String> delCardMap= tbSCardinfoList.stream().collect(
											  Collectors.toMap(x -> x.getIccidMaster(), x -> x.getDeleteData())
										   );

					IntStream.range(0, delList.size()).forEach(x->{
								 if (delList.get(x) != null && delCardMap.get(delList.get(x)) != null) {
									 returnData.setIccidDel(x+1,delList.get(x), delCardMap.get(delList.get(x)));
								 }
							});
				}

				mqttService.createResultData(returnData,tbSCardinfo,"4"); //pb.Seed_Yuyue(cf, cardId, iccidId, "4");


			} else if (!iccId.equals("FFFFFFFFFFFFFFFFFFFF")) {

				// cmd 1-等待&预约  种子卡
				if ("1".equals(tbSCardinfo.getIfSeed())) {

					if ("0".equals(tbSCardinfo.getIfUse())) {

						// 种子卡预约上报 回复种子卡信息 让模组保存  pb.Seed_Yuyue(cf, cardId, iccidId, "1");
						mqttService.createResultData(returnData,tbSCardinfo,"1");

						tbSCardinfo.setIfUse("1");
						tbSCardinfo.setCardId(cardId);

						mqttService.updateByIccid(tbSCardinfo); // pd.update_seedcard(cardId, cf.getIf_use(), iccidId);

					} else if ("1".equals(tbSCardinfo.getIfUse())) {

						// 种子卡再次上报 切换业务卡 报文  pb.SeedToBusiness(iccidId, cardId, "1");
						 mqttService.switchCard(returnData,tbSCardinfo,tbSCardinfoSeed);

					}

				} else if ("0".equals(tbSCardinfo.getIfSeed())) {

					// 处理 发送后的上报信息
					if (StringUtil.isNotEmpty(orderNo)) {

						mqttService.switchCard(returnData,tbSCardinfo,tbSCardinfoSeed);

					}else {

						mqttService.sendMessage(returnData,tbSCardinfo,tbSCardinfoSeed);

					}
				}
			}

			// 调用发布 实现返回
			String serverContent = JsonUtil.objectToJson(returnData);

			long endTime = System.currentTimeMillis();
			tbOModelRecord =new TbOModelRecord();
			tbOModelRecord.setTopic(topic);
			tbOModelRecord.setCommand(returnData.getCmd());
			tbOModelRecord.setCardId(returnData.getCardId());
			tbOModelRecord.setIccid(returnData.getIccId());
			tbOModelRecord.setSmsMsg(returnData.getSms_msg() ==null ? "" :returnData.getSms_msg().get(0));
			tbOModelRecord.setMessageContent(serverContent);
			tbOModelRecord.setMessageId(Long.valueOf(endTime-startTime).intValue());

			mqttService.insertCommunicationRecord(tbOModelRecord);

			mqttClient.publishMessage(serverTopic, serverContent, QoS);

			logger.info("程序结束:"+Thread.currentThread().getName()+">>>处理时间"+(endTime-startTime)/1000 +"秒");

		}).start();


	}

}