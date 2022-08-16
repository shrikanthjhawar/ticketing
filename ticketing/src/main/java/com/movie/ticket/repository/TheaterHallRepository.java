package com.movie.ticket.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movie.ticket.pojo.TheaterHall; 

@Repository
public interface TheaterHallRepository extends CrudRepository<TheaterHall, String>   {

}
