package com.epam.module2.task02;

/**
 * Created by pxjok on 01.10.2015.
 */
public class Item {
    private String title;
    private double cost;
    private int amount;

    public Item(String title, double cost, int amount) {
        this.title = title;
        this.cost = cost;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                "  Cost: " + cost +
                "  Amount: " + amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(item.cost, cost) != 0) return false;
        return amount == item.amount && !(title != null ? !title.equals(item.title) : item.title != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(cost);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + amount;
        return result;
    }

}
