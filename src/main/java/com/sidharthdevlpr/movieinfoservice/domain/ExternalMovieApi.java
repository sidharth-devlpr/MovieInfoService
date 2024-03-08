package com.sidharthdevlpr.movieinfoservice.domain;

public class ExternalMovieApi {
    private int id;
    private String  movie;
    private int  rating;
    private String image;
    private String imdbUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovie() {
        return movie;
    }

    public void setmMovie(String movie) {
        this.movie = movie;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImageUrl() {
        return image;
    }

    public void setImageUrl(String imageUrl) {
        this.image = imageUrl;
    }

    public String getImdbUrl() {
        return imdbUrl;
    }

    public void setImdbUrl(String imdbUrl) {
        this.imdbUrl = imdbUrl;
    }

    public ExternalMovieApi() {
    }

    public ExternalMovieApi(int id, String movie, int rating, String image, String imdbUrl) {
        this.id = id;
        this.movie = movie;
        this.rating = rating;
        this.image = image;
        this.imdbUrl = imdbUrl;
    }
}
