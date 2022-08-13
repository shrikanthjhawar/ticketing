package com.movie.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan( basePackages ="com.movie.ticket.*")
@EntityScan( "com.movie.ticket.*")
@EnableJpaRepositories(basePackages = "com.movie.ticket.repository")
public class MovieTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketApplication.class, args);
	}

}
