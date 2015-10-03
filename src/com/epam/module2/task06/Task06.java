package com.epam.module2.task06;

/**
 * Created by pxjok on 02.10.2015.
 */
public class Task06 {
    public static void main(String[] args) {
        AtomicSubmarine atomicSubmarine = new AtomicSubmarine("Klusha");
        atomicSubmarine.launch();
        System.out.println(atomicSubmarine);
        atomicSubmarine.stop();
        System.out.println(atomicSubmarine);
    }
}
