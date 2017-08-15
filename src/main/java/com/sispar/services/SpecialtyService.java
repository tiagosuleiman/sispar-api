package com.sispar.services;

import java.util.List;

import com.sispar.model.entities.Specialty;

public interface SpecialtyService {
	List<Specialty> findAllSpecialtiesEnabledExames();
	List<Specialty> findAllSpecialtiesEnabledConsultas();
	List<Specialty> findAllSpecialtiesEnabledCirurgias();
	List<Specialty> findAll(); 
	Specialty findById(Long id);
	void create(Specialty specialty);
	void update(Specialty specialty);
	void delete(Specialty specialty);
}
