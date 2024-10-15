package com.ticketrush.gds.theatre.service;

public interface MovieService {

    MovieResponse createMovie(MovieRequest movieRequest);

    MovieResponse updateMovie(MovieRequest movieRequest);

    MovieResponse getMovie(long movieId);

    MovieResponse getMovieList(String language, String genre);
}
