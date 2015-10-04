package com.epam.module1.task03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by pxjoke on 03.10.2015.
 */
public class Task03 {

    public static void main(String[] args) {

        System.out.println("Enter a and b value: ");

        double a;
        double b;
        double h;
        try (Scanner in = new Scanner(System.in)) {
            a = in.nextDouble();
            b = in.nextDouble();
            System.out.println("Enter the step ( h ): ");
            h = in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input parameter. ");
            return;
        }

        System.out.println("----------------------------");
        System.out.println("|| [" + a + ", " + b + "], h = " + h + "  ||");

        double x = a;
        while (x <= b) {
            System.out.println("x = " + x + "  F(x) = " + fun(x));
            x += h;
        }

    }

    private static double fun(double x) {
        return Math.tan(2 * x) - 3;
    }
}
