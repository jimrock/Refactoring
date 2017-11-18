package com.refactor.homework;

import java.util.List;

public class GildedRose {

    private List<Item> items = null;

    public void updateQuality() {
        for (int i = 0; i < getItems().size(); i++) {
            if ((!"Aged Brie".equals(getItems().get(i).getName())) && !"Backstage passes to a TAFKAL80ETC concert".equals(getItems().get(i).getName())) {
                if (getItems().get(i).getQuality() > 0) {
                    if (!"Sulfuras, Hand of Ragnaros".equals(getItems().get(i).getName())) {
                        getItems().get(i).setQuality(getItems().get(i).getQuality() - 1);
                    }
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

            if (!"Sulfuras, Hand of Ragnaros".equals(getItems().get(i).getName())) {
                getItems().get(i).setSellIn(getItems().get(i).getSellIn() - 1);
            }

            if (getItems().get(i).getSellIn() < 0) {
                if (!"Aged Brie".equals(getItems().get(i).getName())) {
                    if (!"Backstage passes to a TAFKAL80ETC concert".equals(getItems().get(i).getName())) {
                        if (getItems().get(i).getQuality() > 0) {
                            if (!"Sulfuras, Hand of Ragnaros".equals(getItems().get(i).getName())) {
                                getItems().get(i).setQuality(getItems().get(i).getQuality() - 1);
                            }
                        }
                    } else {
                        getItems().get(i).setQuality(getItems().get(i).getQuality() - getItems().get(i).getQuality());
                    }
                } else {
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