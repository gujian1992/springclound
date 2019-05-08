package com.example.eurekafeign.feign;

import org.springframework.stereotype.Component;

@Component
public class EurekaClientFeignFallback implements EurekaClientFeign {
    @Override
    public String sayHiFromSupport(String id) {
        return "aaaaaaaaaaaaaa";
    }
}
