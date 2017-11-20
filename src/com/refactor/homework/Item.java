package com.refactor.homework;

public class Item {
    private String name;
    private int sellIn;
    private int quality;

    public Item(String name, int sellIn, int quality) {
		this.setName(name);
		this.setSellIn(sellIn);
		this.setQuality(quality);
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

    void updateSellIn() {
        setSellIn("Sulfuras, Hand of Ragnaros".equals(getName()) ? getSellIn() : getSellIn() - 1);
    }

    void updateQuality() {
        if (("+5 Dexterity Vest".equals(getName())) || "Elixir of the Mongoose".equals(getName()) || "Conjured Mana Cake".equals(getName())) {
            if (getQuality() > 0) {
                setQuality(getQuality() - 1);
            }
        } else {
            if (getQuality() < 50) {
                setQuality(getQuality() + 1);

                if ("Backstage passes to a TAFKAL80ETC concert".equals(getName())) {
                    if (getSellIn() < 11) {
                        if (getQuality() < 50) {
                            setQuality(getQuality() + 1);
                        }
                    }

                    if (getSellIn() < 6) {
                        if (getQuality() < 50) {
                            setQuality(getQuality() + 1);
                        }
                    }
                }
            }
        }
    }

    void updateQualityForNegativeSellIn() {
        if (("+5 Dexterity Vest".equals(getName())) || "Elixir of the Mongoose".equals(getName()) || "Conjured Mana Cake".equals(getName())) {
            if (getQuality() > 0) {
                setQuality(getQuality() - 1);
            }
        }
        if ("Backstage passes to a TAFKAL80ETC concert".equals(getName())) {
            setQuality(getQuality() - getQuality());
        }
        if ("Aged Brie".equals(getName())) {
            if (getQuality() < 50) {
                setQuality(getQuality() + 1);
            }
        }
    }

    void update() {
        updateQuality();
        updateSellIn();
        if (getSellIn() < 0) {
            updateQualityForNegativeSellIn();
        }
    }
}
