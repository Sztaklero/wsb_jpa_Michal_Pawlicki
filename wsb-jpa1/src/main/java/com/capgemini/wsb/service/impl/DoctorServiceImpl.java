package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.persistence.dao.DoctorDao;
import com.capgemini.wsb.persistence.entity.DoctorEntity;
import com.capgemini.wsb.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorDao doctorDao;

    public DoctorServiceImpl(DoctorDao doctorDao) {
        this.doctorDao = doctorDao;
    }

    @Override
    public DoctorEntity findById(Long id) {
        return null;
    }

    @Override
    public List<DoctorEntity> findAll() {
        return doctorDao.findAll();
    }

    @Override
    public DoctorEntity save(DoctorEntity doctor) {
        return doctorDao.save(doctor);
    }

    @Override
    public void delete(Long id) {
        doctorDao.deleteById(id);
    }
}