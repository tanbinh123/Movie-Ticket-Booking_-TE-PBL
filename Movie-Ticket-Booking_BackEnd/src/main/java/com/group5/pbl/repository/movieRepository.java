package com.group5.pbl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group5.pbl.entity.Movie;
import com.group5.pbl.entity.User;

public interface movieRepository extends JpaRepository< Movie ,Integer>{

	
	
}
