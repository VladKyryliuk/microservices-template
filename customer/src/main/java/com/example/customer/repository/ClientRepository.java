package com.example.customer.repository;

import com.example.customer.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends MongoRepository<Client,Integer> {
    List<Client> findByBasket_Items_NameProduct(String nameProduct);
}
