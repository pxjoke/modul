package com.epam.module2.task02;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pxjok on 01.10.2015.
 */
public class Employee {
    private String name;
    private Map<String, Item> items = new HashMap<String, Item>();
    private double totalCost;
    private int totalAmount;

    public Employee(String name) {
        this.name = name;

    }

    public void addItem(Item item) {
        items.put(item.getTitle(), item);
    }

    public void deleteItem(String title) {
        items.remove(title);
    }

    public int getTotalAmount() {
        totalAmount = 0;
        for (String k : items.keySet()) {
            totalAmount += items.get(k).getAmount();
        }
        return totalAmount;
    }

    public double getTotalCost() {
        totalCost = 0;
        for (String k : items.keySet()) {
            totalCost += items.get(k).getCost();
        }
        return totalCost;
    }

    public String getName() {
        return name;
    }

    public String printAll() {
        String result = "";
        for (String k : items.keySet()) {
            result = result + "\n" + items.get(k);
        }
        return result;
    }
}
