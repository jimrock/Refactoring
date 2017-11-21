package com.refactor.homework;

public class ConjuredCakeStrategy extends ItemStrategy {


    public static final String TYPE = "Conjured Mana Cake";

    @Override
    void updateQuality(Item item) {
        decreaseOneQuality(item);
    }

    @Override
    void updateQualityForNegativeSellIn(Item item) {
        decreaseOneQuality(item);
    }
}
