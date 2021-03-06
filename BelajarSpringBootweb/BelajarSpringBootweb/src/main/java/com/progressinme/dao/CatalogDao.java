package com.progressinme.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.progressinme.model.Catalog;
import com.progressinme.services.CatalogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogDao implements CatalogService {
    private EntityManagerFactory emf;

    @Autowired
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Catalog> listCatalog() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Catalog", Catalog.class).getResultList();
    }

}
