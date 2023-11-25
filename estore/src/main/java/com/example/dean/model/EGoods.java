package com.example.dean.model;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EGoods {
    private int id;
    private String nameProduct;
    private double price;
    private String description;
}
