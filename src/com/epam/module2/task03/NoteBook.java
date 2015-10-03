package com.epam.module2.task03;

/**
 * Created by pxjok on 02.10.2015.
 */
public class NoteBook extends Paper {
    private Cover cover = Cover.CARDBOARD;

    public NoteBook(String title, String manufacturer, double cost) {
        super(title, manufacturer, cost);
    }

    public NoteBook(String title, String manufacturer, double cost, PageFormat pageFormat, int pageNumber, Cover cover) {
        super(title, manufacturer, cost, pageFormat, pageNumber);
        this.cover = cover;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "cover=" + cover +
                "} " + super.toString();
    }
}
