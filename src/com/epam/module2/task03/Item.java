package com.epam.module2.task03;

/**
 * Created by pxjok on 01.10.2015.
 */
public abstract class Item implements Comparable<Item>{
    private final String title;
    private final String manufacturer;
    private double cost = 0.0;

    public Item(String title, String manufacturer, double cost) {
        this.title = title;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getTitle() {
        return title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(item.cost, cost) != 0) return false;
        if (title != null ? !title.equals(item.title) : item.title != null) return false;
        return !(manufacturer != null ? !manufacturer.equals(item.manufacturer) : item.manufacturer != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Item o) {
        double anotherItemCost = o.getCost();
        return Double.compare(this.getCost(),anotherItemCost );

    }
}
