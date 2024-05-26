package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.AddressTO;
import com.capgemini.wsb.persistence.entity.AddressEntity;

import java.util.List;

public interface AddressService
{
    public AddressTO findById(final Long id);
    List<AddressEntity> findAll();
    AddressEntity save(AddressEntity address);
    void delete(Long id);
}
