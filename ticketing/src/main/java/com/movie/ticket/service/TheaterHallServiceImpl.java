package com.movie.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticket.pojo.TheaterHall;
import com.movie.ticket.repository.TheaterHallRepository;

@Service
public class TheaterHallServiceImpl implements TheaterHallService{
	
	  @Autowired
	    private TheaterHallRepository theaterRepository;

	public TheaterHall saveTheater(TheaterHall theater) {
		return theaterRepository.save(theater);
	}
	
    @Override
    public List<TheaterHall>  fetchTheaterList() {
        return (List<TheaterHall>) theaterRepository.findAll();
    }
  

}
