package com.refactor.homework;

public class ElixirMongooseStrategy extends ItemStrategy {


    public static final String TYPE = "Elixir of the Mongoose";

    @Override
    void updateQuality(Item item) {
        decreaseOneQuality(item);
    }

    @Override
    void updateQualityForNegativeSellIn(Item item) {
        decreaseOneQuality(item);
    }
}
