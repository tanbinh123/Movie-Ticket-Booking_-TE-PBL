package com.group5.pbl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.group5.pbl.entity.Movie;
import com.group5.pbl.service.movieService;

@RestController
public class movieController {
	
	@Autowired
	movieService service;
	
	@PostMapping("/addMovie")
	public String addMovie(@RequestBody Movie movie) {
		service.addmovie(movie);
		System.out.println(movie.getDescription());
		String done = "Movie Added";
		return done;
	}
}
