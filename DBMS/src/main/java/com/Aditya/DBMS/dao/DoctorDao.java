package com.Aditya.DBMS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Aditya.DBMS.db.DataBaseConnection;
import com.Aditya.DBMS.model.Doctor;

public class DoctorDao {
	public boolean addDoctor(Doctor doctor) {
        String sql = "INSERT INTO doctors (name, contact, consultation_fee, specialty_id) VALUES (?, ?, ?, ?)";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            pstmt.setString(1, doctor.getName());
            pstmt.setString(2, doctor.getContact());
            pstmt.setDouble(3, doctor.getConsultationFee());
            pstmt.setInt(4, doctor.getSpecialtyId());
            
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Doctor> getDoctorsBySpecialty(String specialtyName) {
        List<Doctor> doctors = new ArrayList<>();
        String sql = "SELECT d.* FROM doctors d JOIN specialties s ON d.specialty_id = s.specialty_id " +
                    "WHERE s.name = ? AND d.is_active = true";
        
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, specialtyName);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Doctor doctor = new Doctor();
                doctor.setDoctorId(rs.getInt("doctor_id"));
                doctor.setName(rs.getString("name"));
                doctor.setContact(rs.getString("contact"));
                doctor.setConsultationFee(rs.getDouble("consultation_fee"));
                doctor.setSpecialtyId(rs.getInt("specialty_id"));
                doctors.add(doctor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctors;
    }
}
