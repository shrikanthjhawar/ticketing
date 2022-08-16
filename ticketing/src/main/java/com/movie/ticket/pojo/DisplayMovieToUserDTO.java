package com.movie.ticket.pojo;

public class DisplayMovieToUserDTO {
	
	public String getMovieName() {
		return movieName;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public String getTiming() {
		return timing;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	private String movieName;
	private String theaterName;
	private String timing;
	private String address;
	private String city;
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setLocation(String location) {
		this.city = location;
	}
	public DisplayMovieToUserDTO(String movieName, String theaterName, String timing, String address, String city) {
		super();
		this.movieName = movieName;
		this.theaterName = theaterName;
		this.timing = timing;
		this.address = address;
		this.city = city;
	}
}
