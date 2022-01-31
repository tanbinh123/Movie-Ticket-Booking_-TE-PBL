package com.group5.pbl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group5.pbl.entity.Movie;
import com.group5.pbl.service.movieService;

@RestController
public class movieController {
	
	@Autowired
	movieService service;
	
	@PostMapping
	public String addMovie(Movie movie) {
		service.addmovie(movie);
		String done = "Movie Added";
		return done;
	}
}
