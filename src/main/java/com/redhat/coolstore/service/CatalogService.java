package com.redhat.coolstore.service;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.inject.Inject;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.redhat.coolstore.model.*;

@Stateless
public class CatalogService {

    
    @Inject
    Logger log;

    @PersistenceContext
	private EntityManager em;
    
	public CatalogService() {
	}

	public List<Product> getProducts() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<ProductEntity> criteria = cb.createQuery(ProductEntity.class);
        Root<ProductEntity> member = criteria.from(ProductEntity.class);
        criteria.select(member);
        return em.createQuery(criteria).getResultList().stream().map( entity -> new Product(entity) ).collect(Collectors.toList());
    }

    public Product getProductByItemId(String itemId) {
        ProductEntity entity = em.find(ProductEntity.class, itemId);
        if(entity==null)
            return null;   
        return new Product(entity);
    }

}
