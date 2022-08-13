package com.movie.ticket.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Entity
@Table(name = "Movie_Info")
@Service
public class MovieInfo {
	@Id
	@Column(name = "MOVIE_ID")
	private String movieID;
	@Column(name = "MOVIE_NAME")
	private String movieName;

	@Column(name = "SCREEN_INFO")
	private String screenInfo;

	@Column(name = "THEATER_ID")
	private int theaterId;

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

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return movieName + " ," + theaterId;
	}

	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

}
