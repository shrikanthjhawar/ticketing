package com.movie.ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticket.pojo.Screen;
import com.movie.ticket.repository.ScreenRepository;

@Service
public class ScreenServiceImpl implements ScreenService {
	@Autowired
	 private ScreenRepository screenRepository;

	@Override
	public Screen saveScreen(Screen screen) {
		// TODO Auto-generated method stub
		return screenRepository.save(screen);
	}

}
