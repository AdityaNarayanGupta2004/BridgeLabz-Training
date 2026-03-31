package com.Aditya.DBMS.service;

import java.util.List;

import com.Aditya.DBMS.dao.AppointmentDao;
import com.Aditya.DBMS.model.Appointment;

//AppointmentService.java
public class AppointmentService {
private AppointmentDao appointmentDAO = new AppointmentDao();

public boolean bookAppointment(Appointment appointment) {
   // Check doctor availability first
   List<Appointment> existing = appointmentDAO.checkDoctorAvailability(
       appointment.getDoctorId(), appointment.getAppointmentDate());
   
   // Simple availability check (max 8 appointments per day)
   if (existing.size() >= 8) {
       throw new IllegalStateException("Doctor not available on selected date");
   }
   
   return appointmentDAO.bookAppointment(appointment);
	}
}