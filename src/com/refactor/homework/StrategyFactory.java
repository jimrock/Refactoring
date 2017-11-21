package com.refactor.homework;

public class StrategyFactory {
    //+5 Dexterity Vest
    //Aged Brie
    //Elixir of the Mongoose
    //Sulfuras, Hand of Ragnaros
    //Backstage passes to a TAFKAL80ETC concert
    //Conjured Mana Cake
    public static ItemStrategy createStrategyInstance(Item item) {
        if (DexterityVestStrategy.TYPE.equals(item.getName())) {
            return new DexterityVestStrategy();
        }
        if (AgedBrieStrategy.TYPE.equals(item.getName())) {
            return new AgedBrieStrategy();
        }
        if (ElixirMongooseStrategy.TYPE.equals(item.getName())) {
            return new ElixirMongooseStrategy();
        }
        if (SulfurasRagnarosStrategy.TYPE.equals(item.getName())) {
            return new SulfurasRagnarosStrategy();
        }
        if (BackstagPassesStrategy.TYPE.equals(item.getName())) {
            return new BackstagPassesStrategy();
        }
        if (ConjuredCakeStrategy.TYPE.equals(item.getName())) {
            return new ConjuredCakeStrategy();
        }
        return null;
    }
}
