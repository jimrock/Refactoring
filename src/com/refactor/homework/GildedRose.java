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
            if (("+5 Dexterity Vest".equals(getItems().get(i).getName())) || "Elixir of the Mongoose".equals(getItems().get(i).getName()) || "Conjured Mana Cake".equals(getItems().get(i).getName())) {
                if (getItems().get(i).getQuality() > 0) {
                    getItems().get(i).setQuality(getItems().get(i).getQuality() - 1);
                }
            } else {
                if (getItems().get(i).getQuality() < 50) {
                    getItems().get(i).setQuality(getItems().get(i).getQuality() + 1);

                    if ("Backstage passes to a TAFKAL80ETC concert".equals(getItems().get(i).getName())) {
                        if (getItems().get(i).getSellIn() < 11) {
                            if (getItems().get(i).getQuality() < 50) {
                                getItems().get(i).setQuality(getItems().get(i).getQuality() + 1);
                            }
                        }

                        if (getItems().get(i).getSellIn() < 6) {
                            if (getItems().get(i).getQuality() < 50) {
                                getItems().get(i).setQuality(getItems().get(i).getQuality() + 1);
                            }
                        }
                    }
                }
            }

            getItems().get(i).setSellIn("Sulfuras, Hand of Ragnaros".equals(getItems().get(i).getName()) ? getItems().get(i).getSellIn() : getItems().get(i).getSellIn() - 1);

            if (getItems().get(i).getSellIn() < 0) {
                if (("+5 Dexterity Vest".equals(getItems().get(i).getName())) || "Elixir of the Mongoose".equals(getItems().get(i).getName()) || "Conjured Mana Cake".equals(getItems().get(i).getName())) {
                    if (getItems().get(i).getQuality() > 0) {
                        getItems().get(i).setQuality(getItems().get(i).getQuality() - 1);
                    }
                }
                if ("Backstage passes to a TAFKAL80ETC concert".equals(getItems().get(i).getName())) {
                    getItems().get(i).setQuality(getItems().get(i).getQuality() - getItems().get(i).getQuality());
                }
                if ("Aged Brie".equals(getItems().get(i).getName())) {
                    if (getItems().get(i).getQuality() < 50) {
                        getItems().get(i).setQuality(getItems().get(i).getQuality() + 1);
                    }
                }
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