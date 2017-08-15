package com.sispar.model.repositories;

import java.util.List;

import com.sispar.model.entities.Request;

public interface IRequest {
	List<Request> findAllRequests(); 
	Request findById(Long id);
	void create(Request request);
	void updateRequest(Request request);
	void deleteRequest(Request request);
}
