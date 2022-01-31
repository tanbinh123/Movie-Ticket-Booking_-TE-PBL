package com.group5.pbl.service;

import com.group5.pbl.entity.User;
import com.group5.pbl.exception.userNotFoundException;

public interface userService {
	public User addUser(User user);
	public User loginValidation(User user) throws userNotFoundException;
}
