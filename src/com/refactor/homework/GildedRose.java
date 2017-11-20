package com.refactor.homework;

import java.util.List;

public class GildedRose {

    private List<Item> items = null;

    //+5 Dexterity Vest
    //Aged Brie
    //Elixir of the Mongoose
    //Sulfuras, Hand of Ragnaros
    //Backstage passes to a TAFKAL80ETC concert
    //Conjured Mana Cake
    public void updateQuality() {
        for (int i = 0; i < getItems().size(); i++) {
            Item item = getItems().get(i);
            item.update();
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}