package com.refactor.homework;

public class DexterityVestStrategy extends ItemStrategy {

    public static final String TYPE = "+5 Dexterity Vest";

    @Override
    protected void updateQuality(Item item) {
        decreaseOneQuality(item);
    }

    @Override
    protected void updateQualityForNegativeSellIn(Item item) {
        decreaseOneQuality(item);
    }

}
