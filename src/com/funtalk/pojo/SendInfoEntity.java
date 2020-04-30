package com.funtalk.pojo;

import java.util.ArrayList;

public class SendInfoEntity {
	
	private String cardId = ""; 
	private String iccId = "";
	private String iccId1 = "";
	private String iccId2 = "";
	private String iccId3 = "";
	private String iccId4 = "";
	private String iccId5 = "";
	private String iccId6 = "";
	private String iccId7 = "";
	private String iccId8 = "";
	private String iccId9 = "";
	private String cmd = "";
	private String addData1 = "";
	private String addData2 = "";
	private String addData3 = "";
	private String addData4 = "";
	private String addData5 = "";
	private String addData6 = "";
	private String addData7 = "";
	private String addData8 = "";
	private String addData9 = "";
	private String addData10 = ""; 
	private String changeData = "";
	private String delData = "";
	private String delData1 = "";
	private String delData2 = "";
	private String delData3 = "";
	private String delData4 = "";
	private String delData5 = "";
	private String delData6 = "";
	private String delData7 = "";
	private String delData8 = "";
	private String delData9 = "";
	private String seedCardData = "";
	private String timeStart = "";
	private String timeRep = "";
	private String netword_type="";
	// 短信下发内容相关
	private String orderno = ""; 			//:"任务编号"（以下消息有短信任务才有）
	private String sms_phone = "";		//:"业务号码"
	private String service_kind = "";    	//  (7:移动、8:电信、9联通)
	private String Phone_Cnt = "";
	private ArrayList<String> phone_list = null;	//:{"p1":"接收号码1",p2:"接收号码2",...}
	private String message_Cnt="";
	private ArrayList<String> sms_msg = null;	//:{"m1":"短信内容1",m2:"短信内容2",...}
	private String lastDel = "";


	
	public String getLastDel() { return lastDel; }
	public void setLastDel(String lastDel) {
		this.lastDel = lastDel;
	}
	public String getMessage_Cnt() {
		return message_Cnt;
	}
	public void setMessage_Cnt(String message_Cnt) {
		this.message_Cnt = message_Cnt;
	}
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public String getSms_phone() { return sms_phone; }
	public void setSms_phone(String sms_phone) {
		this.sms_phone = sms_phone;
	}
	public String getService_kind() {
		return service_kind;
	}
	public void setService_kind(String service_kind) {
		this.service_kind = service_kind;
	}
	public String getPhone_Cnt() {
		return Phone_Cnt;
	}
	public void setPhone_Cnt(String phone_Cnt) {
		Phone_Cnt = phone_Cnt;
	}
	public ArrayList<String> getPhone_list() {
		return phone_list;
	}
	public void setPhone_list(ArrayList<String> phone_list) {
		this.phone_list = phone_list;
	}
	public ArrayList<String> getSms_msg() {
		return sms_msg;
	}
	public void setSms_msg(ArrayList<String> sms_msg) {
		this.sms_msg = sms_msg;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getIccId() {
		return iccId;
	}
	public void setIccId(String iccId) {
		this.iccId = iccId;
	}
	public String getCmd() {
		return cmd;
	}
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	public String getAddData1() {
		return addData1;
	}
	public void setAddData1(String addData1) {
		this.addData1 = addData1;
	}
	public String getAddData2() {
		return addData2;
	}
	public void setAddData2(String addData2) {
		this.addData2 = addData2;
	}
	public String getAddData3() {
		return addData3;
	}
	public void setAddData3(String addData3) {
		this.addData3 = addData3;
	}
	public String getAddData4() {
		return addData4;
	}
	public void setAddData4(String addData4) {
		this.addData4 = addData4;
	}
	public String getAddData5() {
		return addData5;
	}
	public void setAddData5(String addData5) {
		this.addData5 = addData5;
	}
	public String getAddData6() {
		return addData6;
	}
	public void setAddData6(String addData6) {
		this.addData6 = addData6;
	}
	public String getAddData7() {
		return addData7;
	}
	public void setAddData7(String addData7) {
		this.addData7 = addData7;
	}
	public String getAddData8() {
		return addData8;
	}
	public void setAddData8(String addData8) {
		this.addData8 = addData8;
	}
	public String getAddData9() {
		return addData9;
	}
	public void setAddData9(String addData9) {
		this.addData9 = addData9;
	}
	public String getAddData10() {
		return addData10;
	}
	public void setAddData10(String addData10) {
		this.addData10 = addData10;
	}
	public String getChangeData() {
		return changeData;
	}
	public void setChangeData(String changeData) {
		this.changeData = changeData;
	}
	public String getDelData() {
		return delData;
	}
	public void setDelData(String delData) {
		this.delData = delData;
	}
	public String getSeedCardData() {
		return seedCardData;
	}
	public void setSeedCardData(String seedCardData) {
		this.seedCardData = seedCardData;
	}
	public String getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}
	public String getTimeRep() {
		return timeRep;
	}
	public void setTimeRep(String timeRep) {
		this.timeRep = timeRep;
	}
	public String getDelData1() {
		return delData1;
	}
	public void setDelData1(String delData1) {
		this.delData1 = delData1;
	}
	public String getDelData2() {
		return delData2;
	}
	public void setDelData2(String delData2) {
		this.delData2 = delData2;
	}
	public String getDelData3() {
		return delData3;
	}
	public void setDelData3(String delData3) {
		this.delData3 = delData3;
	}
	public String getDelData4() {
		return delData4;
	}
	public void setDelData4(String delData4) {
		this.delData4 = delData4;
	}
	public String getDelData5() {
		return delData5;
	}
	public void setDelData5(String delData5) {
		this.delData5 = delData5;
	}
	public String getDelData6() {
		return delData6;
	}
	public void setDelData6(String delData6) {
		this.delData6 = delData6;
	}
	public String getDelData7() {
		return delData7;
	}
	public void setDelData7(String delData7) {
		this.delData7 = delData7;
	}
	public String getDelData8() {
		return delData8;
	}
	public void setDelData8(String delData8) {
		this.delData8 = delData8;
	}
	public String getDelData9() {
		return delData9;
	}
	public void setDelData9(String delData9) {
		this.delData9 = delData9;
	}
	public String getIccId1() {
		return iccId1;
	}
	public void setIccId1(String iccId1) {
		this.iccId1 = iccId1;
	}
	public String getIccId2() {
		return iccId2;
	}
	public void setIccId2(String iccId2) {
		this.iccId2 = iccId2;
	}
	public String getIccId3() {
		return iccId3;
	}
	public void setIccId3(String iccId3) {
		this.iccId3 = iccId3;
	}
	public String getIccId4() {
		return iccId4;
	}
	public void setIccId4(String iccId4) {
		this.iccId4 = iccId4;
	}
	public String getIccId5() {
		return iccId5;
	}
	public void setIccId5(String iccId5) {
		this.iccId5 = iccId5;
	}
	public String getIccId6() {
		return iccId6;
	}
	public void setIccId6(String iccId6) {
		this.iccId6 = iccId6;
	}
	public String getIccId7() {
		return iccId7;
	}
	public void setIccId7(String iccId7) {
		this.iccId7 = iccId7;
	}
	public String getIccId8() {
		return iccId8;
	}
	public void setIccId8(String iccId8) {
		this.iccId8 = iccId8;
	}
	public String getIccId9() {
		return iccId9;
	}
	public void setIccId9(String iccId9) {
		this.iccId9 = iccId9;
	}
	public String getNetword_type() {
		return netword_type;
	}
	public void setNetword_type(String netword_type) {
		this.netword_type = netword_type;
	}
	 

	public void setIccidDel(int i,String iccId, String del){

		if (i ==1) {this.setIccId1(iccId); this.setDelData1(del);}
		if (i ==2) {this.setIccId2(iccId); this.setDelData2(del);}
		if (i ==3) {this.setIccId3(iccId); this.setDelData3(del);}
		if (i ==4) {this.setIccId4(iccId); this.setDelData4(del);}
		if (i ==5) {this.setIccId5(iccId); this.setDelData5(del);}
		if (i ==6) {this.setIccId6(iccId); this.setDelData6(del);}
		if (i ==7) {this.setIccId7(iccId); this.setDelData7(del);}
		if (i ==8) {this.setIccId8(iccId); this.setDelData8(del);}
		if (i ==9) {this.setIccId9(iccId); this.setDelData9(del);}


	}

}
