package com.epam.module2.task03;

/**
 * Created by pxjok on 01.10.2015.
 */
public  abstract class Writer extends Item {
    private double rodLength = 10.5;
    private double rodThickness = 0.5;
    private Color color = Color.BLACK;

    public Writer(String title, String manufacturer, double cost) {
        super(title, manufacturer, cost);
    }

    public Writer(String title, String manufacturer, double cost, double rodLength, double rodThickness, Color color) {
        super(title, manufacturer, cost);
        this.rodLength = rodLength;
        this.rodThickness = rodThickness;
        this.color = color;

    }

    public double getRodLength() {
        return rodLength;
    }

    public void setRodLength(double rodLength) {
        this.rodLength = rodLength;
    }

    public double getRodThickness() {
        return rodThickness;
    }

    public void setRodThickness(double rodThickness) {
        this.rodThickness = rodThickness;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "rodLength=" + rodLength +
                ", rodThickness=" + rodThickness +
                "} " + super.toString();
    }

}
