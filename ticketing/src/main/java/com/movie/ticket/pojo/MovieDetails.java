package com.movie.ticket.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="MOVIE_DETAILS")
@Entity(name = "MOVIE_DETAILS")
public class MovieDetails {
	
	@Id
	private String movieId;
	
	@Column(name="MOVIE_NAME")
	private String movieName;
	
	@Column(name="MOVIE_CAST")
	private String movieCast;
	
	@Column(name="LANGUAGE")
	private String language;
	
	@Column(name="GENERE")
	private String genere;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getCast() {
		return movieCast;
	}

	public void setCast(String cast) {
		this.movieCast = cast;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
	
}
