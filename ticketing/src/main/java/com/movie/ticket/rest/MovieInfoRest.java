package com.movie.ticket.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticket.pojo.DisplayMovieToUserDTO;
import com.movie.ticket.pojo.MovieInfo;
import com.movie.ticket.service.MovieInfoService;

@RestController
public class MovieInfoRest {
	 @Autowired private MovieInfoService movieinfoService;
	 //@Autowired private MovieTicketHelper helper;
	

	@PostMapping("/addMovieToScreen")
	public String addMovie(@RequestBody MovieInfo movie) {
		
		movieinfoService.saveMovieInfo(movie);
		return "Movie Added to screen successfully";
		
	}
	  @GetMapping("/findMovies")
	  public List<DisplayMovieToUserDTO> findMovieByLocation(@RequestParam String location ) { 
	  return movieinfoService.fetchMoviesByLocation(location);	  
	  }

	

}
