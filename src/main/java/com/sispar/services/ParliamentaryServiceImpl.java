package com.sispar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sispar.model.entities.Parliamentary;
import com.sispar.model.repositories.ParliamentaryRepository;

@Service("ParliamentaryService")
public class ParliamentaryServiceImpl implements ParliamentaryService{
	
	@Autowired
	private ParliamentaryRepository parliamentaryRepository;
		
	@Override
	public List<Parliamentary> findAll() {
		return parliamentaryRepository.findAll();
	}

	@Override
	public Parliamentary findById(Long id) {
		return parliamentaryRepository.findById(id);
	}

	//@Transactional
	@Override
	public void create(Parliamentary parliamentary) {
		parliamentaryRepository.create(parliamentary);
	}

	@Override
	public void update(Parliamentary parliamentary) {
		parliamentaryRepository.updateParliamentary(parliamentary);
	}

	@Override
	public void delete(Parliamentary parliamentary) {
		parliamentaryRepository.deleteParliamentary(parliamentary);
	}

	@Override
	public List<Parliamentary> findParliamentariesEnabled() {
		return parliamentaryRepository.findParliamentariesEnabled();
	}
}
