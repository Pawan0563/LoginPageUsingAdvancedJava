package com.DB;

import java.sql.*;

public class DBConnect {
	public static Connection conn;

	public static Connection getConnection() {
		
		try {
			if (conn == null) {

				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage2", "root", "Pawan@singh@563");
			
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
		
	
	}

}