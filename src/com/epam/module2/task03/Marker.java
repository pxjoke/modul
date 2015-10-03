package com.epam.module2.task03;

/**
 * Created by pxjok on 02.10.2015.
 */
public class Marker extends Writer {
    public Marker(String title, String manufacturer, double cost) {
        super(title, manufacturer, cost);
    }

    public Marker(String title, String manufacturer, double cost, double rodLength, double rodThickness, Color color) {
        super(title, manufacturer, cost, rodLength, rodThickness, color);
    }

    @Override
    public String toString() {
        return "Marker{} " + super.toString();
    }
}
