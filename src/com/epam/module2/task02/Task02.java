package com.epam.module2.task02;

/**
 * Created by pxjok on 01.10.2015.
 */
public class Task02 {
    public static void main(String[] args) {
        Employee employee = new Employee("Alex");
        employee.addItem(new Item("Pen", 12.05, 3));
        employee.addItem(new Item("Line", 6.23, 15));
        employee.addItem(new Item("Mouse", 17.23, 2));

        Employee employee2 = new Employee("Bob");
        employee2.addItem(new Item("Stick", 30, 3));
        employee2.addItem(new Item("Table", 78, 15));
        employee2.addItem(new Item("Mouse", 17.23, 2));


//        System.out.println(employee.printAll());
//        System.out.println("Total Amount: " + employee.getTotalAmount()
//                + "  Total Cost: " + employee.getTotalCost());

        Company company = new Company("Epam");
        company.addEmployee(employee);
        company.addEmployee(employee2);

        System.out.println(company.printAll());

        System.out.println("Bob's cost: " + company.getCostByName("Bob"));
    }
}
