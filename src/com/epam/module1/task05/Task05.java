package com.epam.module1.task05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by pxjok on 03.10.2015.
 */
public class Task05 {
    public static void main(String[] args) {

        int n = 5;

        System.out.println("Enter N: ");

        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong Parameter!");
            e.printStackTrace();
        }

        new Matrix(n).print();


    }

}
