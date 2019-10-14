package com.hakuna.feign.service;

import com.hakuna.feign.service.impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: liuy
 * @date: 2019-09-30
 * @time: 09:50
 * @descripttion: com.hakuna.feign.service
 */
@FeignClient(value = "producer", fallback = FeignServiceImpl.class)
public interface FeignService {
    @GetMapping("/hi")
    String sayHi(@RequestParam(value = "message") String message);
}
