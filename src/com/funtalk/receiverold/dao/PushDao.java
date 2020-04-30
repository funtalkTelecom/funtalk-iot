package com.funtalk.receiverold.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import com.funtalk.receiverold.entity.CardInfoEntity;
import com.funtalk.receiverold.entity.DataInfoEntity_bak;
import com.funtalk.receiverold.entity.PhoneBEntity;
import com.funtalk.util.IOTDBConnect_bak;
import com.funtalk.util.constant.Constant;

public class PushDao {

	public static IOTDBConnect_bak iotdbConnect = new IOTDBConnect_bak();

	public void update_seedcard(String cardId, int if_use, String iccidId) {

		Connection conn = IOTDBConnect_bak.getConnection();

		String insert_sql = "update tb_s_phone set card_id='" + cardId + "',if_use=" + (if_use + 1) + " where iccid='"
				+ iccidId + "'";
		iotdbConnect.updateData(conn, insert_sql);
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update_card(String cardId, String iccidId, String iccid_a, String changeData) {

		Connection conn = IOTDBConnect_bak.getConnection();

		String insert_sql = "update iot_card_info_t set if_use=1,cardid='" + cardId + "',seedCardData=(select "
				+ changeData + " from (select " + changeData + " from iot_card_info_t where iccid='" + iccidId
				+ "') t )" + " where iccid='" + iccid_a + "'";
		iotdbConnect.updateData(conn, insert_sql);
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update_usecnt(String service_id, int cnt, int total_cnt) {

		Connection conn = IOTDBConnect_bak.getConnection();
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr1 = sdf.format(date.getTime());
		String insert_sql = "update tb_o_phone set send_time='" + dateStr1 + "', day_used=" + cnt + ",month_used="
				+ total_cnt + " where service_id='" + service_id + "'";
		iotdbConnect.updateData(conn, insert_sql);
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update_ifuse(String iccidId) {

		Connection conn = IOTDBConnect_bak.getConnection();

		String insert_sql = "update tb_s_phone set if_use='0',now_use=null where iccid='" + iccidId + "'";
		iotdbConnect.updateData(conn, insert_sql);
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert_task(CardInfoEntity cf, PhoneBEntity pb, String iccidId, String orderno, String cardId,
			String task_id, String cust_id) {

		Connection conn = IOTDBConnect_bak.getConnection();

		String insert_sql = "insert into tb_s_subtask_result"
				+ "(phone_a,task_id,cust_id, iccid_a, service_kind_a,city_a,phone_b,msg,if_send,cardId,orderno,work_no,employee_id)  "
				+ "values";
		ArrayList<String> phone_b_list = pb.getPhone_list();
		ArrayList<String> msg_list = pb.getMsg_list();
		String work_no = pb.getWork_no();
		String employee_id = pb.getEmployee_id();
		for (int i = 0; i < phone_b_list.size(); i++) {
			insert_sql = insert_sql + "('" + cf.getService_id() + "','" + task_id + "','" + cust_id + "','" + iccidId
					+ "','" + cf.getService_kind() + "','" + cf.getCity_a() + "','" + phone_b_list.get(i) + "','"
					+ msg_list.get(i) + "','" + "1" + "','" + cardId + "','" + orderno + "'" + ",' " + work_no + "',"
					+ "'" + employee_id + "'),";

		}
//		for (int i = 0; i < msg_list.size(); i++) {
//			insert_sql = insert_sql+"('"
//					+cf.getService_id()+"','"
//					+task_id+"','"
//					+cust_id+"','"
//					+iccidId+"','"
//					+cf.getService_kind()+"','"	
//					+cf.getCity_a()+"','"	
//					+phone_b_list.get(0)+"','"	
//					+msg_list.get(i)+"','" 
//					+"1"+"','"
//					+cardId+"','"
//					+orderno+"'),";
//	}
		iotdbConnect.updateData(conn, insert_sql.substring(0, insert_sql.length() - 1));
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public CardInfoEntity getDate(String iccidId) {
		// ��ȡ������
//		Date date8 = new Date();
//		DateFormat sdf456 = new SimpleDateFormat("yyyyMMddHH:mm:ss"); 
		CardInfoEntity vo = new CardInfoEntity();
		String select_sql = "SELECT  seedCardData,changeData,delData,if_seed,if_use,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10  "
				+ "FROM  tb_s_phone   " + "where iccid='" + iccidId + "'";

		Connection conn = IOTDBConnect_bak.getConnection();
		ResultSet rs = iotdbConnect.getData(conn, select_sql);

		try {
			if (rs.next()) {
				vo.setSeedCardData(rs.getString("seedCardData"));
				vo.setChangeData(rs.getString("changeData"));
				vo.setDelData(rs.getString("delData"));
				vo.setIf_seed(rs.getInt("if_seed"));
				vo.setIf_use(rs.getInt("if_use"));
				vo.setAddData1(rs.getString("data1"));
				vo.setAddData2(rs.getString("data2"));
				vo.setAddData3(rs.getString("data3"));
				vo.setAddData4(rs.getString("data4"));
				vo.setAddData5(rs.getString("data5"));
				vo.setAddData6(rs.getString("data6"));
				vo.setAddData7(rs.getString("data7"));
				vo.setAddData8(rs.getString("data8"));
				vo.setAddData9(rs.getString("data9"));
				vo.setAddData10(rs.getString("data10"));
			} else {
				System.out.println("��iccid������");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			rs.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	public CardInfoEntity get_card(String iccidId) {
		// ��ȡ������
		CardInfoEntity vo = new CardInfoEntity();
		String select_sql = "select a.service_kind,a.service_id,a.city_code,b.day_limit,b.day_used,b.month_used,b.task_id,c.cust_id from tb_s_phone a,tb_o_phone b,tb_s_subtask c where a.service_id=b.service_id and b.task_id=c.sub_id and a.iccid='"
				+ iccidId + "' and b.send_time<DATE_SUB(NOW(),INTERVAL " + Constant.time + " minute)";

		Connection conn = IOTDBConnect_bak.getConnection();

		ResultSet rs = iotdbConnect.getData(conn, select_sql);
		try {
			if (rs.next()) {
				vo.setService_kind(rs.getString("service_kind"));
				vo.setService_id(rs.getString("service_id"));
				vo.setCity_a(rs.getString("city_code"));
				vo.setMsg_cnt(rs.getInt("day_limit"));
				vo.setUse_cnt(rs.getInt("day_used"));
				vo.setTotal_use(rs.getInt("month_used"));
				vo.setTask_id(rs.getString("task_id"));
				vo.setCust_id(rs.getString("cust_id"));
			} else {
//				System.out.println("tb_o_phoneû��ICCID��¼");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			rs.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	public String serach_card_two(String cardId, String iccidId) {
//		CardInfoEntity cf = new CardInfoEntity();
		Connection conn = IOTDBConnect_bak.getConnection();

		String select_sql = "select iccid from tb_s_phone a,tb_o_phone b where a.service_id=b.service_id and a.if_seed = 0 and a.service_id is not null and a.city_code != 'ceshi'  and a.if_use = 0 and b.day_used<b.day_limit and b.month_used<b.package_count  and b.task_id=(select sub_id from tb_s_subtask where state='0' order by  create_time limit 1) and b.send_time<DATE_SUB(NOW(),INTERVAL "
				+ Constant.time + " minute)  ORDER BY RAND() limit 1";
		ResultSet rs = iotdbConnect.getData(conn, select_sql);
		String iccid = "";
		try {
			if (rs.next()) {
				iccid = rs.getString("iccid");
				String insert_sql = "update tb_s_phone set if_use=1,now_use='" + iccidId + "',card_id='" + cardId
						+ "',seedCardData=(select  changeData  from (select changeData from tb_s_phone where iccid='"
						+ iccidId + "') t )" + " where iccid='" + iccid + "'";
				iotdbConnect.updateData(conn, insert_sql);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iccid;
	}

	public String serach_card_one(String cardId, String iccidId) {
//		CardInfoEntity cf = new CardInfoEntity();
		Connection conn = IOTDBConnect_bak.getConnection();

		String select_sql = "select iccid from tb_s_phone a,tb_o_phone b where a.service_id=b.service_id and a.if_seed = 0 and a.service_id is not null and a.city_code != 'ceshi'  and a.if_use = 1 and b.day_used<b.day_limit and now_use='"
				+ iccidId
				+ "' and b.task_id=(select sub_id from tb_s_subtask where state='0' order by  create_time limit 1) and b.send_time<DATE_SUB(NOW(),INTERVAL "
				+ Constant.time + " minute) limit 1";
		ResultSet rs = iotdbConnect.getData(conn, select_sql);
		String iccid = "";
		try {
			if (rs.next()) {
				iccid = rs.getString("iccid");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iccid;
	}

	public PhoneBEntity search_task(int cnt, String p_task_id) {
		PhoneBEntity cf = new PhoneBEntity();

		Connection conn = IOTDBConnect_bak.getConnection();
		// String select_sql = "select nid,phone_b,msg from tb_s_subtask where if_use=0
		// and task_id='"+task_id+"' limit "+cnt;
		String select_sql = "select task_id,phone_b,msg,work_no,employee_id from tb_s_subtask where  state=0 and sub_id='"
				+ p_task_id + "'  limit 1";
		String kw_sql = "select * from tb_p_keywords";
		ResultSet rs = iotdbConnect.getData(conn, select_sql);
		ResultSet rs_ = iotdbConnect.getData(conn, kw_sql);
		HashMap<String, String> map = new HashMap<>();
		// try. �����ݿ����滻�ؼ��ֵ�key-value����map
		try {
			while (rs_.next()) {

				map.put(rs_.getString(1), rs_.getString(2));
			}
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		ArrayList<String> pList = new ArrayList<String>();
		ArrayList<String> mList = new ArrayList<String>();
		String phone_b = null;
		String task_id = "";
		String str = "";
		String msg = "";
		String work_no = "";
		String employee_id = "";
		Date date4 = new Date();
		DateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		int n = 1;
		String l = (int) ((Math.random() * 9 + 1) * 100000) + "";
		Character k;
		Character ka = null;
		String ks1;
		String ks2;
		char[] msgchar;
		try {
			if (rs.next()) {
				task_id = rs.getString("task_id");
				phone_b = rs.getString("phone_b");
				msg = rs.getString("msg");
				msgchar = msg.toCharArray();
				work_no = rs.getString("work_no");
				employee_id = rs.getString("employee_id");

				mList.add(msg);
				pList.add(phone_b);
				str = str + "'" + task_id + "',";
			}
			if (str != null && str.length() != 0) {
				String insert_sql = "update tb_s_subtask set state='1'" + " where task_id in("
						+ str.substring(0, str.length() - 1) + ")";
				iotdbConnect.updateData(conn, insert_sql);
			}
			cf.setPhone_list(pList);
			cf.setMsg_list(mList);
			cf.setWork_no(work_no);
			cf.setEmployee_id(employee_id);
//			�ӵ�
			cf.setTask_id(task_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cf;
	}

	public DataInfoEntity_bak repeat_msg(String iccidId, DataInfoEntity_bak data) {

		Connection conn = IOTDBConnect_bak.getConnection();
		String select_sql = "select phone_b,msg,phone_a,orderno,service_kind_a from tb_s_subtask_result where if_send = 33 and iccid_a='"
				+ iccidId + "' order by create_time limit 3" ;
		ResultSet rs = iotdbConnect.getData(conn, select_sql);
		String service_kind_a = "";
		String msg = "";
		String phone_a = "";
		String orderno = "";
		String update_sql = "";
		ArrayList<String> pList = new ArrayList<String>();
		ArrayList<String> mList = new ArrayList<String>();
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr1 = sdf.format(date.getTime());
		try {
			while (rs.next()) {
				phone_a = rs.getString("phone_a");
				msg = rs.getString("msg");
				service_kind_a = rs.getString("service_kind_a");
				orderno = rs.getString("orderno");
				pList.add(rs.getString("phone_b"));
				mList.add(msg);
			}
			if (orderno != null && orderno.length() != 0) {
				update_sql = "update tb_o_phone set send_time='" + dateStr1 + "' where service_id='" + phone_a + "'";
				iotdbConnect.updateData(conn, update_sql);
			}
			data.setOrderno(orderno);
			data.setSms_phone(phone_a);
			data.setService_kind(service_kind_a);
			data.setPhone_Cnt(pList.size() + "");
			data.setPhone_list(pList);
//			byte[] smsContent = msg.getBytes();
//			String smsMsg = new String(smsContent, "utf-8");
			data.setSms_msg(mList);
			data.setMessage_Cnt(mList.size() + "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			rs.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public void insert_tb_o_receive(String cardId, String iccidId, String orderno, String result_list) {

		Connection conn = IOTDBConnect_bak.getConnection();

		String insert_sql = "insert into tb_o_receive(card_id,iccid,orderno,result_list) value('" + cardId + "','"
				+ iccidId + "','" + orderno + "','" + result_list + "')";
		iotdbConnect.updateData(conn, insert_sql);
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert_tb_o_sender(String cardId, String phone_a, ArrayList<String> phone_b, ArrayList<String> msg,
			String orderno) {

		Connection conn = IOTDBConnect_bak.getConnection();

		String insert_sql = "insert into tb_o_sender(card_id,phone_a,phone_b,msg,orderno) value('" + cardId + "','"
				+ phone_a + "','" + phone_b + "','" + msg + "','" + orderno + "')";
		iotdbConnect.updateData(conn, insert_sql);
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
