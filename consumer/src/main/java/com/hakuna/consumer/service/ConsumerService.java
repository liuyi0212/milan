package com.hakuna.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: liuy
 * @date: 2019-09-29
 * @time: 19:10
 * @descripttion: com.hakuna.consumer.service
 */
@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message) {
        return restTemplate.getForObject("http://producer/hi?message=" + message, String.class);
    }

    public String hiError(String message) {
        return String.format("Hi your message is ：%s but request bad", message);
    }
}
