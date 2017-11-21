package com.refactor.homework;

public class SulfurasRagnarosStrategy extends ItemStrategy {

    public static final String TYPE = "Sulfuras, Hand of Ragnaros";

    @Override
    void updateQuality(Item item) {
        increaseOneQuality(item);
    }

    @Override
    void updateSellIn(Item item) {
    }

    @Override
    void updateQualityForNegativeSellIn(Item item) {
    }
}
