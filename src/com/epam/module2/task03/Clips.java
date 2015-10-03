package com.epam.module2.task03;

/**
 * Created by pxjok on 02.10.2015.
 */
public class Clips extends Item {
    private int amount;

    public Clips(String title, String manufacturer, double cost) {
        super(title, manufacturer, cost);
    }

    public Clips(String title, String manufacturer, double cost, int amount) {
        super(title, manufacturer, cost);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Clips{" +
                "amount=" + amount +
                "} " + super.toString();
    }
}
