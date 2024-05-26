package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.dao.impl.AbstractDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.List;
import java.util.Optional;


public interface PatientDao extends Dao<PatientEntity, Long> {

    List<PatientEntity> findByLastName(String lastName);

    List<PatientEntity> findAllPatientsWithMoreVisitsThan(int visitCount);

    List<PatientEntity> findPatientsOlderThan(int age);

    List<PatientEntity> findByAge(int age);

    List<VisitEntity> findVisitsByPatientId(Long patientId);

    Optional <PatientEntity> findById(Long id);

    void deleteById(Long patientId);
}