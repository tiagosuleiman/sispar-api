package com.sispar.model.repositories;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.sispar.model.entities.Parliamentary;

@Repository
public class ParliamentaryRepository 
             extends AbstractRepository<Parliamentary> 
                  implements IParliamentary {

	
	public List<Parliamentary> findParliamentariesEnabled() {
		String jpql = "select p from Parliamentary p where p.enabled = :active";
		TypedQuery<Parliamentary> query = getEntityManager()
				.createQuery(jpql, Parliamentary.class);
		query.setParameter("active", true);
		try {
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}
	
	
	@Override
	public List<Parliamentary> findAllParliamentaries() {
		return findAll();
	}

	@Override
	public Parliamentary findById(Long id) {
		return getByKey(id);
	}

	public void create(Parliamentary parliamentary) {
		persist(parliamentary);
	}

	public void updateParliamentary(Parliamentary parliamentary) {
		update(parliamentary);
	}

	@Override
	public void deleteParliamentary(Parliamentary parliamentary) {
		delete(parliamentary);
	}

}
