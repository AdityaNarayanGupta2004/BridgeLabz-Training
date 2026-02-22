package com.Aditya.DBMS.service;

import java.util.List;

import com.Aditya.DBMS.dao.DoctorDao;
import com.Aditya.DBMS.model.Doctor;

//DoctorService.java
public class DoctorService {
private DoctorDao doctorDAO = new DoctorDao();

public boolean addDoctor(Doctor doctor) {
   // Business validation
   if (doctor.getConsultationFee() <= 0) {
       throw new IllegalArgumentException("Consultation fee must be positive");
   }
   return doctorDAO.addDoctor(doctor);
}

public List<Doctor> getDoctorsBySpecialty(String specialtyName) {
   return doctorDAO.getDoctorsBySpecialty(specialtyName);
}
}