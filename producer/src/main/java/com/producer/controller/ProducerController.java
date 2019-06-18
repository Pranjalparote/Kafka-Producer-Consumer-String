package com.producer.controller;

import com.producer.engine.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class ProducerController {

    @Autowired
    private Producer producer;

    @GetMapping("/produce")
    public ResponseEntity<String> hellokafkaproducer() {
        producer.send("hey there !!");
        return new ResponseEntity<String>("Produced !!!", HttpStatus.OK);
    }
}