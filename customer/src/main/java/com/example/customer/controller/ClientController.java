package com.example.customer.controller;

import com.example.customer.model.Client;
import com.example.customer.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/client/")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;
    @PostMapping()
    public String create(@RequestParam String ClientName,@RequestParam String ClientNumber, @RequestParam List<Integer> itemIds) {

        clientService.createClient(ClientName,ClientNumber,itemIds);
        return "Клієнта створено";
    }

    @GetMapping("GetAllClients")
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @GetMapping("GetClientsWhoHavePhone/{productName}")
    public List<String> getAllClients(@PathVariable String productName) {
        return clientService.ClientWhoHavePhone(productName);
    }

}

