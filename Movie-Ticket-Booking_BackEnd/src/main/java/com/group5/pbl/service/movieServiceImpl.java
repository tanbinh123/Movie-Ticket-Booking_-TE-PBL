package com.group5.pbl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group5.pbl.entity.Movie;
import com.group5.pbl.repository.movieRepository;

@Service
public class movieServiceImpl implements movieService {

	@Autowired
	movieRepository movieRepo;
	
	public Movie addmovie(Movie movie)  {
		
		movieRepo.save(movie);
		return movie;
	}
}
