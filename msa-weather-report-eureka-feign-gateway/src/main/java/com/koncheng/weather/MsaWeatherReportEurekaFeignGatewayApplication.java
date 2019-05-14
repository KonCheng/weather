package com.koncheng.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MsaWeatherReportEurekaFeignGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaWeatherReportEurekaFeignGatewayApplication.class, args);
    }

}