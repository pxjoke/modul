package com.epam.module2.task01;

import com.epam.module2.task02.PenType;

/**
 * Created by pxjok on 01.10.2015.
 */
public class Task01 {
    public static void main(String[] args) {
        // write your code here
        Pen parker = new Pen();
        parker.setId(123456);
        parker.setManufacturer("parker");
        parker.setName("vector");
        parker.setRodLength(12.0);
        parker.setRodThickness(0.6);
        parker.setType(PenType.BALLPOIN);

        Pen parker2 = new Pen("vector", "parker", PenType.BALLPOIN, 0.6, 12.0, 123456);
        System.out.println("parker");
        System.out.println(parker);
        System.out.println("parker2");
        System.out.println(parker2);

        System.out.println("parker.hashCode() = " + parker.hashCode());
        System.out.println("parker2.hashCode() = " + parker2.hashCode());
        System.out.println("parker.equals(parker) = " + parker.equals(parker));
        System.out.println("parker.equals(parker2) = " + parker.equals(parker2));
        System.out.println("parker2.equals(parker) = " + parker2.equals(parker));
        System.out.println("parker == parker2 : " + (parker == parker2));
        System.out.println("parker2.setId(123)");
        parker2.setId(123);

        System.out.println("parker.hashCode() = " + parker.hashCode());
        System.out.println("parker2.hashCode() = " + parker2.hashCode());
        System.out.println("parker.equals(parker) = " + parker.equals(parker));
        System.out.println("parker.equals(parker2) = " + parker.equals(parker2));
        System.out.println("parker2.equals(parker) = " + parker2.equals(parker));
        System.out.println("parker == parker2 : " + (parker == parker2));
        System.out.println(parker == parker2);


        Pen tukzar = new Pen("rs5000", "tukzar", PenType.GEL, 0.56, 11.53, 1286);
        System.out.println("tukzar: ");
        System.out.println(tukzar);
        System.out.println("tukzar.hashCode() = " + tukzar.hashCode());
        System.out.println("tukzar.equals(parker) = " + tukzar.equals(parker));
        System.out.println("parker.equals(tukzar) = " + parker.equals(tukzar));
    }
}
