package com.sispar.model.repositories;

import java.util.List;

import com.sispar.model.entities.Parliamentary;

public interface IParliamentary {
	List<Parliamentary> findAllParliamentaries(); 
	Parliamentary findById(Long id);
	void create(Parliamentary parliamentary);
	void updateParliamentary(Parliamentary parliamentary);
	void deleteParliamentary(Parliamentary parliamentary);
}
