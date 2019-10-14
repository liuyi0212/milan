package com.hakuna.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: liuy
 * @date: 2019-09-29
 * @time: 16:59
 * @descripttion: com.hakuna.producer
 */
@SpringBootApplication
//标明自己是一个Eureka Client
@EnableEurekaClient
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}