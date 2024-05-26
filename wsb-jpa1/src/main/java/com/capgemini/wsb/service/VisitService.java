package com.capgemini.wsb.service;

import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.List;

public interface VisitService {
    VisitEntity findById(Long id);
    List<VisitEntity> findAll();
    VisitEntity save(VisitEntity visit);
    void delete(Long id);
}
