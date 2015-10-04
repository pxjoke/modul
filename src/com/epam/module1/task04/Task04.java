package com.epam.module1.task04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by pxjoke on 03.10.2015.
 */
public class Task04 {
    public static void main(String[] args) {
        int n;
        double[] a;

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter 2n: ");
            n = in.nextInt();
            if (n % 2 != 0) {
                System.out.println("n % 2 != 0");
                return;
            }
            System.out.println();
            a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextDouble();
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input parameter. ");
            return;
        }
        System.out.println(findMaxSum(a));

    }

    private static double findMaxSum(double[] a) {
        double max = Double.MIN_VALUE;
        int n = a.length / 2;
        for (int i = 0; i < n; i++) {
            if ((a[i] + a[2 * n - i - 1]) > max){
                max = a[i] + a[2 * n - i - 1];
            }
        }
        return max;
    }
}
