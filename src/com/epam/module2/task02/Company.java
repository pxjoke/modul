package com.epam.module2.task02;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pxjok on 01.10.2015.
 */
public class Company {
    private String name;
    private Map<String, Employee> employees = new HashMap<String, Employee>();

    public Company(String name) {
        this.name = name;
    }

    public void addEmployee(Employee e) {
        employees.put(e.getName(), e);

    }

    public Employee getEmployee(String name){
        return employees.get(name);
    }

    public void removeEmployee(String name){
        employees.remove(name);
    }

    public String printAll(){
        String result = "";
        for (String k : employees.keySet()){
            result = result + employees.get(k).getName() +
                    " || Total Cost: " + employees.get(k).getTotalCost() + "\n";
        }
        return result;
    }

    public double getCostByName(String name){
        return employees.get(name).getTotalCost();
    }

}
