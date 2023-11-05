package com.example.kafkaexample2;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "HelloTopic", groupId = "groupId")
    void listener(String data){
        System.out.println("👁 LISTENER RECEIVED: "+ data);
    }
}
