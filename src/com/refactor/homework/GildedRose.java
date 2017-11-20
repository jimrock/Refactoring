package com.refactor.homework;

import java.util.List;

public class GildedRose {

    private List<Item> items = null;

    public void updateQuality() {
        for (int i = 0; i < getItems().size(); i++) {
            Item item = getItems().get(i);
            getItemStrategyInstance(item).update(item);
        }
    }

    private ItemStrategy getItemStrategyInstance(Item item) {
        return item.getItemStrategy();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}