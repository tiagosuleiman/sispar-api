package com.sispar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sispar.model.entities.Specialty;
import com.sispar.model.repositories.SpecialtyRepository;

@Service("SpecialtyService")
public class SpecialtyServiceImpl implements SpecialtyService{
	
	@Autowired
	private SpecialtyRepository specialtyRepository;
		
	@Override
	public List<Specialty> findAll() {
		return specialtyRepository.findAll();
	}

	@Override
	public Specialty findById(Long id) {
		return specialtyRepository.findById(id);
	}

	//@Transactional
	@Override
	public void create(Specialty specialty) {
		specialtyRepository.create(specialty);
	}

	@Override
	public void update(Specialty specialty) {
		specialtyRepository.updateSpecialty(specialty);
	}

	@Override
	public void delete(Specialty specialty) {
		specialtyRepository.deleteSpecialty(specialty);
	}

	@Override
	public List<Specialty> findAllSpecialtiesEnabledExames() {
		return specialtyRepository.findAllSpecialtiesEnabledExames();
	}

	@Override
	public List<Specialty> findAllSpecialtiesEnabledConsultas() {
		return specialtyRepository.findAllSpecialtiesEnabledConsultas();
	}

	@Override
	public List<Specialty> findAllSpecialtiesEnabledCirurgias() {
		return specialtyRepository.findAllSpecialtiesEnabledCirurgias();
	}
}
