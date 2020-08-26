package com.codeaches.kafka.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Autowired
    MyKafkaProducer myKafkaProducer;

    @GetMapping("/send")
    public void sendDataToKafka(@RequestParam String data) {
        myKafkaProducer.sendDataToKafka(data);
    }
}
