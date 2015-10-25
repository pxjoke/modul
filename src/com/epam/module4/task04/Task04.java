package com.epam.module4.task04;

import java.io.*;
import java.util.Scanner;

/**
 * Created by pxjok on 25.10.2015.
 */
public class Task04 {

    public static void main(String[] args) {
        Library library = new Library();

        library.addActor("Johnny Depp");
        library.addActor("Liam Neeson");
        library.addActor("Jack Nicholson");
        library.addActor("Kevin Spacey");

        library.addFilm("Edward Scissorhands", "Tim Burton");
        library.addFilm("Sleepy Hollow", "Tim Burton");

        library.addFilm("Schindler's List", "Steven Spielberg");

        library.addFilm("One Flew Over the Cuckoo's Nest", "Milos Forman");
        library.addFilm("The Shining", "Stanley Kubrick");
        library.addFilm("The Departed", "Martin Scorsese");


        library.addFilm("Se7en", "David Fincher");
        library.addFilm("American Beauty", "Sam Mendes");
        library.addFilm("The Life of David Gale", "Alan Parker");

        Actor actor;
        Film film;
        actor = library.getActor("Johnny Depp");
        film = library.getFilm("Edward Scissorhands");
        library.linkActorWithFilm(actor, film);
        film = library.getFilm("Sleepy Hollow");
        library.linkActorWithFilm(actor, film);

        actor = library.getActor("Liam Neeson");
        film = library.getFilm("Schindler's List");
        library.linkActorWithFilm(actor, film);

        actor = library.getActor("Jack Nicholson");
        film = library.getFilm("One Flew Over the Cuckoo's Nest");
        library.linkActorWithFilm(actor, film);
        film = library.getFilm("The Shining");
        library.linkActorWithFilm(actor, film);
        film = library.getFilm("The Departed");
        library.linkActorWithFilm(actor, film);

        actor = library.getActor("Kevin Spacey");
        film = library.getFilm("Se7en");
        library.linkActorWithFilm(actor, film);
        film = library.getFilm("American Beauty");
        library.linkActorWithFilm(actor, film);
        film = library.getFilm("The Life of David Gale");
        library.linkActorWithFilm(actor, film);

        library.printAllFilms();
        library.printAllActors();

        File file = new File("src\\com\\epam\\module4\\task04\\serialized");
        try {
            Library.serializeToFile(library, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Library lib2 = null;

        try {
            lib2 = Library.deserializeFromFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        lib2.unlinkActorAndFilm("Johnny Depp", "Edward Scissorhands");

        lib2.printFilmsWithActor("Johnny Depp");

        lib2.removeActor("Kevin Spacey");

        lib2.editActor("Jack Nicholson", "Big Daddy");
        lib2.editFilm("Schindler's List", "Linked Schindler's List", "Steven Spielberg");
        lib2.printAllActors();
        lib2.printAllFilms();
    }

}
