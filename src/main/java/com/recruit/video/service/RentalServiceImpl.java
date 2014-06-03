package com.recruit.video.service;

import java.util.List;

import com.recruit.video.dao.MovieDao;
import com.recruit.video.dao.RentalDao;
import com.recruit.video.model.Rental;
import org.springframework.beans.factory.annotation.Autowired;

import com.recruit.video.model.Movie;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RentalServiceImpl implements RentalService{
	
    @Autowired
    private MovieDao movieDao;

    @Autowired
    private RentalDao rentalDao;
    
    public List<Movie> getAllMovies() {
    	return movieDao.getAllMovies();
    }

    @Override
    public Rental rentMovie(int movieId, int customerId, int staffId) {
        Integer rentalId = (Integer) movieDao.rentMovie(movieId, customerId, staffId);
        return rentalDao.findById(rentalId);
    }

}
