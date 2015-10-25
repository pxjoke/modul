package com.epam.module4.task04;

import java.io.Serializable;

/**
 * Created by pxjok on 25.10.2015.
 */
public class Actor implements Serializable{
    String name = "unknown";

    public Actor(String name) {
        this.name = name;
    }

    public Actor(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
