package com.epam.module1.task06;

import java.util.ArrayList;
import java.util.List;

/**
 * Class NoteBook contains array of {@link Note}.
 * <p>Allow to add note, edit note by index, remove note by index, print all notes.</p>
 *
 * @author Dmitry Gruzdev
 */
class NoteBook {
    private List<Note> notes = new ArrayList<>();

    /**
     * Allow to add new Note.
     *
     * @param note If note == null then default new Note() will be added.
     */
    public void add(Note note) {
        Note tmp;
        tmp = (note == null) ? new Note() : note;
        notes.add(tmp);
    }

    /**
     * @return Sting with all notes.
     */
    public String printAll() {
        String result = "";
        for (int i = 0; i < notes.size(); i++) {
            result += i + ". " + notes.get(i) + "\n";
        }
        return result;
    }

    /**
     * @param index It must be in [0, getNoteNumber()) range!
     */
    public void edit(int index, String title, String author, String text) {
        Note note;
        note = notes.get(index);
        note.setTitle(title);
        note.setAuthor(author);
        note.setText(text);
    }

    /**
     * @param index It must be in [0, getNoteNumber()) range!
     */
    public void remove(int index) {
        notes.remove(index);
    }

    /**
     *
     * @return Number of notes in array.
     */
    public int getNotesNumber() {
        return notes.size();
    }
}
