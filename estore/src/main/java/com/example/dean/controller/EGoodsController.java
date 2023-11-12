package com.example.dean.controller;

import com.example.dean.model.EGoods;
import com.example.dean.service.EGoodsService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/e-goods/")
@RequiredArgsConstructor
public class EGoodsController {
    private final EGoodsService service;

    @GetMapping("")
    public List<EGoods> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    EGoods getById(@PathVariable int id){
        return service.getById(id);
    }

    @DeleteMapping("{id}")
    void del(@PathVariable int id){
        service.del(id);
    }
    @PostMapping()
    void create(@RequestBody EGoods eGoods){
        service.create(eGoods);
    }
    @PutMapping()
    void update(@RequestBody EGoods eGoods){
       service.update(eGoods);
    }

}
