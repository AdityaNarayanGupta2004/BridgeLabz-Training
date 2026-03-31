package com.Aditya.DBMS.dao;

import java.sql.Connection;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.Aditya.DBMS.db.DataBaseConnection;
import com.Aditya.DBMS.model.Patient;

public class PatientDao {
	
	public boolean registerPatient(Patient patient) {
		String sql = "INSERT INTO patient (name, dob, phone, email, address, blood_group) VALUES(?,?,?,?,?,?)";
		try(Connection con = DataBaseConnection.getConnection();
		PreparedStatement ps  = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			ps.setString(1, patient.getName());
			ps.setString(2, patient.getDob());
			ps.setString(3, patient.getPhone());
			ps.setString(4, patient.getEmail());
			ps.setString(5, patient.getAddress());
			ps.setString(6, patient.getBloodGroup());
			
			int rows = ps.executeUpdate();
			if(rows > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				if(rs.next()) {
					patient.setPatientId(rs.getInt(1));
				}
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean updatePatient(Patient patient) {
		String sql = "UPDATE patirnt  SET name=?, dob=?, phone=?, email=? address=?, blood_group =?";
		try(Connection con = DataBaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(sql)){
				ps.setString(1, patient.getName());
				ps.setString(2, patient.getDob());
				ps.setString(3, patient.getPhone());
				ps.setString(4, patient.getEmail());
				ps.setString(5, patient.getAddress());
				ps.setString(6, patient.getBloodGroup());
				return ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public List<Patient> searchPatientsByName(String name) {
        String sql = "SELECT * FROM patients WHERE name LIKE ? OR phone=? patient_id = ?";
        List<Patient> list = new ArrayList<>();

        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            String term = "%" + name + "%";
            ResultSet rs = ps.executeQuery();
            ps.setString(1, term);
            ps.setString(2, name);
            ps.setString(3, name);

            while (rs.next()) {
            	Patient patient = new Patient();
                patient.setPatientId(rs.getInt("patient_id"));
                patient.setName(rs.getString("name"));
                patient.setDob(rs.getString("dob"));
                patient.setPhone(rs.getString("phone"));
                patient.setEmail(rs.getString("email"));
                patient.setAddress(rs.getString("address"));
                patient.setBloodGroup(rs.getString("blood_group"));
                list.add(patient);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Search failed", e);
        }
        return list;
    }	
}
