package com.sidharthdevlpr.movieinfoservice.controller;

import com.sidharthdevlpr.movieinfoservice.domain.ExternalMovieApi;
import com.sidharthdevlpr.movieinfoservice.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable int movieId){
        ExternalMovieApi externalMovieApi = restTemplate.getForObject("https://dummyapi.online/api/movies/"+movieId,ExternalMovieApi.class);
        Movie movie = new Movie();
        movie.setName(externalMovieApi.getMovie());
        movie.setMovieId(movieId);
        return movie;
    }
}
