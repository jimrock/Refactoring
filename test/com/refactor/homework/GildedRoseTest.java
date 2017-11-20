package com.refactor.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GildedRoseTest {

    @Test
    public void testUpdateDexterityVestQuality() throws Exception {
        GildedRose gildedRose = createTestInstance("+5 Dexterity Vest", 10, 20);
        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(19, actualItem.getQuality());
        Assert.assertEquals(9, actualItem.getSellIn());
    }

    @Test
    public void testUpdateDexterityVestQualityShouldNotLessThanZero() throws Exception {
        GildedRose gildedRose = createTestInstance("+5 Dexterity Vest", 0, 0);
        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(0, actualItem.getQuality());
        Assert.assertEquals(-1, actualItem.getSellIn());
    }

    @Test
    public void testUpdateDexterityVestQualityTwiceWhenSellinLessThanZero() throws Exception {
        GildedRose gildedRose = createTestInstance("+5 Dexterity Vest", -1, 5);
        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(3, actualItem.getQuality());
        Assert.assertEquals(-2, actualItem.getSellIn());
    }

    @Test
    public void testUpdateAgedBrieQuality() throws Exception {
        GildedRose gildedRose = createTestInstance("Aged Brie", 2, 0);
        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(1, actualItem.getQuality());
        Assert.assertEquals(1, actualItem.getSellIn());
    }

    @Test
    public void testUpdateAgedBrieQualityTwiceWhenSellInLessThanZeroAndQualityGreatThan50() throws Exception {
        GildedRose gildedRose = createTestInstance("Aged Brie", -1, 0);
        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(2, actualItem.getQuality());
        Assert.assertEquals(-2, actualItem.getSellIn());
    }

    @Test
    public void testUpdateElixirMongooseQuality() throws Exception {
        GildedRose gildedRose = createTestInstance("Elixir of the Mongoose", 5, 7);
        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(6, actualItem.getQuality());
        Assert.assertEquals(4, actualItem.getSellIn());
    }

    @Test
    public void testUpdateSulfurasQuality() throws Exception {
        GildedRose gildedRose = createTestInstance("Sulfuras, Hand of Ragnaros", 0, 80);
        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(80, actualItem.getQuality());
        Assert.assertEquals(0, actualItem.getSellIn());
    }

    @Test
    public void testUpdateBackstagePassesQualityOnceWhenSellInGreatAndEqual11() throws Exception {
        GildedRose gildedRose = createTestInstance("Backstage passes to a TAFKAL80ETC concert", 11, 20);
        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(21, actualItem.getQuality());
        Assert.assertEquals(10, actualItem.getSellIn());
    }

    @Test
    public void testUpdateBackstagePassesQualityTwiceWhenSellInLessThen11AndQuaLessThen50() throws Exception {
        GildedRose gildedRose = createTestInstance("Backstage passes to a TAFKAL80ETC concert", 6, 20);
        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(22, actualItem.getQuality());
        Assert.assertEquals(5, actualItem.getSellIn());
    }

    @Test
    public void testUpdateBackstagePassesQualityThiceWhenSellInLessThen6AndQuaLessThen50() throws Exception {
        GildedRose gildedRose = createTestInstance("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(23, actualItem.getQuality());
        Assert.assertEquals(4, actualItem.getSellIn());
    }

    @Test
    public void testUpdateBackstagePassesQualityToZeroWhenSellInLessThenZero() throws Exception {
        GildedRose gildedRose = createTestInstance("Backstage passes to a TAFKAL80ETC concert", 0, 0);
        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(0, actualItem.getQuality());
        Assert.assertEquals(-1, actualItem.getSellIn());
    }

    @Test
    public void testUpdateConjuredCakeQuality() throws Exception {
        GildedRose gildedRose = createTestInstance("Conjured Mana Cake", 3, 6);
        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(5, actualItem.getQuality());
        Assert.assertEquals(2, actualItem.getSellIn());
    }

    GildedRose createTestInstance(String itemName, int sellIn, int quality) {
        GildedRose gildedRose = new GildedRose();
        System.out.println(itemName);
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(itemName, sellIn, quality));
        gildedRose.setItems(items);
        return gildedRose;
    }
}