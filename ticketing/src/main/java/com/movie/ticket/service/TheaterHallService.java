package com.movie.ticket.service;

import java.util.List;

import com.movie.ticket.pojo.TheaterHall;

public interface TheaterHallService {
	
	TheaterHall saveTheater(TheaterHall theater);
	List<TheaterHall> fetchTheaterList();

}
