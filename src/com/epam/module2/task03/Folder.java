package com.epam.module2.task03;

/**
 * Created by pxjok on 02.10.2015.
 */
public class Folder extends Paper {
    public Folder(String title, String manufacturer, double cost) {
        super(title, manufacturer, cost);
    }

    public Folder(String title, String manufacturer, double cost, PageFormat pageFormat, int pageNumber) {
        super(title, manufacturer, cost, pageFormat, pageNumber);
    }

    @Override
    public String toString() {
        return "Folder{} " + super.toString();
    }
}
