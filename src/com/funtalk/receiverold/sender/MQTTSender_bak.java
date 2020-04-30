package com.funtalk.receiverold.sender;

import org.eclipse.paho.client.mqttv3.MqttClient; 
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
  
public class MQTTSender_bak  {
 
	private static  MqttClient mqttClient = null;
	private static  MqttConnectOptions mqttConnectOptions = null;

	public static String HOST = "tcp://weixin.funtalk.cn:1883";
	public static String clientID = "ftk_server_pub";


	public static synchronized MqttClient getConnInstance(){

		if(mqttClient !=null && !mqttClient.isConnected()){

			try {
				mqttClient.close();
				mqttClient=null;

			}catch (Exception e){

			}

		}

		if (mqttClient==null){

				//鍒濆鍖栬繛鎺ヨ缃璞�
				mqttConnectOptions = new MqttConnectOptions();

				//true鍙互瀹夊叏鍦颁娇鐢ㄥ唴瀛樻寔涔呮�浣滀负瀹㈡埛绔柇寮�繛鎺ユ椂娓呴櫎鐨勬墍鏈夌姸鎬�
				mqttConnectOptions.setCleanSession(true);

				//璁剧疆杩炴帴瓒呮椂
				mqttConnectOptions.setConnectionTimeout(60);

				//璁剧疆鎸佷箙鍖栨柟寮�
				mqttConnectOptions.setKeepAliveInterval(20);
				
				mqttConnectOptions.setMaxInflight(100);

				try {

						mqttClient = new MqttClient( HOST, clientID, new MemoryPersistence());   // 1883

					//璁剧疆杩炴帴鍜屽洖璋�
					if(!mqttClient.isConnected()) {
						//	鍒涘缓鍥炶皟鍑芥暟瀵硅薄
						MQTTCallback mqttReceriveCallback = new MQTTCallback();
						//	瀹㈡埛绔坊鍔犲洖璋冨嚱鏁�
						mqttClient.setCallback(mqttReceriveCallback);
						//	鍒涘缓杩炴帴
						mqttClient.connect(mqttConnectOptions);

					}

				} catch (MqttException e) {
					e.printStackTrace();
				}

			}
		

		return mqttClient;
	}


	//	鍏抽棴杩炴帴
	public void closeConnect() {

		if(mqttClient !=null && mqttClient.isConnected()) {
				try {
					mqttClient.disconnect();
					mqttClient.close();
					mqttClient=null;
				} catch (MqttException e) { 
					e.printStackTrace();
				}
			}

	}
	
	//	鍙戝竷娑堟伅
	public void publishMessage(String pubTopic, String message, int qos) {

		if(mqttClient == null || !mqttClient.isConnected())
			mqttClient=getConnInstance();

			MqttMessage mqttMessage = new MqttMessage();
			mqttMessage.setQos(qos);
			mqttMessage.setPayload(message.getBytes()); 
			MqttTopic topic = mqttClient.getTopic(pubTopic);
			
			if(null != topic) {
				try {
					MqttDeliveryToken publish = topic.publish(mqttMessage);
//					if(!publish.isComplete()) { 
//						System.out.println("MQTTSender: " + topic.getName()+ "," + new String(mqttMessage.getPayload()) );
//					}
				} catch (MqttException e) { 
					e.printStackTrace();
				}
			}
			

	}
 
} 