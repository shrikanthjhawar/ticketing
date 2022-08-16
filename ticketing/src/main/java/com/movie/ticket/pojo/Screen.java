package com.movie.ticket.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Entity
@Table(name = "Screen_Info")
@Service


public class Screen {
	@Id
	@Column(name="screen_id")
	private String screenId;
	
	@Column(name="screen_name")
	private String screenName;
	
	@Column(name="theater_id")
	private String TheaterId;
	
	@Column(name="timing")
	private String timing;
		
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	@Column(name="capacity")
	private int capacity;
	
	
	public String getScreenId() {
		return screenId;
	}
	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}
	public String getTheaterId() {
		return TheaterId;
	}
	public void setTheaterId(String theaterId) {
		TheaterId = theaterId;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	

}
