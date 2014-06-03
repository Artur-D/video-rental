package com.recruit.video.service;

import com.recruit.video.model.Movie;
import com.recruit.video.model.Rental;

import java.util.List;

public interface RentalService {
    public List<Movie> getAllMovies();
    public Rental rentMovie(int movieId, int customerId, int staffId);
}
