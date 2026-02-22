package com.Aditya.DBMS.presentation;

//ClinicApp.java - Main Application
import java.util.List;
import java.util.Scanner;

import com.Aditya.DBMS.model.Appointment;
import com.Aditya.DBMS.model.Doctor;
import com.Aditya.DBMS.model.Patient;
import com.Aditya.DBMS.service.AppointmentService;
import com.Aditya.DBMS.service.DoctorService;
import com.Aditya.DBMS.service.PatientService;

public class ClinicApp {
 private static Scanner scanner = new Scanner(System.in);
 private static PatientService patientService = new PatientService();
 private static DoctorService doctorService = new DoctorService();
 private static AppointmentService appointmentService = new AppointmentService();
 
 public static void main(String[] args) {
     System.out.println("=== Health Clinic Management System ===");
     showMenu();
 }
 
 private static void showMenu() {
     while (true) {
         System.out.println("\n--- Main Menu ---");
         System.out.println("1. Patient Management");
         System.out.println("2. Doctor Management");
         System.out.println("3. Appointment Booking");
         System.out.println("4. Exit");
         System.out.print("Choose option: ");
         
         int choice = scanner.nextInt();
         scanner.nextLine(); // consume newline
         
         switch (choice) {
             case 1 -> patientMenu();
             case 2 -> doctorMenu();
             case 3 -> appointmentMenu();
             case 4 -> {
                 System.out.println("Thank you for using Clinic App!");
                 return;
             }
             default -> System.out.println("Invalid option!");
         }
     }
 }
 
 private static void patientMenu() {
     System.out.println("\n--- Patient Management ---");
     System.out.println("1. Register New Patient");
     System.out.println("2. Search Patients");
     System.out.println("3. Update Patient");
     System.out.print("Choose option: ");
     
     int choice = scanner.nextInt();
     scanner.nextLine();
     
     switch (choice) {
         case 1 -> registerPatient();
         case 2 -> searchPatients();
         case 3 -> updatePatient();
     }
 }
 
 private static Object updatePatient() {
	// TODO Auto-generated method stub
	return null;
}

 private static void registerPatient() {
     System.out.print("Enter patient name: ");
     String name = scanner.nextLine();
     
     System.out.print("Enter DOB (YYYY-MM-DD): ");
     String dob = scanner.nextLine();
     
     System.out.print("Enter phone: ");
     String phone = scanner.nextLine();
     
     System.out.print("Enter email: ");
     String email = scanner.nextLine();
     
     System.out.print("Enter address: ");
     String address = scanner.nextLine();
     
     System.out.print("Enter blood group: ");
     String bloodGroup = scanner.nextLine();
     
     Patient patient = new Patient(name, dob, phone, email, address, bloodGroup);
     if (patientService.registerPatient(patient)) {
         System.out.println(" Patient registered successfully! ID: " + patient.getPatientId());
     } else {
         System.out.println("Registration failed. Phone/Email may already exist.");
     }
 }
 
 private static void searchPatients() {
     System.out.print("Enter name, phone or ID to search: ");
     String searchTerm = scanner.nextLine();
     
     List<Patient> patients = patientService.searchPatients(searchTerm);
     if (patients.isEmpty()) {
         System.out.println("No patients found.");
     } else {
         System.out.println("\n--- Search Results ---");
         for (Patient p : patients) {
             System.out.printf("ID: %d, Name: %s, Phone: %s, Email: %s%n",
                 p.getPatientId(), p.getName(), p.getPhone(), p.getEmail());
         }
     }
 }
 
 private static void doctorMenu() {
     System.out.println("\n--- Doctor Management ---");
     System.out.println("1. Add Doctor");
     System.out.println("2. View Doctors by Specialty");
     System.out.print("Choose option: ");
     
     int choice = scanner.nextInt();
     scanner.nextLine();
     
     switch (choice) {
         case 1 -> addDoctor();
     }
 }
 
 private static void addDoctor() {
     System.out.print("Enter doctor name: ");
     String name = scanner.nextLine();
     
     System.out.print("Enter contact: ");
     String contact = scanner.nextLine();
     
     System.out.print("Enter consultation fee: ");
     double fee = scanner.nextDouble();
     scanner.nextLine();
     
     System.out.print("Enter specialty ID (1=Cardiology, 2=Neurology, 3=Orthopedics): ");
     int specialtyId = scanner.nextInt();
     
     Doctor doctor = new Doctor(name, contact, fee, specialtyId);
     if (doctorService.addDoctor(doctor)) {
         System.out.println("✅ Doctor added successfully!");
     } else {
         System.out.println("❌ Failed to add doctor.");
     }
 }
 
 private static void appointmentMenu() {
     System.out.println("\n--- Appointment Booking ---");
     System.out.print("Enter patient ID: ");
     int patientId = scanner.nextInt();
     
     System.out.print("Enter doctor ID: ");
     int doctorId = scanner.nextInt();
     scanner.nextLine();
     
     System.out.print("Enter date (YYYY-MM-DD): ");
     String date = scanner.nextLine();
     
     System.out.print("Enter time (HH:MM): ");
     String time = scanner.nextLine();
     
     Appointment appointment = new Appointment(patientId, doctorId, date, time);
     try {
         if (appointmentService.bookAppointment(appointment)) {
             System.out.println("✅ Appointment booked successfully!");
         }
     } catch (IllegalStateException e) {
         System.out.println("❌ " + e.getMessage());
     }
 }
}

