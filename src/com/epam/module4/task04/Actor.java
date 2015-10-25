package com.epam.module4.task04;

/**
 * Created by pxjok on 25.10.2015.
 */
public class Actor {
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
}
