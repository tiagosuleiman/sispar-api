package com.sispar.model.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sispar.model.entities.Request;

@Repository
public class RequestRepository 
 			extends AbstractRepository<Request> 
					implements IRequest{

	@Override
	public List<Request> findAllRequests() {
		return findAll();
	}

	@Override
	public Request findById(Long id) {
		return getByKey(id);
	}

	public void create(Request request) {
		persist(request);
	}

	public void updateRequest(Request request) {
		update(request);
	}
	
	@Override
	public void deleteRequest(Request request) {
		delete(request);		
	}

	
	
}
