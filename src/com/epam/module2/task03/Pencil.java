package com.epam.module2.task03;

/**
 * Created by pxjok on 02.10.2015.
 */
public class Pencil extends Writer{
    private PencilType pencilType = PencilType.B;
    public Pencil(String title, String manufacturer, double cost) {
        super(title, manufacturer, cost);
    }

    public Pencil(String title, String manufacturer, double cost, double rodLength, double rodThickness, Color color, PencilType pencilType) {
        super(title, manufacturer, cost, rodLength, rodThickness, color);
        this.pencilType = pencilType;
    }

    public PencilType getPencilType() {
        return pencilType;
    }

    public void setPencilType(PencilType pencilType) {
        this.pencilType = pencilType;
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "pencilType=" + pencilType +
                "} " + super.toString();
    }
}
