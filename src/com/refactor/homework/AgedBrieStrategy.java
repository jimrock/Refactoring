package com.refactor.homework;

public class AgedBrieStrategy extends ItemStrategy {

    public static final String TYPE = "Aged Brie";

    @Override
    protected void updateQuality(Item item) {
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

    @Override
    protected void updateQualityForNegativeSellIn(Item item) {
        if (item.getSellIn() < 0) {
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
}
