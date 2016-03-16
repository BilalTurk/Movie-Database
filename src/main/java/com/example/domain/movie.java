package com.example.domain;

import javax.persistence.*;
/**
 * Created by bilalturk on 11.03.2016.
 */


@Entity
@Table(name = "Movie")
public class movie {
    @Id
    @GeneratedValue
    private Long id;
    private String FilmName;

    public String getFilmName () {
        return FilmName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setFilmName(String FilmName) {
        this.FilmName = FilmName;
    }




}
