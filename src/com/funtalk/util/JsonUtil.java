package com.funtalk.util;

import com.alibaba.fastjson.JSONObject;
 

public class JsonUtil {

	public static String objectToJson(Object obj) { 
		return JSONObject.toJSONString(obj); 
	}
	 
	public static JSONObject jsonToObject(String jsonStr) {
		try{
			return (JSONObject) JSONObject.parse(jsonStr);
		}catch(Exception e){
			return null;
		}
	}
	
}
