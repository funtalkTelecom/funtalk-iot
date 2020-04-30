package com.funtalk.receiverold;

import java.util.ArrayList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> mlist = new ArrayList<String>();
//		mlist.add("1");
//		mlist.add("2");
//		mlist.add("3");
//		mlist.add("4");
//		mlist.add("5");
//		mlist.add("6");
//		mlist.add("7");
//		mlist.add("8");
//		mlist.add("9");
//		for (int i = 0; i < mlist.size(); i++) {
//			System.out.println(mlist.get(i));
//		}
//		Date date = new Date();
//		int n = 1;
//	    DateFormat sdf4 = new SimpleDateFormat("yyyyMMddHHmmss"); 
//	    String orderno = sdf4.format(date.getTime())+(int)((Math.random()*9+1)*100000)+""; 
//	    String msg  = "asd"+sdf4.format(date)+n;
//	    System.out.println(msg);
//		for (int i = 0; i < 50; i++) {
//			System.out.println((int)((Math.random()*9+1)*100000)+"");
//			
//		}
//		String str= "20190328100943000001";
//		System.out.println(str.substring(0, 14));
		ArrayList<String> mList = new ArrayList<String>();
		ArrayList<String> pList = new ArrayList<String>();
		String msg = "11111111111111111111111111111111111111111111111111111";
		String phone_b = "17689689763";
		String cs = "";
		 for (int i=0;i<msg.toCharArray().length;i++) {
		     if(msg.toCharArray()[i]=='2') {
		      cs+="232";
		      
		     }else if(msg.toCharArray()[i]=='1') {
		      cs+="232";
		      
		     }else {
		      cs+=msg.toCharArray()[i];
		     }
		     
		    }
	       if(cs.substring(0,cs.length()-1).contains("12")) {
	        String pre=cs.substring(0, cs.indexOf("12")+1);
	        String aft=cs.substring(cs.indexOf("12")+1,cs.length());
	        pList.add(phone_b);
	        pList.add(phone_b);
	        mList.add(pre);
	        mList.add(aft);
	       }else {
		        pList.add(phone_b);
		        mList.add(msg);
		       }
		    System.out.println(mList);
		    System.out.println(pList);
	}
	

}
