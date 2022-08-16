package com.movie.ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticket.pojo.MovieDetails;
import com.movie.ticket.repository.MovieDetailsRepository;

@Service
public class MovieDetailsServiceImpl implements MovieDetailsService {
	
	@Autowired
	MovieDetailsRepository movieDetailsRepository;

	@Override
	public MovieDetails saveMovieInfo(MovieDetails movie) {
		// TODO Auto-generated method stub
		return movieDetailsRepository.save(movie);
	}

}
