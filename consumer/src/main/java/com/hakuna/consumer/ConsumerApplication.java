package com.hakuna.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author: liuy
 * @date: 2019-09-29
 * @time: 17:50
 * @descripttion: com.hakuna.consumer
 */
@SpringBootApplication
//开启Eureka服务
@EnableDiscoveryClient
//开启熔断器
@EnableHystrix
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}