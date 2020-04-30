package com.funtalk.receiverold;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import com.alibaba.fastjson.JSONObject;
import com.funtalk.receiverold.entity.DataInfoEntity_bak;
import com.funtalk.receiverold.bo.PushBo;
import com.funtalk.receiverold.sender.MQTTSender;
import com.funtalk.util.JsonUtil;
import com.funtalk.receiverold.entity.CardInfoEntity;
import com.funtalk.receiverold.dao.PushDao;
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

	// private static int cnt1 = 0;
	// private static int cnt2 = 0;
	private static final int QoS = 1;
	private static final PushBo pb = new PushBo();
	
	public static MQTTSender mqttClient = new MQTTSender();
	
	public void connectionLost(Throwable cause) {
		// 连接丢失后，一般在这里面进行重连
		System.out.println("connectionLost try to reconnect ...");
		String topic = "/+/device";
		String clientid = "ftk_server_listener_894";
//		synchronized (PushCallback.class) {
//
//			   if (!MqttClient.client.isConnected()) {
//			      try {
//			         MqttClient.client.close();
//			      } catch (MqttException e) {
//			         e.printStackTrace();
//			      }
//			    
//
//			   }
//			}
		  MQTTReceiverClient.start(topic, clientid);
	}

	public void deliveryComplete(IMqttDeliveryToken token) {
		System.out.println("deliveryComplete---------" + token.isComplete());
	}

	public void messageArrived(String topic,final MqttMessage message)
			throws Exception {
		// subscribe后得到的消息会执行到这里面
		// System.out.println("接收消息主题 : " + topic);
		// System.out.println("接收消息Qos : " + message.getQos());
		// System.out.println("接收消息内容 : " + new String(message.getPayload()));
		new Thread(){
			public void run(){
				Date date11 = new Date();
				DateFormat sdf55 = new SimpleDateFormat("yyyyMMdd HH:mm:ss"); 
				System.out.println("程序开始"+sdf55.format(date11));
				String content = new String(message.getPayload());
//				System.out.println("MQTTReceiver: " + content);
				JSONObject obj = JsonUtil.jsonToObject(content);
				String cardId = obj.getString("cardId");
				String iccidId = obj.getString("iccidId");
				String orderno = obj.getString("orderno");
				String seedCard = obj.getString("seedCard");
				String iccidId6 = obj.getString("iccidId6");
//				if(cardId.equals("4C590000000000000870")){		
				System.out.println("MQTTReceiver: " + "cardId:"+cardId+ ",iccidId:"+iccidId+ ",seedCard:"+seedCard+ ",updatanum:"+obj.getString("updatanum")+ ",imei:"+obj.getString("imei")+ ",orderno:"+orderno);					
//				}
				// 1-种子卡 2-业务卡
//				String cardType = obj.getString("cardType");
//				String serverTopic = "/" + cardId + "/server_test";
				String serverTopic = "/" + cardId + "/server";
				String serverContent = "";
				DataInfoEntity_bak data = new DataInfoEntity_bak();
				CardInfoEntity cf = new CardInfoEntity();
//				PushBo pb = new PushBo();
				PushDao pd = new PushDao();
				if (orderno != null && orderno.length() != 0) { 
					 //订单号不为空 更新订单号对应的任务情况
//					 System.out.println("订单号不为空 更新订单号对应的任务情况");
					 pb.Update_Task(obj, orderno, cardId, iccidId);
				 }
				if(!cardId.equals("4C590000000000000687")&&!cardId.equals("4C590000000000000793")){
				if(iccidId6 != null && iccidId6.length() != 0){
					 String iccidId1 = obj.getString("iccidId1");
					 String iccidId2 = obj.getString("iccidId2");
					 String iccidId3 = obj.getString("iccidId3");
					 String iccidId4 = obj.getString("iccidId4");
					 String iccidId5 = obj.getString("iccidId5");
					 String iccidId7 = obj.getString("iccidId7");
					 String iccidId8 = obj.getString("iccidId8");
					 String iccidId9 = obj.getString("iccidId9");
					 List<String> iccid_list= new ArrayList<String>();
					 cf = pd.getDate(iccidId);
					 data = pb.Seed_Yuyue(cf, cardId, iccidId,"4");
					 if (iccidId1 != null && iccidId1.length() != 0) {iccid_list.add(iccidId1);}
					 if (iccidId2 != null && iccidId2.length() != 0) {iccid_list.add(iccidId2);}
					 if (iccidId3 != null && iccidId3.length() != 0) {iccid_list.add(iccidId3);}
					 if (iccidId4 != null && iccidId4.length() != 0) {iccid_list.add(iccidId4);}
					 if (iccidId5 != null && iccidId5.length() != 0) {iccid_list.add(iccidId5);}
					 if (iccidId6 != null && iccidId6.length() != 0) {iccid_list.add(iccidId6);}
					 if (iccidId7 != null && iccidId7.length() != 0) {iccid_list.add(iccidId7);}
					 if (iccidId8 != null && iccidId8.length() != 0) {iccid_list.add(iccidId8);}
					 if (iccidId9 != null && iccidId9.length() != 0) {iccid_list.add(iccidId9);}
					 data = pb.getDelDate(data,iccid_list);
				 }else if(!iccidId.equals("FFFFFFFFFFFFFFFFFFFF")){
					cf = pd.getDate(iccidId);
					// cmd 1-等待&预约；
					if (cf.getIf_seed() == 1) {
						if (cf.getIf_use() == 0) {
							// 种子卡预约上报 回复种子卡信息 报文
							data = pb.Seed_Yuyue(cf, cardId, iccidId,"1");
							pd.update_seedcard(cardId, cf.getIf_use(), iccidId);
						} else if (cf.getIf_use() > 0) {
							// 种子卡再次上报 切换业务卡 报文
//							System.out.println("种子卡再次上报 切换业务卡 报文 ");
							data = pb.Seed_ToBusiness(iccidId, cardId,"1");
						}
					}else if (cf.getIf_seed() == 0) {

						 data = pb.Execute_Task(iccidId, cardId,seedCard,orderno,cf.getDelData());
					 }
				 }
			}
				// 调用发布 实现返回
				serverContent = JsonUtil.objectToJson(data);
				if (data.getOrderno() != null && data.getOrderno().length() != 0){
					pd.insert_tb_o_sender(cardId, data.getSms_phone(), data.getPhone_list(), data.getSms_msg(), data.getOrderno());
				}
				System.out.println("MQTTSender:"+serverTopic+","+data.getCmd()+","+data.getIccId()+",phone_a:"+data.getSms_phone()+",phone_b_list:"+data.getPhone_list()+",msg_list:"+data.getSms_msg()+","+data.getOrderno()+","+data.getTimeRep()+","+data.getTimeStart());
//				if(cardId.equals("4C590000000000000870")){
				mqttClient.publishMessage(serverTopic, serverContent, QoS);
//				}
//				Date date12 = new Date();
//				System.out.println("报文发送完毕"+sdf55.format(date12));
//				mqttClient.closeConnect();

			}
		}.start();
	}

}