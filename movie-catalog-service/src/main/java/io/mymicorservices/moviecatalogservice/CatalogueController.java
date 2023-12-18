package io.mymicorservices.moviecatalogservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class CatalogueController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/{user_id}")
    public List<CatalogueItem> getCatalogItems(@PathVariable ("user_id") String userId){
        //get a list of movies
        List<Ratings> ratings= restTemplate.getForObject("http://RATINGS-DATA-SERVICE/ratings/user/"+userId,UserRatings.class).getRatingsList();
        return ratings.stream().map(rating -> {

            //in the case of using web client to send request for the case of reactive programming
            /*Movie movie = webClientBuilder.build()
                    .get()
                    .uri("http://localhost:8081/movies/"+rating.getMovieId())
                    .retrieve()
                    .bodyToMono(Movie.class)
                    .block();*/

               Movie movie=restTemplate.getForObject("http://MOVIE-INFO/movies/"+rating.getMovieId(),Movie.class);
               return  new CatalogueItem(movie.getName(), "viking wars",rating.getRatings());
        }).collect(Collectors.toList());


    }

}
