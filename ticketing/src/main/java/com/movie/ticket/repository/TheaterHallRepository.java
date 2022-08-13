package com.movie.ticket.repository;
import org.springframework.data.repository.CrudRepository;

import com.movie.ticket.pojo.TheaterHall; 

public interface TheaterHallRepository extends CrudRepository<TheaterHall, Integer>   {

}
