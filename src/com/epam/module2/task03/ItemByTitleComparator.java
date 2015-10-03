package com.epam.module2.task03;

import java.util.Comparator;

/**
 * Created by pxjok on 02.10.2015.
 */
public class ItemByTitleComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        String title1 = o1.getTitle();
        String title2 = o2.getTitle();

        return title1.compareTo(title2);
    }
}
