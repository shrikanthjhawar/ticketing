package com.movie.ticket.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Theater_Hall")
public class TheaterHall {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "NAME")
	private String name;
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
		return ""+name+","+type+","+numberOfScreens+","+","+totalCapacity;
	}
}
