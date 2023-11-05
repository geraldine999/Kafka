package com.example.kafkaexample2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public Controller(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping
    public void sendMessage(){
        kafkaTemplate.send("HelloTopic", "Hola!! 😀");
    }
}
