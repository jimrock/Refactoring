package com.refactor.homework;

public class AgedBrieStrategy extends ItemStrategy {

    public static final String TYPE = "Aged Brie";

    @Override
    protected void updateQuality(Item item) {
        item.setQuality(item.getQuality() < 50 ? item.getQuality() + 1 : item.getQuality());
    }

    @Override
    protected void updateQualityForNegativeSellIn(Item item) {
        this.updateQuality(item);
    }
}
