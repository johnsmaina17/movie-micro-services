package io.mymicorservices.moviecatalogservice;

import java.util.List;

public class UserRatings {
    private List<Ratings> ratingsList;

    public UserRatings() {
    }

    public UserRatings(List<Ratings> ratingsList) {
        this.ratingsList = ratingsList;
    }

    public List<Ratings> getRatingsList() {
        return ratingsList;
    }

    public void setRatingsList(List<Ratings> ratingsList) {
        this.ratingsList = ratingsList;
    }
}
