package com.refactor.homework;

public class Item {
    private String name;
    private int sellIn;
    private int quality;

	ItemStrategy itemStrategy;

    public Item(String name, int sellIn, int quality) {
		this.setName(name);
		this.setSellIn(sellIn);
		this.setQuality(quality);
	}

	//+5 Dexterity Vest
	//Aged Brie
	//Elixir of the Mongoose
	//Sulfuras, Hand of Ragnaros
	//Backstage passes to a TAFKAL80ETC concert
	//Conjured Mana Cake
	public ItemStrategy getItemStrategy() {
		if (DexterityVestStrategy.TYPE.equals(getName())) {
			return new DexterityVestStrategy();
		}
		if (AgedBrieStrategy.TYPE.equals(getName())) {
			return new AgedBrieStrategy();
		}
		if (ElixirMongooseStrategy.TYPE.equals(getName())) {
			return new ElixirMongooseStrategy();
		}
		if (SulfurasRagnarosStrategy.TYPE.equals(getName())) {
			return new SulfurasRagnarosStrategy();
		}
		if (BackstagPassesStrategy.TYPE.equals(getName())) {
			return new BackstagPassesStrategy();
		}
		if (ConjuredCakeStrategy.TYPE.equals(getName())) {
			return new ConjuredCakeStrategy();
		}
		return null;
	}

	/* Generated getter and setter code */
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSellIn() {
		return sellIn;
	}
	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}

}
