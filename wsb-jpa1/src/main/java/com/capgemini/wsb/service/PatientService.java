package com.capgemini.wsb.service;

import com.capgemini.wsb.persistence.entity.PatientEntity;

import java.util.List;

public interface PatientService {
    PatientEntity findById(Long id);
    List<PatientEntity> findAll();
    PatientEntity save(PatientEntity patient);
    void delete(Long id);

    void deleteById(Long patientId);
}