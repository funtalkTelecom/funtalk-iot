package com.funtalk.receiverold.entity;

import java.util.ArrayList;

public class PhoneBEntity {
	
	private String msg; 
	private ArrayList<String> phone_list;
	private ArrayList<String> msg_list ;
	private String work_no;
	private String employee_id;
	private String task_id;
	public String getWork_no() {
		return work_no;
	}
	public void setWork_no(String work_no) {
		this.work_no = work_no;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public ArrayList<String> getPhone_list() {
		return phone_list;
	}
	public void setPhone_list(ArrayList<String> phone_list) {
		this.phone_list = phone_list;
	}
	public ArrayList<String> getMsg_list() {
		return msg_list;
	}
	public void setMsg_list(ArrayList<String> msg_list) {
		this.msg_list = msg_list;
	}
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	

	

}
