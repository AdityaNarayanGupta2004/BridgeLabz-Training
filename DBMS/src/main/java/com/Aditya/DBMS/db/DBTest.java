package com.Aditya.DBMS.db;

import java.sql.SQLException;

public class DBTest {
	public static void main(String[] args) throws SQLException {
		System.out.println(DataBaseConnection.getConnection());
	}
}
