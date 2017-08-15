package com.sispar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sispar.model.entities.User;
import com.sispar.model.repositories.UserRepository;

@Service("UserService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
		
	@Override
	public List<User> findAllUsers() {
		return userRepository.findAllUsers();
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id);
	}

	//@Transactional
	@Override
	public void create(User user) {
		userRepository.create(user);
	}

	@Override
	public void update(User user) {
		userRepository.updateUser(user);
	}

	@Override
	public void delete(User user) {
		userRepository.deleteUser(user);
	}
	
	public User authenticateUser(User user) {
		return userRepository.authenticateUser(user);
	}

}	