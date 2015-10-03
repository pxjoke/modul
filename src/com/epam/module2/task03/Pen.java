package com.epam.module2.task03;

/**
 * Created by pxjok on 01.10.2015.
 */
public class Pen extends Writer{
    private PenType penType = PenType.BALLPOIN;

    public Pen(String title, String manufacturer, double cost) {
        super(title, manufacturer, cost);
    }

    public Pen(String title, String manufacturer, double cost, double rodLength, double rodThickness, Color color, PenType penType) {
        super(title, manufacturer, cost, rodLength, rodThickness, color);
        this.penType = penType;
    }

    public PenType getPenType() {
        return penType;
    }

    public void setPenType(PenType penType) {
        this.penType = penType;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "penType=" + penType +
                "} " + super.toString();
    }
}
