package com.Aditya.DBMS.service;

import java.util.ArrayList;
//PatientService.java
import java.util.List;

import com.Aditya.DBMS.dao.PatientDao;
import com.Aditya.DBMS.model.Patient;

public class PatientService {
 private PatientDao patientDAO = new PatientDao();
 
 public boolean registerPatient(Patient patient) {
     // Business validation
     if (patient.getName() == null || patient.getName().trim().isEmpty()) {
         throw new IllegalArgumentException("Patient name is required");
     }
     if (patient.getPhone() == null || patient.getPhone().trim().isEmpty()) {
         throw new IllegalArgumentException("Phone number is required");
     }
     return patientDAO.registerPatient(patient);
 }
 
 public List<Patient> searchPatients(String searchTerm) {
     if (searchTerm == null || searchTerm.trim().isEmpty()) {
         return new ArrayList<>();
     }
     return patientDAO.searchPatientsByName(searchTerm);
 }

}
