package io.mymicorservices.moviecatalogservice;

public class Ratings {
    private String movieId,ratings;

    public Ratings(String movieId, String ratings) {
        this.movieId = movieId;
        this.ratings = ratings;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }
}
