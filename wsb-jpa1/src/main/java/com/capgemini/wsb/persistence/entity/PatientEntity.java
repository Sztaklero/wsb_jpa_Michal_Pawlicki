package com.capgemini.wsb.persistence.entity;

import java.time.LocalDate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "patient")
public class PatientEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String telephoneNumber;
	private String email;
	private String patientNumber;
	private String dateOfBirth;
	private int age; // Nowe pole

	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<VisitEntity> visits = new HashSet<>();


	@OneToMany(mappedBy = "patient")
	private Set<MedicalTreatmentEntity> medicalTreatments = new HashSet<>();



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Set<VisitEntity> getVisits() {
		return visits;
	}

	public void setVisits(Set<VisitEntity> visits) {
		this.visits = visits;
	}

	public Set<MedicalTreatmentEntity> getMedicalTreatments() {
		return medicalTreatments;
	}

	public void setMedicalTreatments(Set<MedicalTreatmentEntity> medicalTreatments) {
		this.medicalTreatments = medicalTreatments;
	}
	public int getAge() {
        return age;
    }
	public void setAge(int age) {}

	public void setName(String johnDoe) {
	}

	public String getName() {
			return null;
	}

	public String getAdditionalField() {
			return null;
	}

	public void setAdditionalField(String dodatkowePole) {

	}
}
