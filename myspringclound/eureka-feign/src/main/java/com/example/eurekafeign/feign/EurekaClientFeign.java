package com.example.eurekafeign.feign;

import com.example.eurekafeign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "eureka-service",configuration = FeignConfig.class,fallback = EurekaClientFeignFallback.class)
public interface EurekaClientFeign {
    @GetMapping(value = "/hi")
    String sayHiFromSupport(@RequestParam("id") String id
    );

}