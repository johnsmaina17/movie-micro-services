package io.mymicorservices.ratingsdataservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsController {
    List<Ratings> ratings= Arrays.asList(
            new Ratings("1","4.5"),
            new Ratings("2","5.1")
    );

    @GetMapping("/{movie_id}")
    public Ratings getRatings(@PathVariable ("movie_id") String movieId){
         return new Ratings(movieId,"4.6");
    }

    @GetMapping("/user/{user_id}")
    public UserRatings getUserRatings(@PathVariable ("user_id") String userId){
        return new UserRatings(ratings);
    }


}
