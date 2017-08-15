package com.sispar.services;

import java.util.List;

import com.sispar.model.entities.Parliamentary;

public interface ParliamentaryService {
	List<Parliamentary> findParliamentariesEnabled();
	List<Parliamentary> findAll(); 
	Parliamentary findById(Long id);
	void create(Parliamentary request);
	void update(Parliamentary request);
	void delete(Parliamentary request);
}
