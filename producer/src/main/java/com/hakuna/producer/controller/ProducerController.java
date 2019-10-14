package com.hakuna.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liuy
 * @date: 2019-09-29
 * @time: 17:42
 * @descripttion: com.hakuna.producer.controller
 */
@RestController
public class ProducerController {
    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String sayHi(@RequestParam(value = "message", defaultValue = "defaultMessage") String message) {
        return String.format("Hi, your message is ：%s i am from port ：%s", message, port);
    }
}