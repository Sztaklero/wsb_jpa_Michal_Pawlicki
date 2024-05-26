package com.capgemini.wsb.dto;

public class MedicalTreatmentTO {
    private Long id;
    private String description;
    private String type;
    private PatientTO patient;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PatientTO getPatient() {
        return patient;
    }

    public void setPatient(PatientTO patient) {
        this.patient = patient;
    }
}