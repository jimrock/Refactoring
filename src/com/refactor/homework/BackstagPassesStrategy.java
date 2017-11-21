package com.refactor.homework;

public class BackstagPassesStrategy extends ItemStrategy {


    public static final String TYPE = "Backstage passes to a TAFKAL80ETC concert";

    @Override
    void updateQuality(Item item) {
        increaseOneQuality(item);
        item.setQuality((item.getSellIn() < 11 && item.getQuality() < 50) ? item.getQuality() + 1 : item.getQuality());
        item.setQuality((item.getSellIn() < 6 && item.getQuality() < 50) ? item.getQuality() + 1 : item.getQuality());
    }

    @Override
    void updateQualityForNegativeSellIn(Item item) {
        item.setQuality(0);
    }
}
