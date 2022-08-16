package com.movie.ticket.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Entity(name="movie_info")
@Table(name = "Movie_Info")
@Service
public class MovieInfo {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "MOVIE_ID")
	private String movieID;
	
	@Column(name = "SCREEN_ID")
	private String screenInfo;

	@Column(name = "THEATER_ID")
	private String theaterId;

	@Column(name = "TIMING")
	private String timing;

	public String getMovieID() {
		return movieID;
	}

	public String getScreenInfo() {
		return screenInfo;
	}

	public void setScreenInfo(String screenInfo) {
		this.screenInfo = screenInfo;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}


	public String getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(String theaterId) {
		this.theaterId = theaterId;
	}

}
