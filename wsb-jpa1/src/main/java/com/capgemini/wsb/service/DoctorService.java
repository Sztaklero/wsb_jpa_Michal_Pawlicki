package com.capgemini.wsb.service;

import com.capgemini.wsb.persistence.entity.DoctorEntity;

import java.util.List;

public interface DoctorService {
    DoctorEntity findById(Long id);
    List<DoctorEntity> findAll();
    DoctorEntity save(DoctorEntity doctor);
    void delete(Long id);
}