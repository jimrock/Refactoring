package com.refactor.homework;

public class ElixirMongooseStrategy extends ItemStrategy {


    public static final String TYPE = "Elixir of the Mongoose";

    @Override
    void updateQuality(Item item) {
        item.setQuality(item.getQuality() > 0 ? item.getQuality() - 1 : item.getQuality());
    }

    @Override
    void updateQualityForNegativeSellIn(Item item) {
        this.updateQuality(item);
    }
}
