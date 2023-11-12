package com.example.customer.service;

import com.example.customer.DTO.EGoodsDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
@RequiredArgsConstructor
public class CustomerService {
    private final String ESTORE_BASE_URL = "http://localhost:8070/api/v1/e-goods/";

    private final RestTemplate restTemplate;
    public ResponseEntity<EGoodsDTO> getEGoodById(int id){
        String url = ESTORE_BASE_URL + id;
        return restTemplate.exchange(url, HttpMethod.GET,null,EGoodsDTO.class);
    }
}
