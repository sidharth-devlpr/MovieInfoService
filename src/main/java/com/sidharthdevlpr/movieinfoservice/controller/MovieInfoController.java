package com.sidharthdevlpr.movieinfoservice.controller;

import com.sidharthdevlpr.movieinfoservice.domain.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {
    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId){
        Movie movie = new Movie();
        movie.setName("Vettaiyadu vilaiyadu");
        movie.setMovieId(movieId);
        return movie;
    }
}
