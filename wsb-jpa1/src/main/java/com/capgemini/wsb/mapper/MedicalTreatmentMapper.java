package com.capgemini.wsb.mapper;


import com.capgemini.wsb.dto.MedicalTreatmentTO;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;

public class MedicalTreatmentMapper {
    public static MedicalTreatmentTO toTO(MedicalTreatmentEntity entity) {
        if (entity == null) return null;

        MedicalTreatmentTO to = new MedicalTreatmentTO();
        to.setId(entity.getId());
        to.setDescription(entity.getDescription());
        to.setType(entity.getType());
        to.setPatient(PatientMapper.toTO(entity.getPatient()));
        return to;
    }

    public static MedicalTreatmentEntity toEntity(MedicalTreatmentTO to) {
        if (to == null) return null;

        MedicalTreatmentEntity entity = new MedicalTreatmentEntity();
        entity.setId(to.getId());
        entity.setDescription(to.getDescription());
        entity.setType(to.getType());
        entity.setPatient(PatientMapper.toEntity(to.getPatient()));
        return entity;
    }
}
