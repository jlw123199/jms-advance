package com.xl.serviceconfigconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ServiceConfigConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConfigConsumerApplication.class, args);
    }

}
