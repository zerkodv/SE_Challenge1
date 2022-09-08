package com.example.ItemManagement.controller;

import com.example.ItemManagement.dao.ItemDAO;
import com.example.ItemManagement.model.Item;
import com.example.ItemManagement.model.Items;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/item")
public class ItemController {

    @Autowired
    private ItemDAO itemDAO;

    @GetMapping(produces = "application/json")
    public Items getItems()
    {
        return itemDAO.getAllItems();
    }
    @GetMapping(path = "/{id}")
    public Item getItemsList(@PathVariable String id){
        return itemDAO.getItem(id);
    }
    @PostMapping(consumes = "application/json", produces = "application/json")
    public void addItem(

            @RequestBody Item item)
            throws Exception
    {
        //Generate resource id
        Integer id = itemDAO.getAllItems().getItemList().size() + 1;
        item.setId(String.valueOf(id));

        //add resource
        itemDAO.addItem(item);


    }





}
