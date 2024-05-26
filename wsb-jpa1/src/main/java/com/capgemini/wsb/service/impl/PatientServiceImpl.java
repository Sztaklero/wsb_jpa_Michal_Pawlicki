package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientDao patientDao;

    public PatientServiceImpl(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @Override
    public PatientEntity findById(Long id) {
        return patientDao.findById(id).orElse(null);
    }

    @Override
    public List<PatientEntity> findAll() {
        return patientDao.findAll();
    }

    @Override
    public PatientEntity save(PatientEntity patient) {
        return patientDao.save(patient);
    }

    @Override
    public void delete(Long id) {
        patientDao.delete(id);
    }

    @Override
    public void deleteById(Long patientId) {
        patientDao.deleteById(patientId);
    }
}
