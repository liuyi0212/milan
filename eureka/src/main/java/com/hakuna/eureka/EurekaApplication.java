package com.hakuna.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: liuy
 * @date: 2019-09-29
 * @time: 16:26
 * @descripttion: com.hakuna.eureka
 */
@SpringBootApplication
//开启Eureka服务
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
