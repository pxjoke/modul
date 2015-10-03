package com.epam.module2.task03;

/**
 * Created by pxjok on 02.10.2015.
 */
public abstract class Paper extends Item {
    private PageFormat pageFormat = PageFormat.A4;
    private int pageNumber = 12;

    public Paper(String title, String manufacturer, double cost) {
        super(title, manufacturer, cost);
    }

    public Paper(String title, String manufacturer, double cost, PageFormat pageFormat, int pageNumber) {
        super(title, manufacturer, cost);
        this.pageFormat = pageFormat;
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "pageFormat=" + pageFormat +
                ", pageNumber=" + pageNumber +
                "} " + super.toString();
    }
}
