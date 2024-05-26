package com.capgemini.wsb.persistance.dao;

import static org.assertj.core.api.Assertions.assertThat;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PatientDaoTest {

    @Autowired
    private PatientDao patientDao;

    @Test
    public void testFindByLastName() {
        List<PatientEntity> patients = patientDao.findByLastName("Zielińska");
        assertNotNull(patients);
        assertEquals(1, patients.size());
        assertEquals("Marta", patients.get(0).getFirstName());
    }

    @Test
    public void testFindAllPatientsWithMoreVisitsThan() {
        List<PatientEntity> patients = patientDao.findAllPatientsWithMoreVisitsThan(2);
        assertNotNull(patients);
        assertEquals(5, patients.size());
    }

    @Test
    public void testFindPatientsOlderThan() {
        List<PatientEntity> patients = patientDao.findPatientsOlderThan(30);
        assertNotNull(patients);
        assertTrue(patients.size() > 0);
    }

    @Test
    public void testFindByAge() {
        List<PatientEntity> patients = patientDao.findByAge(39);
        assertNotNull(patients);
        assertEquals(2, patients.size());
    }
    @Test
    public void testFindVisitsByPatientId() {
        List<VisitEntity> visits = patientDao.findVisitsByPatientId(1L);
        assertNotNull(visits);
        assertTrue(visits.size() > 0);
    }
}