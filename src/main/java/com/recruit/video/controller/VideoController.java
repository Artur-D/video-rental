package com.recruit.video.controller;

import com.recruit.video.model.Movie;
import com.recruit.video.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class VideoController {
	
	@Autowired
	private RentalService rentalService;
	
	
	@RequestMapping(value = "/rent/{movieId}", method = RequestMethod.GET) 
	public String elo() {
		return null;
	}
	
	@RequestMapping(value = "/movies", method = RequestMethod.GET) 
	public String getMovies(Model model) {
        List<Movie> movies = rentalService.getAllMovies();

		if (!movies.isEmpty()) {
            model.addAttribute("moviesList", movies);
			return "movieList";
		}
		return "home";
	}

}
