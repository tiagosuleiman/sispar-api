package com.sispar.model.repositories;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
 
public abstract class AbstractRepository<T> {
     
	protected Class<T> typeClass = returnTypeClass();
     
    @PersistenceContext(unitName = "sispar-ds")
    EntityManager entityManager;
     
    protected EntityManager getEntityManager(){
        return this.entityManager;
    }
 
    protected T getByKey(long id) {
        return (T) entityManager.find(typeClass, id);
    }
 
    protected void persist(T entity) {
        entityManager.persist(entity);
    }
     
    protected void update(T entity) {
        entityManager.merge(entity);
    }
 
    protected void delete(T entity) {
        entityManager.remove(entity);
    }
 
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		CriteriaQuery<Object> cq = entityManager.getCriteriaBuilder().createQuery();
		cq.select(cq.from(typeClass));
		return (List<T>) entityManager.createQuery(cq).getResultList();
	}
    
	@SuppressWarnings({ "unchecked" })
	private Class<T> returnTypeClass() {
		Class<?> clazz = this.getClass();
		while (!clazz.getSuperclass().equals(AbstractRepository.class)) {
			clazz = clazz.getSuperclass();
		}
		ParameterizedType genericType = (ParameterizedType) clazz.getGenericSuperclass();
		return (Class<T>) genericType.getActualTypeArguments()[0];
	}
}