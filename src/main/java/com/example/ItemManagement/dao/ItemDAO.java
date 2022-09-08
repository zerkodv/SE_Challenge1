package com.example.ItemManagement.dao;
import com.example.ItemManagement.model.Item;
import com.example.ItemManagement.model.Items;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ItemDAO {

    private static Items list = new Items();

    static
    {
        list.getItemList().add(new Item("1", "TehBotol", "Jasmine tea", "/tehbotol",12.00));

    }

    public Items getAllItems()
    {
        return list;
    }
    public Item getItem(String id){

        for(Item item: list.getItemList()){
            if(item.getId().equals(id)){
                return item;

            }
        }return null;
    }

    public void addItem(Item item) {
        list.getItemList().add(item);
    }
    public void deleteItem(String id){
        list.getItemList().removeIf(e -> e.getId().equals(id));
    }

    public void updateItem(String id, Item itemupdate){
        int index= 0;
        for(Item item: list.getItemList()){
            if(item.getId().equals(id)){
                break;

            }else{
                index = index + 1;
            }

        }list.getItemList().set(index, itemupdate);
    }
}
