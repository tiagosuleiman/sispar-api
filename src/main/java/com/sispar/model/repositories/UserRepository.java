package com.sispar.model.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sispar.model.entities.User;

@Repository
public class UserRepository 
 			extends AbstractRepository<User> 
					implements IUser{
	
	public List<User> findAllUsers() {
		return findAll();
	}
	
	public User findById(Long id) {
		return getByKey(id);
	}

	public void create(User user) {
		persist(user);
	}

	public void updateUser(User user) {
		update(user);
	}
	
	public void deleteUser(User user) {
		delete(user);		
	}
	
	public User authenticateUser(User user) {
		return this.getEntityManager()
				.createNamedQuery("User.authenticateUser",User.class)
				.setParameter("username", user.getUsername())
				.setParameter("password", user.getPassword())
				.getSingleResult();
	}
	
}
