package com.progressinme.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.progressinme.model.Mahasiswa;
import com.progressinme.services.MahasiswaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MahasiswaDao implements MahasiswaService {

    private EntityManagerFactory emf;

    @Autowired
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Mahasiswa> listMahasiswa() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Mahasiswa", Mahasiswa.class).getResultList();
    }

    @Override
    public Mahasiswa saveOrUpdate(Mahasiswa mahasiswa) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Mahasiswa saved = em.merge(mahasiswa);
        em.getTransaction().commit();
        return saved;
    }

    @Override
    public Mahasiswa getIdMahasiswa(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Mahasiswa.class, id);
    }

    @Override
    public void deleteMahasiswa(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Mahasiswa.class, id));
        em.getTransaction().commit();
    }

}
