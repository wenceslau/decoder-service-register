package com.ead.serviceregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DecoderServiceRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecoderServiceRegisterApplication.class, args);
    }

}
