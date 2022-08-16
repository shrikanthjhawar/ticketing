package com.movie.ticket.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticket.helper.MovieTicketHelper;
import com.movie.ticket.pojo.MovieDetails;
import com.movie.ticket.service.MovieDetailsService;

@RestController
public class MovieDetailsRest {
	 @Autowired private MovieDetailsService movieDetailsService;
	 @Autowired private MovieTicketHelper helper;
	
	@PostMapping("/addMovie")
	public String addMovie(@RequestBody MovieDetails movie) {
		movie.setMovieId(helper.generateMovieID(movie.getMovieName()));
		movieDetailsService.saveMovieInfo(movie);	 
		return "Movie Added to successfully";
		
	}

}
