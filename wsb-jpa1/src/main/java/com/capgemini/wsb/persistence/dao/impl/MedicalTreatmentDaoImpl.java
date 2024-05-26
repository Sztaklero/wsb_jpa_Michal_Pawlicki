package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.MedicalTreatmentDao;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MedicalTreatmentDaoImpl extends AbstractDao<MedicalTreatmentEntity, Integer> implements MedicalTreatmentDao
{

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Optional<MedicalTreatmentEntity> findById(Long id) {
        return Optional.ofNullable(entityManager.find(MedicalTreatmentEntity.class, id));
    }
}