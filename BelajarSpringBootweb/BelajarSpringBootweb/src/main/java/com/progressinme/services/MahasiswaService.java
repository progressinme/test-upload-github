package com.progressinme.services;

import java.util.List;

import com.progressinme.model.Mahasiswa;

public interface MahasiswaService {
    List<Mahasiswa> listMahasiswa();

    Mahasiswa saveOrUpdate(Mahasiswa mahasiswa);

    Mahasiswa getIdMahasiswa(Integer id);

    void deleteMahasiswa(Integer id);
}
