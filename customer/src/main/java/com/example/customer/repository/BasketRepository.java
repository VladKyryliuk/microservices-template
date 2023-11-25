package com.example.customer.repository;

import com.example.customer.model.Basket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository extends MongoRepository<Basket,Integer> {
}
