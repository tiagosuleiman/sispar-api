package com.sispar.model.repositories;

import java.util.List;

import com.sispar.model.entities.Specialty;

public interface ISpecialty {
	List<Specialty> findAllSpecialties(); 
	Specialty findById(Long id);
	void create(Specialty specialty);
	void updateSpecialty(Specialty specialty);
	void deleteSpecialty(Specialty specialty);
}
