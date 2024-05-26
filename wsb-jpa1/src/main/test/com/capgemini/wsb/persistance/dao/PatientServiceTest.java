package com.capgemini.wsb.persistance.dao;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.service.impl.PatientServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class PatientServiceTest {

    @Mock
    private PatientDao patientDao;

    @InjectMocks
    private PatientServiceImpl patientService;

    @Test
    public void testGetPatientById() {

        Long patientId = 1L;
        PatientEntity mockPatient = new PatientEntity();
        mockPatient.setId(patientId);
        mockPatient.setFirstName("Marta");
        mockPatient.setLastName("Zielińska");

        when(patientDao.findById(patientId)).thenReturn(Optional.of(mockPatient));

        PatientEntity result = patientService.findById(patientId);

        assertNotNull(result);
        assertEquals(patientId, result.getId());
        assertEquals("Marta", result.getFirstName());
        assertEquals("Zielińska", result.getLastName());

        verify(patientDao, times(1)).findById(patientId);
    }

    @Test
    public void testGetPatientByIdNotFound() {

        Long patientId = 333L;

        when(patientDao.findById(patientId)).thenReturn(Optional.empty());

        PatientEntity result = patientService.findById(patientId);

        assertNull(result);

        verify(patientDao, times(1)).findById(patientId);
    }

    @Test
    public void testDeletePatientById() {

        Long patientId = 2L;

        doNothing().when(patientDao).deleteById(patientId);

        patientService.deleteById(patientId);

        verify(patientDao, times(1)).deleteById(patientId);
    }

    @Test
    public void testCascadeDeleteVisits() {

        Long patientId = 3L;

        doNothing().when(patientDao).deleteById(patientId);

        patientService.deleteById(patientId);

        verify(patientDao, times(1)).deleteById(patientId);

    }
}