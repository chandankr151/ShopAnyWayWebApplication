package com.chandan.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConfig {

	public static Connection con = null;
	public static String url = null, user = null, pass = null;

	public static Connection getConnection() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			url = "jdbc:mysql://localhost:3306/company";
			user = "root";
			pass = "govt";

			con = DriverManager.getConnection(url, user, pass);
			if (con != null) {
				System.out.println("Database connected.");
			} else {
				System.out.println("error occured in database connection.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
