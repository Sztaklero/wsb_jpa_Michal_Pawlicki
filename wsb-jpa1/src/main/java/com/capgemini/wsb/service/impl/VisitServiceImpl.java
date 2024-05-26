package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.persistence.dao.VisitDao;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.service.VisitService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitServiceImpl implements VisitService {

    private final VisitDao visitDao;

    public VisitServiceImpl(VisitDao visitDao) {
        this.visitDao = visitDao;
    }

    @Override
    public VisitEntity findById(Long id) {
        return visitDao.findById(id).orElse(null);
    }

    @Override
    public List<VisitEntity> findAll() {
        return visitDao.findAll();
    }

    @Override
    public VisitEntity save(VisitEntity visit) {
        return visitDao.save(visit);
    }

    @Override
    public void delete(Long id) {
        visitDao.deleteById(id);
    }
}
