package com.movie.ticket.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movie.ticket.pojo.MovieDetails;
@Repository
public interface MovieDetailsRepository extends CrudRepository<MovieDetails, String>{
	
}
