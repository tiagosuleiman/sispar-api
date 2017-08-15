package com.sispar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sispar.model.entities.Request;
import com.sispar.model.repositories.RequestRepository;

@Service("RequestService")
public class RequestServiceImpl implements RequestService{

	@Autowired
	private RequestRepository requestRepository;
		
	@Override
	public List<Request> findAllRequests() {
		return requestRepository.findAllRequests();
	}

	@Override
	public Request findById(Long id) {
		return requestRepository.findById(id);
	}

	//@Transactional
	@Override
	public void create(Request request) {
		requestRepository.create(request);
	}

	@Override
	public void update(Request request) {
		requestRepository.updateRequest(request);
	}

	@Override
	public void delete(Request request) {
		requestRepository.deleteRequest(request);
	}
}
