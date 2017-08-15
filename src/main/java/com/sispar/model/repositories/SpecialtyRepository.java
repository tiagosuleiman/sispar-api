package com.sispar.model.repositories;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.sispar.model.entities.Specialty;

@Repository
public class SpecialtyRepository 
             extends AbstractRepository<Specialty> 
                  implements ISpecialty{

	
	public List<Specialty> findAllSpecialtiesEnabledExames() {
		StringBuffer jpql = new StringBuffer("select s from Specialty s");
		jpql.append(" where s.procedimento =:procedimento and s.enabled = :active");
		TypedQuery<Specialty> query = getEntityManager()
				.createQuery(jpql.toString(), Specialty.class);
		query.setParameter("procedimento", "EXAME");
		query.setParameter("active", true);
		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<Specialty> findAllSpecialtiesEnabledConsultas() {
		StringBuffer jpql = new StringBuffer("select s from Specialty s");
		jpql.append(" where s.procedimento =:procedimento and s.enabled = :active");
		TypedQuery<Specialty> query = getEntityManager()
				.createQuery(jpql.toString(), Specialty.class);
		query.setParameter("procedimento", "CONSULTA");
		query.setParameter("active", true);
		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<Specialty> findAllSpecialtiesEnabledCirurgias() {
		StringBuffer jpql = new StringBuffer("select s from Specialty s");
		jpql.append(" where s.procedimento =:procedimento and s.enabled = :active");
		TypedQuery<Specialty> query = getEntityManager()
				.createQuery(jpql.toString(), Specialty.class);
		query.setParameter("procedimento", "CIRURGIA");
		query.setParameter("active", true);
		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}
	
	
	@Override
	public List<Specialty> findAllSpecialties() {
		return findAll();
	}

	@Override
	public Specialty findById(Long id) {
		return getByKey(id);
	}

	public void create(Specialty specialty) {
		persist(specialty);
	}

	public void updateSpecialty(Specialty specialty) {
		update(specialty);
	}

	@Override
	public void deleteSpecialty(Specialty specialty) {
		delete(specialty);
	}

}
