package com.movie.ticket.helper;

import org.springframework.stereotype.Service;

@Service
public class MovieTicketHelper {

	public String generateScreenName(String area, String theaterName) {
		String screenName = "";
		screenName = theaterName.substring(0, 3) + area.substring(0, 3);
		return screenName;
	}

	public String generateMovieID(String movieName) {
		String movieId = "";
		movieId = movieName.substring(0, 3);
		return movieId;
	}

	// 11,15,19,23
	public String generatescreenTiming() {
		int startTime = 10;
		String timing = "10";
		for (int i = 0; i < 3; i++) {
			startTime = startTime + 4;
			timing = timing + "," + startTime;
		}

		return timing;
	}

}
