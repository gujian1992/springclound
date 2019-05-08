package com.example.eurekafeign.service;

import com.example.eurekafeign.feign.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignService {
    @Autowired
    private EurekaClientFeign eurekaClientFeign;
    public String getHiFromSupport(String id){
        return eurekaClientFeign.sayHiFromSupport(id);
    }

}
