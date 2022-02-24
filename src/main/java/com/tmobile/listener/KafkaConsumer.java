package com.tmobile.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.tmobile.datamodel.InteractionId;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "Kafka_Example_json", containerFactory = "userKafkaListenerFactory")
	public void consumeJson(InteractionId interactionId) {
		System.out.println("Consumed JSON Message: " + interactionId);
		
		//call Astra DB Api using interaction Id
		//TODO
		//Apply Drool Engine Rools 
		//TODO
		// save decision back to Astra DB
		//TODO
	}

}
