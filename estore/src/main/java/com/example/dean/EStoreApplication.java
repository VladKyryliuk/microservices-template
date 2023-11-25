package com.example.dean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(EStoreApplication.class, args);
    }

}
