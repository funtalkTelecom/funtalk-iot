package com.funtalk.receiverold.bo;
 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;

import java.util.Date;
import java.util.Iterator;

import com.funtalk.receiverold.entity.CardInfoEntity;
import com.funtalk.receiverold.entity.DataInfoEntity;
import com.funtalk.util.IOTDBConnect;
import com.funtalk.util.JsonUtil;
import com.funtalk.receiverold.dao.PushDao;
public class PushBo_bak {

	public DataInfoEntity Seed_Yuyue(CardInfoEntity cf,String cardId,String iccidId, String cmd){
		DataInfoEntity data = new DataInfoEntity();
		data.setCardId(cardId);
		data.setCmd(cmd);
		data.setIccId(iccidId);
		data.setSeedCardData(cf.getSeedCardData());
		if (cf.getAddData1() != null && cf.getAddData1().length() != 0) {data.setAddData1(cf.getAddData1());}
		if (cf.getAddData2() != null && cf.getAddData2().length() != 0) {data.setAddData2(cf.getAddData2());}
		if (cf.getAddData3() != null && cf.getAddData3().length() != 0) {data.setAddData3(cf.getAddData3());}
		if (cf.getAddData4() != null && cf.getAddData4().length() != 0) {data.setAddData4(cf.getAddData4());}
		if (cf.getAddData5() != null && cf.getAddData5().length() != 0) {data.setAddData5(cf.getAddData5());}
		if (cf.getAddData6() != null && cf.getAddData6().length() != 0) {data.setAddData6(cf.getAddData6());}
		if (cf.getAddData7() != null && cf.getAddData7().length() != 0) {data.setAddData7(cf.getAddData7());}
		if (cf.getAddData8() != null && cf.getAddData8().length() != 0) {data.setAddData8(cf.getAddData8());}
		if (cf.getAddData9() != null && cf.getAddData9().length() != 0) {data.setAddData9(cf.getAddData9());}
		if (cf.getAddData10() != null && cf.getAddData10().length() != 0) {data.setAddData10(cf.getAddData10());}
		data.setChangeData(cf.getChangeData());
		data.setDelData(cf.getDelData());
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
		String dateStr1 = sdf.format(date.getTime() + 1 * 1000 * 1);
		String dateStr2 = sdf.format(date.getTime() + 60 * 1000 * 1);
//		String dateStr1 = sdf.format(date.getTime() + 3 * 1000 * 1);
//		String dateStr2 = sdf.format(date.getTime() + 3 * 1000 * 1);
		data.setTimeStart(dateStr1);
		data.setTimeRep(dateStr2);
		return data;
	} 
	
	public DataInfoEntity Seed_ToBusiness(String iccidId,String cardId,String cmd){
		CardInfoEntity cf = new CardInfoEntity();
		DataInfoEntity data = new DataInfoEntity();
		PushDao pd = new PushDao();
		String iccid_a  = pd.serach_card_one(cardId, iccidId);
		if (iccid_a!= null && iccid_a.length() != 0) {
//			pd.update_card(cardId, iccidId, iccid_a,changeData);
			cf = pd.getDate(iccid_a);
			data = Seed_Yuyue(cf,cardId,iccid_a,"2");
		}else{
			String iccid_a_bak  = pd.serach_card_two(cardId, iccidId);
			if (iccid_a_bak!= null && iccid_a_bak.length() != 0) {
	//			pd.update_card(cardId, iccidId, iccid_a,changeData);
				cf = pd.getDate(iccid_a_bak);
				data = Seed_Yuyue(cf,cardId,iccid_a_bak,"2");
			} else {
				cf = pd.getDate(iccidId);
	//				data = Seed_Yuyue(cf,cardId,iccidId,"1");
				data = Seed_Yuyue(cf,cardId,iccidId,cmd);
			}
		}
		return data;
	} 
	
	
	public void Update_Task(JSONObject obj,String orderno,String cardId,String iccidId){
//		 DataInfoEntity data = new DataInfoEntity();
		 String resultString =obj.getString("result_list"); 
		 System.out.println("cardId=" +cardId + ",orderno=" + orderno);
		 System.out.println("resultString=" + resultString );
		 JSONObject resObjects = JsonUtil.jsonToObject( resultString); 
		 Iterator<String> resultSet =resObjects.keySet().iterator(); 
		 IOTDBConnect dataConn = new IOTDBConnect();
		 while(resultSet.hasNext()){
		     String key = resultSet.next();
			 String value =resObjects.getString(key);
			 String insert_sql = null;
			 System.out.println("key=" + key +",value=" + value); 
			 Date date = new Date(); 
			 DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // һ����֮���ٴν���
			 String dateStr12 = sdf.format(date.getTime());
			 if(value.equals("0")){
				 insert_sql = "update iot_sms_task_t set if_send=2,send_date='" +
						 dateStr12 +
				 		"' where orderno='"
						+ orderno
						+ "' and phone_b='"+
						key +
						"'";
			 }else if(value.equals("1")){
				 insert_sql = "update iot_sms_task_t set if_send=-1,send_date='" +
						 	dateStr12 +
				 			"' where orderno='"
							+ orderno
							+ "' and phone_b='"+
							key +
							"'";
			 }else{
				 insert_sql = "update iot_sms_task_t set if_send=-2,err_msg='" +
						 	value +
				 			"',send_date='" +
						 	dateStr12 +
				 			"' where orderno='"
							+ orderno
							+ "' and phone_b='"+
							key +
							"'";
			 }
			 if( insert_sql != null ) { dataConn.updateData(insert_sql); }	
			} 
//		 data = Execute_Task(iccidId, cardId);
//		 return data;
	} 
	
	public DataInfoEntity Execute_Task(String iccidId,String cardId,String seedCard){

	    CardInfoEntity cf = new CardInfoEntity();
		DataInfoEntity data = new DataInfoEntity();
		PushDao pd =  new PushDao();


		try {

			cf = pd.get_card(iccidId);

			pd.update_usecnt(iccidId, cf.getMsg_cnt(), 0);

			String iccid_a  = pd.serach_card_one(cardId, seedCard);
			if (iccid_a!= null && iccid_a.length() != 0) {
				pd.update_ifuse(iccidId);
				cf = pd.getDate(iccid_a);
				data = Seed_Yuyue(cf,cardId,iccid_a,"2");
			}else{
				String iccid_a_bak  = pd.serach_card_two(cardId,seedCard);
				if (iccid_a_bak!= null && iccid_a_bak.length() != 0) {
					pd.update_ifuse(iccidId);
					cf = pd.getDate(iccid_a_bak);
					data = Seed_Yuyue(cf,cardId,iccid_a_bak,"2");
				} else {
					cf = pd.getDate(iccidId);
					data = Seed_Yuyue(cf,cardId,iccidId,"3");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
}
