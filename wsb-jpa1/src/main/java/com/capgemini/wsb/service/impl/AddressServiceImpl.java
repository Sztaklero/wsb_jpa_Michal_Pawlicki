package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.AddressTO;
import com.capgemini.wsb.mapper.AddressMapper;
import com.capgemini.wsb.persistence.dao.AddressDao;
import com.capgemini.wsb.persistence.entity.AddressEntity;
import com.capgemini.wsb.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class AddressServiceImpl implements AddressService {
    private final AddressDao addressDao;

    @Autowired
    public AddressServiceImpl(AddressDao pAddressDao) {
        addressDao = pAddressDao;
    }

    @Override
    public AddressTO findById(Long id) {
        final AddressEntity entity = addressDao.findOne(id);
        return AddressMapper.mapToTO(entity);
    }
    @Override
    public List<AddressEntity> findAll() {
        return addressDao.findAll();
    }

    @Override
    public AddressEntity save(AddressEntity address) {
        return addressDao.save(address);
    }

    @Override
    public void delete(Long id) {
        addressDao.delete(id);
    }
}