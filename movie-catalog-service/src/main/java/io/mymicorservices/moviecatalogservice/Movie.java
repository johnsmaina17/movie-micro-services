package io.mymicorservices.moviecatalogservice;

import java.io.Serializable;

public class Movie implements Serializable {
    private String movieId,name;

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }
    public Movie(){

    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
