package com.Aditya.DBMS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Aditya.DBMS.db.DataBaseConnection;
import com.Aditya.DBMS.model.Appointment;

public class AppointmentDao {
	public boolean bookAppointment(Appointment appointment) {
        String sql = "INSERT INTO appointments (patient_id, doctor_id, appointment_date, appointment_time) VALUES (?, ?, ?, ?)";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            pstmt.setInt(1, appointment.getPatientId());
            pstmt.setInt(2, appointment.getDoctorId());
            pstmt.setString(3, appointment.getAppointmentDate());
            pstmt.setString(4, appointment.getAppointmentTime());
            
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Appointment> checkDoctorAvailability(int doctorId, String date) {
        List<Appointment> appointments = new ArrayList<>();
        String sql = "SELECT * FROM appointments WHERE doctor_id = ? AND appointment_date = ? AND status = 'SCHEDULED'";
        
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, doctorId);
            pstmt.setString(2, date);
            
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Appointment appt = new Appointment();
                appt.setAppointmentId(rs.getInt("appointment_id"));
                appt.setPatientId(rs.getInt("patient_id"));
                appt.setDoctorId(rs.getInt("doctor_id"));
                appt.setAppointmentDate(rs.getString("appointment_date"));
                appt.setAppointmentTime(rs.getString("appointment_time"));
                appointments.add(appt);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointments;
    }
}
