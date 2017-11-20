package com.refactor.homework;

public class ItemStrategy {

    void update(Item item) {
        this.updateQuality(item);
        this.updateSellIn(item);
        if (item.getSellIn() < 0) {
            this.updateQualityForNegativeSellIn(item);
        }
    }

    void updateSellIn(Item item) {
        item.setSellIn("Sulfuras, Hand of Ragnaros".equals(item.getName()) ? item.getSellIn() : item.getSellIn() - 1);
    }

    void updateQuality(Item item) {
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

    void updateQualityForNegativeSellIn(Item item) {
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
}
