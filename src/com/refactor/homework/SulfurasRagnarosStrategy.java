package com.refactor.homework;

public class SulfurasRagnarosStrategy extends ItemStrategy {

    public static final String TYPE = "Sulfuras, Hand of Ragnaros";

    @Override
    void updateQuality(Item item) {
        item.setQuality(item.getQuality() < 50 ? item.getQuality() + 1 : item.getQuality());
    }

    @Override
    void updateSellIn(Item item) {
    }

    ;

    @Override
    void updateQualityForNegativeSellIn(Item item) {
    }
}
