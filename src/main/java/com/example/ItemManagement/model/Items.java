package com.example.ItemManagement.model;

import java.util.ArrayList;
import java.util.List;

public class Items {
    private List<Item> itemList;

    public List<Item> getItemList() {
        if(itemList == null) {
            itemList = new ArrayList<>();
        }
        return itemList;
    }

    public void setEmployeeList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
