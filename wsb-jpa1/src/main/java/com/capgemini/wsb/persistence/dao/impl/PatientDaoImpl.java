package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.dao.impl.AbstractDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.springframework.stereotype.Repository;
import com.capgemini.wsb.persistence.dao.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<PatientEntity> findByLastName(String lastName) {
        return entityManager.createQuery("SELECT p FROM PatientEntity p WHERE p.lastName = :lastName", PatientEntity.class)
                .setParameter("lastName", lastName)
                .getResultList();
    }

    @Override
    public List<PatientEntity> findAllPatientsWithMoreVisitsThan(int visitCount) {
        return entityManager.createQuery("SELECT p FROM PatientEntity p WHERE size(p.visits) > :visitCount", PatientEntity.class)
                .setParameter("visitCount", visitCount)
                .getResultList();
    }

    @Override
    public List<PatientEntity> findPatientsOlderThan(int age) {
        LocalDate birthDateThreshold = LocalDate.now().minusYears(age);
        String birthDateThresholdString = birthDateThreshold.toString();
        return entityManager.createQuery("SELECT p FROM PatientEntity p WHERE p.dateOfBirth < :birthDateThreshold", PatientEntity.class)
                .setParameter("birthDateThreshold", birthDateThresholdString)
                .getResultList();
    }


    @Override
    public List<PatientEntity> findByAge(int age) {
        return entityManager.createQuery("SELECT p FROM PatientEntity p WHERE p.age = :age", PatientEntity.class)
                .setParameter("age", age)
                .getResultList();
    }
    @Override
    public List<VisitEntity> findVisitsByPatientId(Long patientId) {
        return entityManager.createQuery("SELECT v FROM VisitEntity v WHERE v.patient.id = :patientId", VisitEntity.class)
                .setParameter("patientId", patientId)
                .getResultList();
    }

    @Override
    public Optional<PatientEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long patientId) {

    }
}