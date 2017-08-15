package com.sispar.model.repositories;

import java.util.List;

import com.sispar.model.entities.User;

public interface IUser {
	List<User> findAllUsers(); 
	User findById(Long id);
	void create(User user);
	void updateUser(User user);
	void deleteUser(User user);
	User authenticateUser(User user);
}
