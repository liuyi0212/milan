package com.hakuna.feign.controller;

import com.hakuna.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liuy
 * @date: 2019-09-30
 * @time: 09:51
 * @descripttion: com.hakuna.feign.controller
 */
@RestController
public class FeignController {
    @Autowired
    FeignService feignService;

    @GetMapping("/hi")
    public String sayHi(String message) {
        return feignService.sayHi(message);
    }
}
