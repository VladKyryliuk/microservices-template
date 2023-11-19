package com.example.dean.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "customer-client",url="${application.config.customer-url}")
public interface CustomerClient {
    @GetMapping("GetClientsWhoHavePhone/{productName}")
    List<String> clientFromCustomer(@PathVariable String productName);


}
