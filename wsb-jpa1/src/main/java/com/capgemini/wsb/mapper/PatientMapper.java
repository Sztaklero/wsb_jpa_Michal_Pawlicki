package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;

import java.util.stream.Collectors;

public class PatientMapper {
    public static PatientTO toTO(PatientEntity entity) {
        if (entity == null) return null;

        PatientTO to = new PatientTO();
        to.setId(entity.getId());
        to.setFirstName(entity.getFirstName());
        to.setLastName(entity.getLastName());
        to.setTelephoneNumber(entity.getTelephoneNumber());
        to.setEmail(entity.getEmail());
        to.setPatientNumber(entity.getPatientNumber());
        to.setDateOfBirth(entity.getDateOfBirth());
        to.setAge(entity.getAge());
        to.setVisits(entity.getVisits().stream().map(VisitMapper::toTO).collect(Collectors.toSet()));
        return to;
    }

    public static PatientEntity toEntity(PatientTO to) {
        if (to == null) return null;

        PatientEntity entity = new PatientEntity();
        entity.setId(to.getId());
        entity.setFirstName(to.getFirstName());
        entity.setLastName(to.getLastName());
        entity.setTelephoneNumber(to.getTelephoneNumber());
        entity.setEmail(to.getEmail());
        entity.setPatientNumber(to.getPatientNumber());
        entity.setDateOfBirth(to.getDateOfBirth());
        entity.setAge(to.getAge());
        entity.setVisits(to.getVisits().stream().map(VisitMapper::toEntity).collect(Collectors.toSet()));
        return entity;
    }
}
