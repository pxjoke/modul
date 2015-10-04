package com.epam.module1.task06;


/**
 * Created by pxjoke on 03.10.2015.
 */
public class Task06 {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();

        noteBook.add(new Note("Hello", "Dmitry", "Hello, world!!"));
        noteBook.add(new Note("Windows", "Nekita", "May - may!"));
        noteBook.add(new Note("My school", "Natasha", "My school is very good."));
        noteBook.add(new Note());
        noteBook.add(new Note());
        noteBook.add(new Note());
        System.out.println(noteBook.printAll());



        noteBook.remove(0);

        System.out.println(noteBook.printAll());

        noteBook.edit(0, "Morning", "Dmitry", "Wonderful morning!");

        System.out.println(noteBook.printAll());
    }
}
