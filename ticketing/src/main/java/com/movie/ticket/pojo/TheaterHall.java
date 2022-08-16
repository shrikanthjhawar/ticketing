package com.movie.ticket.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//select Movie_name,Movie_cast,GENERe,LANGUAGE,name,Timing,name from movie_Details,movie_info, theater_hall where movie_Details.movie_id=movie_info.movie_id and theater_hall.id = movie_info.theater_id;

@Entity(name="theater_hall")
@Table(name = "Theater_Hall")
public class TheaterHall {
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public int getNumberOfScreens() {
		return numberOfScreens;
	}
	public void setNumberOfScreens(int numberOfScreens) {
		this.numberOfScreens = numberOfScreens;
	}
	public int getTotalCapacity() {
		return totalCapacity;
	}
	public void setTotalCapacity(int totalCapacity) {
		this.totalCapacity = totalCapacity;
	}
	@Id  
	private String id;
	@Column(name = "THEATER_NAME")
	private String theaterName;
	@Column(name="ADDRESS")
	private String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Column(name="AREA")
	private String area;
	@Column(name="City")
	private String city;
	@Column(name="zip")
	private int zip;
	@Column(name="type")
	private char type;
	@Column(name = "NUMBER_OF_SCREENS")
	private int numberOfScreens;
	@Column(name="total_capacity")
	private int totalCapacity;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+theaterName+","+type+","+numberOfScreens+","+","+totalCapacity;
	}
}
