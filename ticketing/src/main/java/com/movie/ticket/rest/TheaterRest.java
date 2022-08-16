package com.movie.ticket.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticket.helper.MovieTicketHelper;
import com.movie.ticket.pojo.Screen;
import com.movie.ticket.pojo.TheaterHall;
import com.movie.ticket.service.ScreenService;
import com.movie.ticket.service.TheaterHallService;

@RestController
public class TheaterRest {
	
	   @Autowired private TheaterHallService theaterService;
	   @Autowired private ScreenService screenService;
	   @Autowired private Screen screen;
	   @Autowired private MovieTicketHelper helper;

	@PostMapping("/add")
	public String addTheater(@RequestBody TheaterHall theater) {
		System.out.println("Saving theater info...");
		theater.setId(helper.generateScreenName(theater.getTheaterName(), theater.getArea()));
		theaterService.saveTheater(theater);
		
		  for(int i=0;i<theater.getNumberOfScreens();i++) {
		  screen.setTheaterId(theater.getId()); screen.setCapacity(100);
		  screen.setScreenId(helper.generateScreenName(theater.getArea(),
		  theater.getTheaterName())+"-"+i); screen.setScreenName("Screen-"+i);
		  screen.setTiming(helper.generatescreenTiming());
		  screenService.saveScreen(screen); }
		 
		
		return "Adding theater success";
	}
	
	 @GetMapping("/theaters")
	    public List<TheaterHall> fetchDepartmentList()
	    {
	        return theaterService.fetchTheaterList();
	    }

}
