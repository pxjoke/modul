package com.epam.module1.task02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by pxjoke on 03.10.2015.
 */
public class Task02 {
    private static double eps;

    public static void main(String[] args) {

        System.out.println("Enter E: ");

        try (Scanner in = new Scanner(System.in)) {
            eps = in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input, try again.");
        }

        int i = 1;

        while (fun(i) >= eps) {
            i++;
        }

        System.out.println("=====================");
        printElements(i);
        System.out.println("=====================");
        System.out.println("N = " + i);
    }

    private static double fun(int n) {
        return 1 / (Math.pow((n + 1), 2.0));
    }

    private static void printElements(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("a" + i + " = " + fun(i));
        }
    }
}
