package com.movie.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticket.pojo.DisplayMovieToUserDTO;
import com.movie.ticket.pojo.MovieInfo;
import com.movie.ticket.repository.MovieInfoRepository;

@Service
public class MovieInfoServiceImpl implements MovieInfoService{
	
	@Autowired
	MovieInfoRepository movieInfoRepository;
	

	@Override
	public MovieInfo saveMovieInfo(MovieInfo movie) {
		// TODO Auto-generated method stub
		return movieInfoRepository.save(movie);
	}

	@Override
	public List<DisplayMovieToUserDTO> fetchMoviesByLocation(String location) {
		System.out.println(movieInfoRepository.queryBy().toString());
		return movieInfoRepository.queryBy();
	}
}
