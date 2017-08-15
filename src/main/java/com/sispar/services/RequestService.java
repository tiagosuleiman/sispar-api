package com.sispar.services;

import java.util.List;

import com.sispar.model.entities.Request;

public interface RequestService {
	List<Request> findAllRequests(); 
	Request findById(Long id);
	void create(Request request);
	void update(Request request);
	void delete(Request request);
}
