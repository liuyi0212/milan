package com.hakuna.feign.service.impl;

import com.hakuna.feign.service.FeignService;
import org.springframework.stereotype.Service;

/**
 * @author: liuy
 * @date: 2019-09-30
 * @time: 11:26
 * @descripttion: com.hakuna.feign.service.impl
 */
@Service
public class FeignServiceImpl implements FeignService {
    @Override
    public String sayHi(String message) {
        return String.format("Hi your message is ：%s but request bad", message);
    }

}
