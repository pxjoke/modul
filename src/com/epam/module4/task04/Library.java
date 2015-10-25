package com.epam.module4.task04;

import java.io.*;
import java.util.*;

/**
 * Created by pxjok on 25.10.2015.
 */
public class Library implements Serializable{
    private Map<String, Actor> actors = new HashMap<>();
    private Map<String, Film> films = new HashMap<>();
    private List<Record> records = new LinkedList<>();

    public static void serializeToFile(Library library, File outputFile) throws IOException{
        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(library);

        }
    }

    public static Library deserializeFromFile(File file) throws IOException, ClassNotFoundException{
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (Library) objectInputStream.readObject();
        }
    }

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

    public void addActor(String name) {
        actors.put(name, new Actor(name));
    }

    public void addFilm(String title, String director) {
        films.put(title, new Film(title, director));
    }

    public void printAllFilms() {
        System.out.println("All films: ");
        System.out.println("---------------------------------------");
        for (String film : films.keySet()) {
            System.out.println(film);
        }
        System.out.println("---------------------------------------");
    }

    public void printAllActors() {
        System.out.println("All Actors: ");
        System.out.println("---------------------------------------");
        for (String actor : actors.keySet()) {
            System.out.println(actor);
        }
        System.out.println("---------------------------------------");
    }

    public Actor getActor(String name) {
        return actors.get(name);
    }

    public Film getFilm(String title) {
        return films.get(title);
    }

    public void linkActorWithFilm(Actor actor, Film film) {
        records.add(new Record(actor, film));
    }

    public void linkActorWithFilm(String name, String title) {
        Actor actor;
        Film film;
        actor = actors.get(name);
        film = films.get(title);

        records.add(new Record(actor, film));
    }

    public void printFilmsWithActor(String actor) {
        System.out.println(actor + "'s films: ");
        System.out.println("---------------------------------------");
        for (Record record : records) {
            if (record.getActor() == actors.get(actor)) System.out.println(record.getFilm());
        }
        System.out.println("---------------------------------------");
    }

    public void printFilmsActors(String film) {
        System.out.println(film + "'s main roles: ");
        System.out.println("---------------------------------------");
        for (Record record : records) {
            if (record.getFilm() == films.get(film)) System.out.println(record.getActor());
        }
        System.out.println("---------------------------------------");
    }

    public void removeActor(String actor){
        actors.remove(actor);

        ListIterator<Record> iterator = records.listIterator();

        while(iterator.hasNext()){
            if(iterator.next().getActor() == actors.get(actor)) iterator.remove();
        }

    }

    public void removeFilm(String film){
        films.remove(film);

        ListIterator<Record> iterator = records.listIterator();

        while(iterator.hasNext()){
            if(iterator.next().getFilm() == films.get(film)) iterator.remove();
        }

    }

    public void unlinkActorAndFilm(String actor, String film){
        ListIterator<Record> iterator = records.listIterator();
        Record record;
        while(iterator.hasNext()){
            record = iterator.next();
            if(record.getFilm() == films.get(film) && record.getActor() == actors.get(actor)) iterator.remove();
        }
    }

    public void editActor(String actor, String name){
        Actor a = actors.get(actor);
        if(a  != null){
            a.setName(name);
            actors.remove(actor);
            actors.put(name, a);
        }

    }

    public void editFilm(String film, String title, String director){
        Film a = films.get(film);
        if(a  != null){
            a.setTitle(title);
            a.setDirector(director);
            films.remove(film);
            films.put(title, a);
        }

    }


}
