package com.movie.ticket.service;

import java.util.List;

import com.movie.ticket.pojo.MovieInfo;

public interface MovieInfoService {
	
	MovieInfo saveMovieInfo(MovieInfo movie);
	List<MovieInfo> fetchMovies();

}
