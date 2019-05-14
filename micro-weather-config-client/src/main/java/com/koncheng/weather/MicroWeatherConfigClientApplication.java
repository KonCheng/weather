package com.koncheng.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroWeatherConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherConfigClientApplication.class, args);
    }

}
