package com.example.dean.service;

import com.example.dean.model.EGoods;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EGoodsService {
    private List<EGoods> list = new ArrayList<>(
            Arrays.asList(
                    new EGoods(1,"Mi 11 Pro",25145.00,"Смартфон компанії Xiaomi"),
                    new EGoods(2,"Galaxy S22",23099.00,"Смартфон компанії Samsung"),
                    new EGoods(3,"Iphone 13 Pro",32100.00,"Смартфон компанії Apple"),
                    new EGoods(4,"Galaxy S23 Ultra",45599.00,"Смартфон компанії Samsung"),
                    new EGoods(5,"Pixel 6 pro",25741.00,"Смартфон компанії Google")
            )
    );
    public List<EGoods> getAll() {
        return list;
    }

    public EGoods getById(int id) {
        if(id > 0){
            return list.get(id-1);
        }
        return null;
    }

    public String del(int id) {
        list.remove(id-1);
        return "Видалено продукт за id: " + (id-1);
    }

    public String create(EGoods goods) {
        list.add(goods);
        return "Добавлено новий продукт для продажу";
    }

    public EGoods update(EGoods eGoods) {
        list.set(eGoods.getId(),eGoods);
        return eGoods;
    }
}
