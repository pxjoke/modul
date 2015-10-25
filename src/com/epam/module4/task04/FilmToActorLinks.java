package com.epam.module4.task04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pxjok on 25.10.2015.
 */
public class FilmToActorLinks {
    private List<Record> records = new ArrayList<>();

    public FilmToActorLinks(List<Record> records) {
        this.records = records;
    }

    public FilmToActorLinks() {
    }

    public void addLink(Actor actor, Film film){
        records.add(new Record(actor, film));
    }
}
