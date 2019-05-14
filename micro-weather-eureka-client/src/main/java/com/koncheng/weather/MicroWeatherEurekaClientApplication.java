package com.koncheng.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroWeatherEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherEurekaClientApplication.class, args);
    }

}
