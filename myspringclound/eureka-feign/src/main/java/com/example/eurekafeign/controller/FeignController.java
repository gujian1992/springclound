package com.example.eurekafeign.controller;

import com.example.eurekafeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;
    @RequestMapping(value ="/hi/{id}" )
    public String getSayHi(@PathVariable("id") String id){

return feignService.getHiFromSupport(id);
    }
}
