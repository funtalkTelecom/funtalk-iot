package com.funtalk.receiverold.bo;
 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.funtalk.receiverold.entity.CardInfoEntity;
import com.funtalk.receiverold.entity.DataInfoEntity_bak;
import com.funtalk.receiverold.entity.PhoneBEntity;
import com.funtalk.util.IOTDBConnect_bak;
import com.funtalk.util.JsonUtil;
import com.funtalk.receiverold.dao.*;

public class PushBo {

	public  static  IOTDBConnect_bak  iotdbConnect =new IOTDBConnect_bak();

	public DataInfoEntity_bak Seed_Yuyue(CardInfoEntity cf,String cardId,String iccidId, String cmd){
		DataInfoEntity_bak data = new DataInfoEntity_bak();
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
		data.setNetword_type("2");
		return data;
	} 
	
	public DataInfoEntity_bak getDelDate(DataInfoEntity_bak data,List<String> iccid_list){

		Connection conn= IOTDBConnect_bak.getConnection();
		ResultSet rs = null;
		String iccid_str = "";
		HashMap<String, String> hashMap = new HashMap<>();
		for (int i = 0; i < iccid_list.size(); i++) {
//			System.out.println(iccid_list.get(i));
			iccid_str = iccid_str+"'"+iccid_list.get(i)+"',";
		}
		String select_sql = "SELECT iccid,delData " + "FROM  iot_card_info_t   "
				+ "where iccid in("+iccid_str.substring(0, iccid_str.length()-1)+")";
		rs = iotdbConnect.getData(conn,select_sql);

		try {
			while(rs.next()){
				hashMap.put(rs.getString("iccid"), rs.getString("delData"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(iccid_list.size());
		if(iccid_list.size()>=1){data.setDelData1(hashMap.get(iccid_list.get(0)));data.setIccId1(iccid_list.get(0));}
		if(iccid_list.size()>=2){data.setDelData2(hashMap.get(iccid_list.get(1)));data.setIccId2(iccid_list.get(1));}
		if(iccid_list.size()>=3){data.setDelData3(hashMap.get(iccid_list.get(2)));data.setIccId3(iccid_list.get(2));}
		if(iccid_list.size()>=4){data.setDelData4(hashMap.get(iccid_list.get(3)));data.setIccId4(iccid_list.get(3));}
		if(iccid_list.size()>=5){data.setDelData5(hashMap.get(iccid_list.get(4)));data.setIccId5(iccid_list.get(4));}
		if(iccid_list.size()>=6){data.setDelData6(hashMap.get(iccid_list.get(5)));data.setIccId6(iccid_list.get(5));}
		if(iccid_list.size()>=7){data.setDelData7(hashMap.get(iccid_list.get(6)));data.setIccId7(iccid_list.get(6));}
		if(iccid_list.size()>=8){data.setDelData8(hashMap.get(iccid_list.get(7)));data.setIccId8(iccid_list.get(7));}
		if(iccid_list.size()>=9){data.setDelData9(hashMap.get(iccid_list.get(8)));data.setIccId9(iccid_list.get(8));}
		try {
			rs.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return data;
	} 
	
	public DataInfoEntity_bak Seed_ToBusiness(String iccidId,String cardId,String cmd){
		CardInfoEntity cf = new CardInfoEntity();
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
		DataInfoEntity_bak data = new DataInfoEntity_bak();
		PushDao pd = new PushDao();
		String iccid_a  = pd.serach_card_one(cardId, iccidId);
		if (iccid_a!= null && iccid_a.length() != 0) {

			cf = pd.getDate(iccid_a);
			data = Seed_Yuyue(cf,cardId,iccid_a,"2");
			data.setLastDel("");
			Date date11 = new Date();
			String dateStr2 = sdf.format(date11.getTime() + 1 * 1000 * 1);
			data.setTimeRep(dateStr2);
		}else{
			synchronized (this) {
			String iccid_a_bak  = pd.serach_card_two(cardId, iccidId);
			if (iccid_a_bak!= null && iccid_a_bak.length() != 0) {
	//			pd.update_card(cardId, iccidId, iccid_a,changeData);
				cf = pd.getDate(iccid_a_bak);
				data = Seed_Yuyue(cf,cardId,iccid_a_bak,"2");
				data.setLastDel("");
				Date date11 = new Date();
				String dateStr2 = sdf.format(date11.getTime() + 1 * 1000 * 1);
				data.setTimeRep(dateStr2);
			} else {

				cf = pd.getDate(iccidId);
	//				data = Seed_Yuyue(cf,cardId,iccidId,"1");
				data = Seed_Yuyue(cf,cardId,iccidId,cmd);
			}
			}
		}
		return data;
	} 
	
	
	public void Update_Task(JSONObject obj,String orderno,String cardId,String iccidId){
//		 DataInfoEntity_bak data = new DataInfoEntity_bak();
		 String resultString =obj.getString("result_list"); 
//		 System.out.println("cardId=" +cardId + ",orderno=" + orderno);
//		 System.out.println("resultString=" + resultString );
		 JSONObject resObjects = JsonUtil.jsonToObject( resultString); 
		 Iterator<String> resultSet =resObjects.keySet().iterator();
		 PushDao pd = new PushDao();
		 Connection conn= IOTDBConnect_bak.getConnection();

		 String insert_sql = null;
		 String success_phone = "";
		 String fail_phone = "";
		 Date date = new Date(); 
		 DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		 String dateStr12 = sdf.format(date.getTime());
		 pd.insert_tb_o_receive(cardId, iccidId, orderno, resultString);
		 while(resultSet.hasNext()){
		     String key = resultSet.next();
			 String value =resObjects.getString(key);
//			 System.out.println("key=" + key +",value=" + value); 
			 if(value.equals("0")){
				 success_phone=success_phone+"'"+key+"',";
			 }else if(value.equals("1")){
				 fail_phone=fail_phone+"'"+key+"',";
			 }else{
				 insert_sql = "update tb_s_subtask_result set if_send=-2,err_msg='" +
						 	value +
				 			"',send_date='" +
						 	dateStr12 +
				 			"' where orderno='"
							+ orderno
							+ "' and phone_b='"+
							key +
							"'";
			 }
			} 
		 if( success_phone!="") { 
			 insert_sql = "update tb_s_subtask_result set if_send=2,send_date='" +
					 dateStr12 +
			 		"' where orderno='"
					+ orderno
					+ "' and phone_b in("+(success_phone.substring(0, success_phone.length()-1))+")";
			 iotdbConnect.updateData(conn,insert_sql); }
		 if( fail_phone!="") { 
			 insert_sql = "update tb_s_subtask_result set if_send=3,send_date='" +
					 dateStr12 +
			 		"' where orderno='"
					+ orderno
					+ "' and phone_b in("+(fail_phone.substring(0, fail_phone.length()-1))+")";
			 iotdbConnect.updateData(conn,insert_sql); }
	} 
	
	public DataInfoEntity_bak Execute_Task(String iccidId,String cardId,String seedCard,String orderno_req,String deldata){
		Date date = new Date();
//		DateFormat sdf456 = new SimpleDateFormat("yyyyMMddHH:mm:ss"); 
	    CardInfoEntity cf = new CardInfoEntity();
		DataInfoEntity_bak data = new DataInfoEntity_bak();
		PhoneBEntity pb = new PhoneBEntity();
		PushDao pd =  new PushDao();
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
		ArrayList<String> pList = new ArrayList<String>();
		ArrayList<String> mList = new ArrayList<String>();
		String phone_a= null;
		String service_kind = null;
	    DateFormat sdf4 = new SimpleDateFormat("yyyyMMddHHmmss"); 
	    String orderno = sdf4.format(date.getTime())+(int)((Math.random()*9+1)*100000)+""; 
//		Date date3 = new Date();
		try {
			data = pd.repeat_msg(iccidId,data);
			if (data.getOrderno() != null && data.getOrderno().length() != 0){
				cf  = pd.getDate(iccidId);
				data.setCardId(cardId);
				data.setCmd("2");
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
				Date date12 = new Date();
				String dateStr23 = sdf.format(date12.getTime() + 1 * 1000 * 1);
				String dateStr26 = sdf.format(date12.getTime() + 1 * 1000 * 1);
				data.setTimeRep(dateStr23);
				data.setTimeStart(dateStr26);
				data.setNetword_type("2");
			}else{
				cf = pd.get_card(iccidId);
				phone_a = cf.getService_id();
				service_kind = cf.getService_kind();
				int cnt = cf.getMsg_cnt() - cf.getUse_cnt();
//				if(1>2){
				if(cnt>0){
					synchronized (this) {
					pb = pd.search_task(cnt,cf.getTask_id());
					}
					pList = pb.getPhone_list();
					mList = pb.getMsg_list();
					if(pb.getPhone_list().size()>0){
						pd.update_usecnt( cf.getService_id(), cf.getUse_cnt()+pList.size(), cf.getTotal_use()+pList.size());
//						pd.insert_task(cf, pb,iccidId,orderno,cardId,cf.getTask_id(),cf.getCust_id());
						pd.insert_task(cf, pb,iccidId,orderno,cardId,pb.getTask_id(),cf.getCust_id());
						cf  = pd.getDate(iccidId);
						data = Seed_Yuyue(cf, cardId, iccidId, "2");
						Date date11 = new Date();
						String dateStr2 = sdf.format(date11.getTime() + 15 * 1000 * 1);
						data.setTimeRep(dateStr2);
						data.setOrderno(orderno);
						data.setSms_phone(phone_a);
						data.setService_kind(service_kind);
						data.setPhone_Cnt(pList.size() + "");
						data.setPhone_list(pList);
//						byte[] smsContent = (pb.getMsg()).getBytes();
						data.setMessage_Cnt(mList.size() + "");
//						String smsMsg = new String(smsContent, "utf-8");
						data.setSms_msg(mList);
//						Date date10 = new Date();
					}else{
						String iccid_a  = pd.serach_card_one(cardId, seedCard);
						if(iccidId.equals(iccid_a)){
							cf = pd.getDate(iccidId);
							data = Seed_Yuyue(cf,cardId,iccidId,"3");
						}else{
							if (iccid_a!= null && iccid_a.length() != 0) {

								cf = pd.getDate(iccid_a);
								data = Seed_Yuyue(cf,cardId,iccid_a,"2");
								data.setLastDel(deldata);
								Date date11 = new Date();
								String dateStr2 = sdf.format(date11.getTime() + 20 * 1000 * 1);
								data.setTimeRep(dateStr2);
							}else{
								synchronized (this) {
								String iccid_a_bak  = pd.serach_card_two(cardId,seedCard);
								if (iccid_a_bak!= null && iccid_a_bak.length() != 0) {
									pd.update_ifuse(iccidId);
									cf = pd.getDate(iccid_a_bak);
									data = Seed_Yuyue(cf,cardId,iccid_a_bak,"2");
									data.setLastDel(deldata);
									Date date11 = new Date();
									String dateStr2 = sdf.format(date11.getTime() + 20 * 1000 * 1);
									data.setTimeRep(dateStr2);
								} else {
									cf = pd.getDate(iccidId);
									data = Seed_Yuyue(cf,cardId,iccidId,"3");
								}
								}
							}
						}
					}
				}else{

					String iccid_a  = pd.serach_card_one(cardId, seedCard);
					if (iccid_a!= null && iccid_a.length() != 0) {
//						pd.update_ifuse(iccidId);
						cf = pd.getDate(iccid_a);
						data = Seed_Yuyue(cf,cardId,iccid_a,"2");
						data.setLastDel(deldata);
						Date date11 = new Date();
						String dateStr2 = sdf.format(date11.getTime() + 20 * 1000 * 1);
						data.setTimeRep(dateStr2);
					}else{
						synchronized (this) {
						String iccid_a_bak  = pd.serach_card_two(cardId,seedCard);
						if (iccid_a_bak!= null && iccid_a_bak.length() != 0) {
							pd.update_ifuse(iccidId);
							cf = pd.getDate(iccid_a_bak);
							data = Seed_Yuyue(cf,cardId,iccid_a_bak,"2");
							data.setLastDel(deldata);
							Date date11 = new Date();
							String dateStr2 = sdf.format(date11.getTime() + 20 * 1000 * 1);
							data.setTimeRep(dateStr2);
						} else {
							cf = pd.getDate(iccidId);
							data = Seed_Yuyue(cf,cardId,iccidId,"3");

						}
					}
					}
			
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
}
