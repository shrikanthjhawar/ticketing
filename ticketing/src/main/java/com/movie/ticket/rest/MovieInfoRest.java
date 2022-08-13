package com.movie.ticket.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticket.helper.MovieTicketHelper;
import com.movie.ticket.pojo.MovieInfo;
import com.movie.ticket.pojo.TheaterHall;
import com.movie.ticket.service.MovieInfoService;

@RestController
public class MovieInfoRest {
	 @Autowired private MovieInfoService movieInfoService;
	 @Autowired private MovieTicketHelper helper;
	
	@PostMapping("/addMovie")
	public String addMovie(@RequestBody MovieInfo movie) {
		System.out.println(movie);
		movie.setMovieID(helper.generateMovieID(movie.getMovieName()));
		movieInfoService.saveMovieInfo(movie);
		 
	
		return "Movie Added successfully";
		
	}
	
	 @GetMapping("/movies")
	    public List<MovieInfo> fetchDepartmentList()
	    {
	        return movieInfoService.fetchMovies();
	    }

}
