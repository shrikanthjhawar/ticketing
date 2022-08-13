package com.movie.ticket.repository;

import org.springframework.data.repository.CrudRepository;

import com.movie.ticket.pojo.MovieInfo;

public interface MovieInfoRepository extends CrudRepository<MovieInfo, String>{

}
