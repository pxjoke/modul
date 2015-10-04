package com.epam.module1.task06;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pxjok on 03.10.2015.
 */
public class NoteBook {
    private List<Note> notes = new ArrayList<>();

    public void add(Note note) {
        notes.add(note);
    }

    public String printAll() {
        String result = "";
        for (int i = 0; i < notes.size(); i++) {
            result += i + ". " + notes.get(i) + "\n";
        }
        return result;
    }

    public void edit(int i, String title, String author, String text) {
        Note note = notes.get(i);
        note.setTitle(title);
        note.setAuthor(author);
        note.setText(text);
    }

    public void remove(int i) {
        notes.remove(i);
    }

    public int getNotesNumber(){
        return notes.size();
    }
}
