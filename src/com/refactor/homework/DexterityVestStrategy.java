package com.refactor.homework;

public class DexterityVestStrategy extends ItemStrategy {

    public static final String TYPE = "+5 Dexterity Vest";

    @Override
    protected void updateQuality(Item item) {
        item.setQuality(item.getQuality() > 0 ? item.getQuality() - 1 : item.getQuality());
    }

    @Override
    protected void updateQualityForNegativeSellIn(Item item) {
        item.setQuality((item.getSellIn() < 0 && item.getQuality() > 0) ? item.getQuality() - 1 : item.getQuality());
    }

}
