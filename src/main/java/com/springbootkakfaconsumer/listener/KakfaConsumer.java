package com.springbootkakfaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KakfaConsumer {

    @KafkaListener(topics = "KakfaExample2", groupId="group_id")
    public void consume(String message){
        System.out.println("consumed message :"+message);

    }
}
