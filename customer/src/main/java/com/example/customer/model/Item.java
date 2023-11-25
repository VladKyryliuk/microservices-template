package com.example.customer.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Item {
    @Id
    private String id;
    private String nameProduct;
    private double price;
    private int quantity;
}
