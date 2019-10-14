package com.hakuna.consumer.controller;

import com.hakuna.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liuy
 * @date: 2019-09-29
 * @time: 19:15
 * @descripttion: com.hakuna.consumer.controller
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/hi")
    public String sayHi(String message){
        return consumerService.sayHi(message);
    }
}
