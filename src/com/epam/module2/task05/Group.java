package com.epam.module2.task05;

import java.util.List;
import java.util.Map;

/**
 * Created by pxjok on 10.10.2015.
 */
public class Group <T> {
    private Subject subject;
    private Map<Student, Marks<T>> students;

    public Group(Subject subject) {
        this.subject = subject;
    }


    public Marks<T> getStudentMarks(Student student){
        return students.get(student);
    }
}
