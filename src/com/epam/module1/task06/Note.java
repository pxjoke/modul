package com.epam.module1.task06;

/**
 *Class Note describes one record in Notebook.
 * @author Dmitry Gruzdev
 *
 */
public class Note {
    private String title;
    private String text;
    private String author;


    public Note(String title, String author, String text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }

    public Note() {
        title = "Untitled";
        author = "Unknown";
        text = "New note.";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? "Untitled" : title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author==null ? "Unknown" : author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? "New note." : text;
    }

    @Override
    public String toString() {
        return title + "  |  " + author + "  |  " + text;
    }

}
