package com.pengtao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableEurekaClient
public class PaymentHestrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHestrixMain80.class,args);
    }
}