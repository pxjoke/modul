package com.epam.module2.task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by pxjok on 02.10.2015.
 */
public class Essentials{
    private static final List<Item> items = new ArrayList<>();

    static {
        items.add(new Pen("Vector", "Parker", 160.0, 12.0, 0.5, Color.BLACK, PenType.BALLPOIN));
        items.add(new Pen("TZ-20", "Tukzar", 3.25, 12.0, 0.5, Color.BLUE, PenType.BALLPOIN));
        items.add(new Pencil("Vector", "Fatih", 2.5, 13.25, 0.6, Color.BLACK, PencilType.HB));
        items.add(new NoteBook("Island", "BooksWorld", 20.0, PageFormat.A4, 160, Cover.CARDBOARD));
        items.add(new Marker("MarkerXXL", "PenDron", 1.23));
        items.add(new Folder("KL123", "Lastick", 16.0));
        items.add(new Sticker("SticBook", "Glance", 0.5));
    }

    public static String printAll(){
        String result = "";
        for (Item i : items){
            result += i + "\n";
        }
        return result;
    }

    public static String printAll(List<Item> list){
        String result = "";
        for (Item i : list){
            result += i + "\n";
        }
        return result;
    }

    public static List<Item> getSortedByCost(){
        List<Item> list = new ArrayList<>(items);
        Collections.sort(list);
        return list;
    }

    public static List<Item> getSortedByTitle(){
        List<Item> list = new ArrayList<>(items);
        Collections.sort(list, new ItemByTitleComparator());
        return list;
    }

    public static List<Item> getSortedByCostAndTitle(){
        List<Item> list = new ArrayList<>(items);
        Collections.sort(list, new ItemByCostAndTitleComparator());
        return list;
    }


    public static List<Item> getItems() {
        return items;
    }

}
