package com.capgemini.wsb.mapper;


import com.capgemini.wsb.dto.DoctorTo;
import com.capgemini.wsb.persistence.entity.DoctorEntity;

public class DoctorMapper {
    public static DoctorTo toTO(DoctorEntity entity) {
        if (entity == null) return null;

        DoctorTo to = new DoctorTo();
        to.setId(entity.getId());
        to.setFirstName(entity.getFirstName());
        to.setLastName(entity.getLastName());
        to.setEmail(entity.getEmail());
        to.setDoctorNumber(entity.getDoctorNumber());
        to.setSpecialization(entity.getSpecialization());
        return to;
    }

    public static DoctorEntity toEntity(DoctorTo to) {
        if (to == null) return null;

        DoctorEntity entity = new DoctorEntity();
        entity.setId(to.getId());
        entity.setFirstName(to.getFirstName());
        entity.setLastName(to.getLastName());
        entity.setEmail(to.getEmail());
        entity.setDoctorNumber(to.getDoctorNumber());
        entity.setSpecialization(to.getSpecialization());
        return entity;
    }
}
