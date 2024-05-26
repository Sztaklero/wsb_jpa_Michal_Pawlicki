package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.persistence.entity.VisitEntity;

public class VisitMapper {
    public static VisitTO toTO(VisitEntity entity) {
        if (entity == null) return null;

        VisitTO to = new VisitTO();
        to.setId(entity.getId());
        to.setDescription(entity.getDescription());
        to.setTime(entity.getTime());
        to.setDoctor(DoctorMapper.toTO(entity.getDoctor()));
        to.setPatient(PatientMapper.toTO(entity.getPatient()));
        return to;
    }

    public static VisitEntity toEntity(VisitTO to) {
        if (to == null) return null;

        VisitEntity entity = new VisitEntity();
        entity.setId(to.getId());
        entity.setDescription(to.getDescription());
        entity.setTime(to.getTime());
        entity.setDoctor(DoctorMapper.toEntity(to.getDoctor()));
        entity.setPatient(PatientMapper.toEntity(to.getPatient()));
        return entity;
    }
}