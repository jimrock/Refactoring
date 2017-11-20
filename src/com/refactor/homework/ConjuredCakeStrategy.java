package com.refactor.homework;

public class ConjuredCakeStrategy extends ItemStrategy {


    public static final String TYPE = "Conjured Mana Cake";

    @Override
    void updateQuality(Item item) {
        item.setQuality(item.getQuality() > 0 ? item.getQuality() - 1 : item.getQuality());
    }

    @Override
    void updateQualityForNegativeSellIn(Item item) {
        this.updateQuality(item);
    }
}
