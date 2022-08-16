package com.movie.ticket.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCREEN_DETAILS")

public class ScreenDetails {
	
	@Id
	private int id;
	
	@Column(name="THEATER_ID")
	private String theaterId;
	
	@Column(name="SCREEN_ID")
	private String screenId;
	
	@Column(name="MOVIE_ID")
	private String movie_id;
	
	@Column(name="TIME")
	private String timing;

}
