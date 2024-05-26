package com.capgemini.wsb.service;

import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;

import java.util.List;

public interface MedicalTreatmentService {
    MedicalTreatmentEntity findById(Long id);
    List<MedicalTreatmentEntity> findAll();
    MedicalTreatmentEntity save(MedicalTreatmentEntity medicalTreatment);
    void delete(Long id);
}
