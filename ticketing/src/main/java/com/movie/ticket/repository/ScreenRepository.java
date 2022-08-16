package com.movie.ticket.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movie.ticket.pojo.Screen;
@Repository
public interface ScreenRepository extends CrudRepository<Screen, String>{
	
}
