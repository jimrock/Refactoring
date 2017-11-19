package com.refactor.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GildedRoseTest {
    @Test
    public void testUpdateDexterityVestQuality() throws Exception {

        GildedRose gildedRose = new GildedRose();
        System.out.println("OMGHAI!");
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        gildedRose.setItems(items);

        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(19, actualItem.getQuality());
        Assert.assertEquals(9, actualItem.getSellIn());
    }

    @Test
    public void testUpdateAgedBrieQuality() throws Exception {

        GildedRose gildedRose = new GildedRose();
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Aged Brie", 2, 0));
        gildedRose.setItems(items);

        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(1, actualItem.getQuality());
        Assert.assertEquals(1, actualItem.getSellIn());
    }

    @Test
    public void testUpdateElixirMongooseQuality() throws Exception {

        GildedRose gildedRose = new GildedRose();
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        gildedRose.setItems(items);

        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(6, actualItem.getQuality());
        Assert.assertEquals(4, actualItem.getSellIn());
    }

    @Test
    public void testUpdateSulfurasQuality() throws Exception {

        GildedRose gildedRose = new GildedRose();
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        gildedRose.setItems(items);

        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(80, actualItem.getQuality());
        Assert.assertEquals(0, actualItem.getSellIn());
    }

    @Test
    public void testUpdateBackstagePassesQuality() throws Exception {

        GildedRose gildedRose = new GildedRose();
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        gildedRose.setItems(items);

        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(21, actualItem.getQuality());
        Assert.assertEquals(14, actualItem.getSellIn());
    }

    @Test
    public void testUpdateConjuredCakeQuality() throws Exception {

        GildedRose gildedRose = new GildedRose();
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Conjured Mana Cake", 3, 6));
        gildedRose.setItems(items);

        gildedRose.updateQuality();
        Item actualItem = gildedRose.getItems().get(0);
        Assert.assertEquals(5, actualItem.getQuality());
        Assert.assertEquals(2, actualItem.getSellIn());
    }
}