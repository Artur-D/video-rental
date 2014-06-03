package com.recruit.video.dao;

import com.recruit.video.model.Movie;

import java.io.Serializable;
import java.util.List;

public interface MovieDao extends BaseDao<Movie> {
    public List<Movie> getAllMovies();
    Serializable rentMovie(int movieId, int customerId, int staffId);
}
