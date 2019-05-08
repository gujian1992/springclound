package com.example.eurekasupport.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
     String port;
   @RequestMapping(value = "/hi")
    public String index(@RequestParam("id") String id){
        return "hi "+id+",i am from port:"+port;
    }



}
