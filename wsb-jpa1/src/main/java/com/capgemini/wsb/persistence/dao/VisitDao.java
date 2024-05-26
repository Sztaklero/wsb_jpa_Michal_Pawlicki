package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.VisitEntity;

public interface VisitDao extends Dao<VisitEntity, Integer>
{

    VisitEntity findById(Long id);

    void deleteById(Long id);
}