package com.example.customer.service;

import com.example.customer.DTO.EGoodsDTO;
import com.example.customer.model.Basket;
import com.example.customer.model.Client;
import com.example.customer.model.Item;
import com.example.customer.repository.ClientRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository repository;
    private final CustomerService customerService;
//    @PostConstruct
    void init(){

    }

    public Client createClient(String name, String numberPhone, List<Integer> eGoodsIds) {
        Client client = new Client();
        client.setName(name);
        client.setNumberPhone(numberPhone);

        Basket basket = new Basket();
        List<Item> items = new ArrayList<>();

        for (int eGoodsId : eGoodsIds) {
            ResponseEntity<EGoodsDTO> eGoodsResponse = customerService.getEGoodById(eGoodsId);

            if (eGoodsResponse.getStatusCode().is2xxSuccessful()) {
                EGoodsDTO eGoodsDTO = eGoodsResponse.getBody();

                Item item = new Item();
                item.setId(UUID.randomUUID().toString());
                item.setNameProduct(eGoodsDTO.getNameProduct());
                item.setPrice(eGoodsDTO.getPrice());
                item.setQuantity(1);

                items.add(item);
            }
        }

        basket.setItems(items);
        client.setBasket(basket);

        return repository.save(client);
    }
    public List<Client> getAll(){
       return repository.findAll();
    }

    public List<String> ClientWhoHavePhone(String productName){
        List<Client> clients = repository.findByBasket_Items_NameProduct(productName);
        List<String> ClientsName = clients.stream().map(client -> client.getName()).toList();
        return ClientsName;
    }

}
