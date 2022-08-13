package com.movie.ticket.repository;

import org.springframework.data.repository.CrudRepository;

import com.movie.ticket.pojo.Screen;

public interface ScreenRepository extends CrudRepository<Screen, String>{
	
}
