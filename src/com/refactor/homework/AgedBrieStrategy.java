package com.refactor.homework;

public class AgedBrieStrategy extends ItemStrategy {

    public static final String TYPE = "Aged Brie";

    @Override
    protected void updateQuality(Item item) {
        increaseOneQuality(item);
    }

    @Override
    protected void updateQualityForNegativeSellIn(Item item) {
        increaseOneQuality(item);
    }
}
