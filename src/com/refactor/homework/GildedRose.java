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
            updateQuality(item);
            updateSellIn(item);
            if (item.getSellIn() < 0) {
                updateQualityForNegativeSellIn(item);
            }
        }
    }

    private void updateQuality(Item item) {
        if (("+5 Dexterity Vest".equals(item.getName())) || "Elixir of the Mongoose".equals(item.getName()) || "Conjured Mana Cake".equals(item.getName())) {
            if (item.getQuality() > 0) {
                item.setQuality(item.getQuality() - 1);
            }
        } else {
            if (item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);

                if ("Backstage passes to a TAFKAL80ETC concert".equals(item.getName())) {
                    if (item.getSellIn() < 11) {
                        if (item.getQuality() < 50) {
                            item.setQuality(item.getQuality() + 1);
                        }
                    }

                    if (item.getSellIn() < 6) {
                        if (item.getQuality() < 50) {
                            item.setQuality(item.getQuality() + 1);
                        }
                    }
                }
            }
        }
    }

    private void updateSellIn(Item item) {
        item.setSellIn("Sulfuras, Hand of Ragnaros".equals(item.getName()) ? item.getSellIn() : item.getSellIn() - 1);
    }

    private void updateQualityForNegativeSellIn(Item item) {
        if (("+5 Dexterity Vest".equals(item.getName())) || "Elixir of the Mongoose".equals(item.getName()) || "Conjured Mana Cake".equals(item.getName())) {
            if (item.getQuality() > 0) {
                item.setQuality(item.getQuality() - 1);
            }
        }
        if ("Backstage passes to a TAFKAL80ETC concert".equals(item.getName())) {
            item.setQuality(item.getQuality() - item.getQuality());
        }
        if ("Aged Brie".equals(item.getName())) {
            if (item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
            }
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}