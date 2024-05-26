package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.persistence.dao.MedicalTreatmentDao;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import com.capgemini.wsb.service.MedicalTreatmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalTreatmentServiceImpl implements MedicalTreatmentService {

    private final MedicalTreatmentDao medicalTreatmentDao;

    public MedicalTreatmentServiceImpl(MedicalTreatmentDao medicalTreatmentDao) {
        this.medicalTreatmentDao = medicalTreatmentDao;
    }

    @Override
    public MedicalTreatmentEntity findById(Long id) {
        return medicalTreatmentDao.findById(id).orElse(null);
    }

    @Override
    public List<MedicalTreatmentEntity> findAll() {
        return medicalTreatmentDao.findAll();
    }

    @Override
    public MedicalTreatmentEntity save(MedicalTreatmentEntity medicalTreatment) {
        return medicalTreatmentDao.save(medicalTreatment);
    }

    @Override
    public void delete(Long id) {
        medicalTreatmentDao.deleteById(id);
    }
}