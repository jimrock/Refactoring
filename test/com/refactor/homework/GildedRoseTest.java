package com.refactor.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GildedRoseTest {
    @Test
    public void testUpdateQuality() throws Exception {

        GildedRose gildedRose = new GildedRose();
        System.out.println("OMGHAI!");
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));
        gildedRose.setItems(items);

        gildedRose.updateQuality();

        Assert.fail("Not implement!");
    }
}