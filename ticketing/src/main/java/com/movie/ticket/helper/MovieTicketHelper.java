package com.movie.ticket.helper;

import org.springframework.stereotype.Service;

@Service
public class MovieTicketHelper {
	
	public String generateScreenName(String area, String theaterName) {
		String screenName="";
		screenName = theaterName.substring(0, 3)+area.substring(0, 3);
		return screenName;
	}
	
	public String generateMovieID(String movieName) {
		String movieId="";
		movieId =movieName.substring(0, 3);
		return movieId;
	}

}
