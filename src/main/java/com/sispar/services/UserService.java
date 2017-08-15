package com.sispar.services;

import java.util.List;

import com.sispar.model.entities.User;

public interface UserService {
	List<User> findAllUsers(); 
	User findById(Long id);
	void create(User user);
	void update(User user);
	void delete(User user);
	User authenticateUser(User user);
}
