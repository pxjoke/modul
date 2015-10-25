package com.epam.module4.task04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pxjok on 25.10.2015.
 */
public class Library {
    private Map<String, Actor> actors = new HashMap<>();
    private Map<String, Film> films = new HashMap<>();
    private List<Record> records = new ArrayList<>();


    public Library() {
    }

    public Map<String, Actor> getActors() {
        return actors;
    }

    public void setActors(Map<String, Actor> actors) {
        this.actors = actors;
    }

    public Map<String, Film> getFilms() {
        return films;
    }

    public void setFilms(Map<String, Film> films) {
        this.films = films;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public void addActor(String name){
        actors.put(name, new Actor(name));
    }

    public void addFilm(String title, String director){
        films.put(title, new Film(title, director));
    }

    public void printAllFilms(){
        System.out.println(films);
    }

    public void printAllActors(){
        System.out.println(actors);
    }

    public Actor getActor(String name){
        return actors.get(name);
    }

    public Film getFilm(String title){
        return films.get(title);
    }

    public void linkActorWithFilm(Actor actor, Film film)
    {
        records.add(new Record(actor, film));
    }

    public void printFilmsWithActor(Actor actor){
        System.out.println(actor.getName() + "'s films: ");
        for(Record record : records){
            if(record.getActor() == actor) System.out.println(record.getFilm());
        }
    }

    public void printFilmsActors(Film film){
        System.out.println(film.getTitle() + "'s main roles: ");
        for(Record record : records){
            if(record.getFilm() == film) System.out.println(record.getActor());
        }
    }



}
