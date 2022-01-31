package com.group5.pbl.service;

import java.util.Optional;

import javax.transaction.Transactional;

import com.group5.pbl.exception.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group5.pbl.entity.User;
import com.group5.pbl.exception.userNotFoundException;
import com.group5.pbl.repository.userRepository;

@Service
@Transactional
public class userServiceImpl implements userService {

	@Autowired
	userRepository userRepo;
	
	public User addUser(User user) {
		userRepo.save(user);
		return user;
	}
	
	public User loginValidation(User user) throws userNotFoundException  {
		User userObj = null;
		String email = user.getEmail();
		String password = user.getPassword();
		Integer id = user.getId();

		
		if(email!=null && password!=null)
		{
//			userObj = userRepo.findById(id);
		}
		if(userObj == null) {
			throw new userNotFoundException("Email and Password Does not Match");
		}
		return userObj;
		
	}
		
}
