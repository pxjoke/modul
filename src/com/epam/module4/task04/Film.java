package com.epam.module4.task04;

import java.io.Serializable;

/**
 * Created by pxjok on 25.10.2015.
 */
public class Film implements Serializable{
    String title = "untitled";
    String director = "unknown";

    public Film(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public Film() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return title + "  " + director;
    }
}
