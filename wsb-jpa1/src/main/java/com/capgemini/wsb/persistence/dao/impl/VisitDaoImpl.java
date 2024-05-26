package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.VisitDao;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.springframework.stereotype.Repository;

@Repository
public class VisitDaoImpl extends AbstractDao<VisitEntity, Integer> implements VisitDao
{

    @Override
    public VisitEntity findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}