package GildedRose;


import org.junit.jupiter.api.Test;
import org.approvaltests.combinations.CombinationApprovals;

class GildedRoseTest {

    @Test
    void approveGildedRose() {
        String[] names = {"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros"};
        Integer[] sellins = { -1, 0, 1, 5, 6, 10, 11, 12, 6, 2 };
        Integer[] qualities = { 0, 1, 48, 49, 50 };
        CombinationApprovals.verifyAllCombinations(
                this::runGildedRose,
                names,
                sellins,
                qualities);
    }

    private Item runGildedRose(String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name, sellIn, quality) };
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        return gildedRose.items[0];
    }

}