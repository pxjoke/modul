package com.epam.module2.task04;

import com.epam.module2.task03.*;

import java.util.List;

/**
 * Created by pxjok on 02.10.2015.
 */
public class Task04 {
    public static void main(String[] args) {
        List<Item> items = Essentials.getItems();

        System.out.println(Essentials.printAll(items));
        System.out.println(Essentials.printAll(Essentials.getSortedByCost()));

        System.out.println(Essentials.printAll(Essentials.getSortedByTitle()));

        System.out.println(Essentials.printAll(Essentials.getSortedByCostAndTitle()));

    }
}
