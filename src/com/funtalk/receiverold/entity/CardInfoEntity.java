package com.funtalk.receiverold.entity;

import java.util.ArrayList;

public class CardInfoEntity {
	
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
	private String service_kind = ""; 
	private String seed_iccid = "";
	private String city_a = "";
	private int if_seed;
	private int if_use;
	private int use_cnt;
	private int msg_cnt;
	private String service_id = "";
	private int total_use;
	// private ArrayList<String> phone_list = null;	//:{"p1":"���պ���1",p2:"���պ���2",...}
	private ArrayList<String> phone_list = null;	//:{"p1":"���պ���1",p2:"���պ���2",...}
	private String sms_msg = ""; 			// :"���Ͷ�������"
	private String task_id="";
	private String cust_id="";


	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getService_kind() {
		return service_kind;
	}
	public void setService_kind(String service_kind) {
		this.service_kind = service_kind;
	}
	public ArrayList<String> getPhone_list() {
		return phone_list;
	}
	public void setPhone_list(ArrayList<String> phone_list) {
		this.phone_list = phone_list;
	}
	public String getSms_msg() {
		return sms_msg;
	}
	public void setSms_msg(String sms_msg) {
		this.sms_msg = sms_msg;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	
	public int getTotal_use() {
		return total_use;
	}
	public void setTotal_use(int total_use) {
		this.total_use = total_use;
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
	public String getSeed_iccid() {
		return seed_iccid;
	}
	public void setSeed_iccid(String seed_iccid) {
		this.seed_iccid = seed_iccid;
	}
	public String getCity_a() {
		return city_a;
	}
	public void setCity_a(String city_a) {
		this.city_a = city_a;
	}
	public String getService_id() {
		return service_id;
	}
	public void setService_id(String service_id) {
		this.service_id = service_id;
	}
	public int getIf_seed() {
		return if_seed;
	}
	public void setIf_seed(int if_seed) {
		this.if_seed = if_seed;
	}
	public int getIf_use() {
		return if_use;
	}
	public void setIf_use(int if_use) {
		this.if_use = if_use;
	}
	public int getUse_cnt() {
		return use_cnt;
	}
	public void setUse_cnt(int use_cnt) {
		this.use_cnt = use_cnt;
	}
	public int getMsg_cnt() {
		return msg_cnt;
	}
	public void setMsg_cnt(int msg_cnt) {
		this.msg_cnt = msg_cnt;
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
	 

}
