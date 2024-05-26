package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;

import java.util.Optional;

public interface MedicalTreatmentDao extends Dao<MedicalTreatmentEntity, Integer>
{

    void deleteById(Long id);

    Optional<MedicalTreatmentEntity> findById(Long id);
}