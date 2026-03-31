package com.Aditya.DBMS.model;

public class Doctor {
	private String name;
	private int doctorId;
    private String contact;
    private double consultationFee;
    private int specialtyId;
    private boolean isActive;
    
    // Constructor
    public Doctor() {}
	public Doctor(String name, int doctorId, String contact, double consultationFee, int specialtyId,
			boolean isActive) {
		super();
		this.name = name;
		this.doctorId = doctorId;
		this.contact = contact;
		this.consultationFee = consultationFee;
		this.specialtyId = specialtyId;
		this.isActive = isActive;
	}
	
	// Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public double getConsultationFee() {
		return consultationFee;
	}
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	public int getSpecialtyId() {
		return specialtyId;
	}
	public void setSpecialtyId(int specialtyId) {
		this.specialtyId = specialtyId;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
    
    
}
