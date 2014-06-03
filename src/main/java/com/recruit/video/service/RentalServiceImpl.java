package com.recruit.video.service;

import java.util.List;

import com.recruit.video.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;

import com.recruit.video.model.Movie;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RentalServiceImpl implements RentalService{
	
    @Autowired
    private MovieDao movieDao;
    
    public List<Movie> getAllMovies() {
    	return movieDao.getAllMovies();
    }
}
