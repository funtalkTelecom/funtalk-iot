package com.funtalk.receiverold.sender;

import org.eclipse.paho.client.mqttv3.MqttException;

public class MQTTSenderClient  { 
	
	public static void main(String[] args) throws InterruptedException, MqttException { 
		MQTTSender mqttClient = new MQTTSender();
//		mqttClient.cleanTopic("/98680066014105406163/device");
//		1�����ӿ��ϱ�
//		mqttClient.publishMessage("/98683081451020660699/device_feidian", 
//				"{\"cardId\":\"20190328100943000001\",\"iccidId\":\"98683081451020660699\",\"cardType\":\"1\",\"signalLevel\":4}", 1);
//		mqttClient.publishMessage("/4C590000000000000010/device_feidian_t", 
//				"{\"cardId\":\"4C590000000000000010\",\"iccidId\":\"98683081451020660699\",\"cardType\":\"1\",\"signalLevel\":4}", 1);
		
//		mqttClient.publishMessage("/4C590000000000000010/device_feidian_t", 
//				"{\"cardId\":\"4C590000000000000010\",\"iccidId\":\"98683081451020660699\",\"iccidId1\":\"98683091452015831761\"," +
//				"\"iccidId2\":\"98683091452015831780\",\"iccidId3\":\"98683091452015831718\",\"iccidId4\":\"98683091452015832770\"," +
//				"\"iccidId5\":\"98683091452015836607\",\"iccidId6\":\"98683091452015836669\",\"cardType\":\"1\",\"signalLevel\":4}", 1);
//		2��ҵ���ϱ�
// 				
		mqttClient.publishMessage("/20190328100943000001/device", 
 						"{\"cardId\":\"20190328100000001\",\"iccidId\":\"98683081451020660618\",\"cardType\":\"2\"}", 1);
//		mqttClient.publishMessage("/4C590000000000000010/device_feidian_t", 
//			"{\"cardId\":\"4C590000000000000010\",\"iccidId\":\"98683091452015836645\",\"cardType\":\"2\"}", 1);
//		
		//3��ҵ�񿨷��ط��ͽ��
//		mqttClient.publishMessage("/89860319540251393841/device1", 
//				"{\"cardId\":\"20190328100943000001\",\"iccidId\":\"89860319540251393858\",\"cardType\":\"2\"," +
//				"\"orderno\":\"20190716171528000001\"," +
//				"\"result_list\":{\"18500377727\":\"0\"}}", 1);  
//		mqttClient.publishMessage("/4C590000000000000010/device_feidian_t", 
//		"{\"cardId\":\"4C590000000000000010\",\"iccidId\":\"98683091452015836645\",\"cardType\":\"2\"," +
//		"\"orderno\":\"20190721170235000001\"," +
//		"\"result_list\":{\"17188731152\":\"0\",\"17188731211\":\"0\" }}", 1);  
		//4��ҵ���޷��ؽ��
//		mqttClient.publishMessage("/98683081451020660618/device", 
//					"{\"cardId\":\"20190328100943000001\",\"iccidId\":\"98683081451020660618\",\"cardType\":\"2\"}", 1);  
//		
		mqttClient.closeConnect();
	}
	
}