package com.group5.pbl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group5.pbl.entity.User;


public interface userRepository extends JpaRepository<User,Integer>{
	
//	public User findbyEmailAndPassword(String email,String password);
	
}
