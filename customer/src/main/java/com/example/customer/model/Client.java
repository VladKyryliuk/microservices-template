package com.example.customer.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Client {
    @Id
    private String id;
    private String name;
    private String numberPhone;
    private Basket basket;
}
