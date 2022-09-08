package com.example.ItemManagement.controller;

import com.example.ItemManagement.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "item")
public class ItemController {


    @GetMapping
    public List<Item> hello(){
        return List.of(
                new Item(
                        "1",
                        "Jos",
                        "a very bussing item",
                        2.00


                )
        );
    }
}
