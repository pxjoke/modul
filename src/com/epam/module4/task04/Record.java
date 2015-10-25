package com.epam.module4.task04;


/**
 * Created by pxjok on 25.10.2015.
 */
public class Record {
    private Actor actor = null;
    private Film film = null;

    public Record(Actor actor, Film film) {

        this.actor = actor;
        this.film = film;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }



}
