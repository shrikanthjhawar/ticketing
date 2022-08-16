package com.movie.ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.movie.ticket.pojo.DisplayMovieToUserDTO;
import com.movie.ticket.pojo.MovieInfo;

public interface MovieInfoRepository extends JpaRepository<MovieInfo, String>{
	

	//@Query(value = "select new com.movie.ticket.pojo.DisplayMovieToUserDTO (MOVIE_NAME,THEATER_NAME)"+
	//"from MOVIE_DETAILS, MOVIE_INFO, THEATER_HALL where MOVIE_DETAILS.MOVIE_ID=MOVIE_INFO.MOVIE_ID and THEATER_HALL.ID = MOVIE_INFO.ID",nativeQuery = true)
	
	@Query(value="select movie_name from movie_details",nativeQuery=true)
	
	//@Query(value = "SELECT new com.bethelcrm.bbcmembersmanagementsystem.dto.ZoneMemDto(z.name, m.first_name, m.last_name)"+
	//"FROM members_test m JOIN zones_test z WHERE z.zone_id = m.zone_id", nativeQuery = true).
	
	List<DisplayMovieToUserDTO> queryBy();

}
