package com.epam.module2.task01;


import com.epam.module2.task02.PenType;

/**
 * Created by pxjoke on 30.09.2015.
 */
public class Pen {
    private PenType type;
    private double rodThickness;
    private double rodLength;
    private String manufacturer;
    private String name;
    private int id;

    public Pen() {
        type = PenType.BALLPOIN;
        rodThickness = 0.5;
        rodLength = 10.0;
        manufacturer = "none";
        name = "none";
        id = 0;
    }

    public Pen(String name, String manufacturer, PenType type, double rodThickness, double rodLength, int id) {
        this.type = type;
        this.rodThickness = rodThickness;
        this.rodLength = rodLength;
        this.manufacturer = manufacturer;
        this.name = name;
        this.id = id;
    }

    public PenType getType() {
        return type;
    }

    public void setType(PenType type) {
        this.type = type;
    }

    public double getRodThickness() {
        return rodThickness;
    }

    public void setRodThickness(double rodThickness) {
        this.rodThickness = rodThickness;
    }

    public double getRodLength() {
        return rodLength;
    }

    public void setRodLength(double rodLength) {
        this.rodLength = rodLength;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type.hashCode();
        temp = Double.doubleToLongBits(rodThickness);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(rodLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + id;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (Double.compare(pen.rodThickness, rodThickness) != 0) return false;
        if (Double.compare(pen.rodLength, rodLength) != 0) return false;
        if (id != pen.id) return false;
        if (type != pen.type) return false;
        if (!manufacturer.equals(pen.manufacturer)) return false;
        return name.equals(pen.name);

    }

    @Override
    public String toString() {
        return "Pen{" +
                "type=" + type +
                ", rodThickness=" + rodThickness +
                ", rodLength=" + rodLength +
                ", manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
