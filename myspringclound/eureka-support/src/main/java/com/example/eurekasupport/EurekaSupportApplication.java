package com.example.eurekasupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaSupportApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSupportApplication.class, args);
    }

}
