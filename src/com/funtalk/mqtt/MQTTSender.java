package com.funtalk.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient; 
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
  
public class MQTTSender  {
 
	private MqttClient mqttClient = null;
	private MemoryPersistence memoryPersistence = null;
	private MqttConnectOptions mqttConnectOptions = null;
	public static final String HOST = "tcp://weixin.funtalk.cn:1883"; 
	public static String clientID = "ftk_server_pub";
	   
	public MQTTSender() {
		//初始化连接设置对象
		mqttConnectOptions = new MqttConnectOptions();
		//初始化MqttClient
		if(null != mqttConnectOptions) {
			//			true可以安全地使用内存持久性作为客户端断开连接时清除的所有状态
			mqttConnectOptions.setCleanSession(true);
			//			设置连接超时
			mqttConnectOptions.setConnectionTimeout(60);
			//			设置持久化方式
			memoryPersistence = new MemoryPersistence();
			if(null != memoryPersistence && null != clientID) {
				try {
					mqttClient = new MqttClient( HOST, clientID, memoryPersistence );   // 1883
				} catch (MqttException e) { 
					e.printStackTrace();
				}
			}else {
				
			}
		}else {
			System.out.println("MQTTSender mqttConnectOptions is null");
		}
		
		// System.out.println(mqttClient.isConnected());
		//设置连接和回调
		if(null != mqttClient) {
			if(!mqttClient.isConnected()) { 
				//			创建回调函数对象
				MQTTCallback mqttReceriveCallback = new MQTTCallback();
				//			客户端添加回调函数
				mqttClient.setCallback(mqttReceriveCallback);
				//			创建连接
				try {
					// System.out.println("创建连接");
					mqttClient.connect(mqttConnectOptions);
				} catch (MqttException e) { 
					e.printStackTrace();
				} 
			}
		}else {
			System.out.println("MQTTSender mqttClient is null");
		}
		// System.out.println(mqttClient.isConnected());
	}
	
	//	关闭连接
	public void closeConnect() {
		//关闭存储方式
		if(null != memoryPersistence) {
			try {
				memoryPersistence.close();
			} catch (MqttPersistenceException e) { 
				e.printStackTrace();
			}
		}else {
			System.out.println("MQTTSender closeConnect memoryPersistence is null");
		}
		
		//		关闭连接
		if(null != mqttClient) {
			if(mqttClient.isConnected()) {
				try {
					mqttClient.disconnect();
					mqttClient.close();
				} catch (MqttException e) { 
					e.printStackTrace();
				}
			}else {
				System.out.println("MQTTSender closeConnect mqttClient is not connect");
			}
		}else {
			System.out.println("MQTTSender closeConnect mqttClient is null...");
		}
	}
	
	//	发布消息
	public void publishMessage(String pubTopic, String message, int qos) {
		if(null != mqttClient&& mqttClient.isConnected()) { 
			MqttMessage mqttMessage = new MqttMessage();
			mqttMessage.setQos(qos);
			mqttMessage.setPayload(message.getBytes()); 
			MqttTopic topic = mqttClient.getTopic(pubTopic);
			
			if(null != topic) {
				try {
					MqttDeliveryToken publish = topic.publish(mqttMessage);
					if(!publish.isComplete()) {
					//	System.out.println("MQTTSender: " + topic.getName()+ "," + new String(mqttMessage.getPayload()) );
						System.out.println("MQTTSender: " + topic.getName()+ " send message successfully.");
					}
				} catch (MqttException e) { 
					e.printStackTrace();
				}
			}
			
		}else {
			reConnect(); 
		} 
	}
	
	//	重新连接
	public void reConnect() {
		if(null != mqttClient) {
			if(!mqttClient.isConnected()) {
				if(null != mqttConnectOptions) {
					try {
						mqttClient.connect(mqttConnectOptions);
					} catch (MqttException e) { 
						e.printStackTrace();
					}
				}else {
					System.out.println("MQTTSender reConnect mqttConnectOptions is null");
				}
			}else {
				System.out.println("MQTTSender reConnect mqttClient is null or connect");
			}
		} 
	}
	
	//	订阅主题
	public void subTopic(String topic) {
		if(null != mqttClient&& mqttClient.isConnected()) {
			try {
				mqttClient.subscribe(topic, 1);
			} catch (MqttException e) { 
				e.printStackTrace();
			}
		}else {
			System.out.println("MQTTSender subTopic mqttClient is error");
		}
	}
	 
	//	清空主题
	public void cleanTopic(String topic) {
		if(null != mqttClient&& !mqttClient.isConnected()) {
			try {
				mqttClient.unsubscribe(topic);
			} catch (MqttException e) { 
				e.printStackTrace();
			}
		}else {
			System.out.println("MQTTSender cleanTopic mqttClient is error");
		}
	}
 
} 