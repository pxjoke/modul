package com.epam.module2.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pxjok on 10.10.2015.
 */
public class Marks<T> {
    private List<T> marks = new ArrayList<>();

    public void add(T mark) {
        marks.add(mark);
    }

    public List<T> getMarks() {
        return marks;
    }

    public void clear() {
        marks.clear();
    }

    public void setMarks(List<T> marks) {
        this.marks = marks;
    }
}
