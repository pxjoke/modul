package com.epam.module2.task05;

/**
 * Created by pxjok on 10.10.2015.
 */
public enum Subject {
    MATHS, PHYSICS, HISTORY, BIOLOGY;

    public boolean isInteger(){
        return this == BIOLOGY ? true :false;
    }
}
