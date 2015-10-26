package com.epam.module3.task01;

/**
 * Created by pxjok on 26.10.2015.
 */
public class Task01 {
    public static void main(String[] args) {
        CrazyLogger logger = new CrazyLogger();
        logger.log("Hello");
        logger.log("Lala sdjcnsjkdcn");
        logger.log("Everything is ok");
        logger.print();

        logger.printRecordsContainsString("ok");

        logger.printThisMonth();
    }
}
