package com.refactor.homework;

public abstract class ItemStrategy {

    void update(Item item) {
        this.updateQuality(item);
        this.updateSellIn(item);
        if (item.getSellIn() < 0) {
            this.updateQualityForNegativeSellIn(item);
        }
    }

    void updateSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }

    abstract void updateQuality(Item item);

    abstract void updateQualityForNegativeSellIn(Item item);
}
