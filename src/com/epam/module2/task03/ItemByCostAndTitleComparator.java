package com.epam.module2.task03;

import java.util.Comparator;

/**
 * Created by pxjok on 02.10.2015.
 */
public class ItemByCostAndTitleComparator implements Comparator<Item>{
    @Override
    public int compare(Item o1, Item o2) {
        int c = Double.compare(o1.getCost(), o2.getCost());

        return c != 0 ? c : o1.getTitle().compareTo(o2.getTitle());
    }
}
