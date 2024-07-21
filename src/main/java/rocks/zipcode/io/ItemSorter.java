package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {

    private Item[] items;

    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        List<Item> sortedItems = Arrays.asList(this.items);
        sortedItems.sort(comparator);
        Item[] sortedArrayItems = new Item[items.length];
        int index = 0;
        for(Item element: sortedItems){
            sortedArrayItems[index] = element;
            index++;
        }
        return sortedArrayItems;
    }
}
