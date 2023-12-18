package io.mymicorservices.movieinfoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @GetMapping("/{movie_id}")
    public Movie getMovie(@PathVariable ("movie_id") String movieId){
               return  new Movie("1","viking");
    }
}
