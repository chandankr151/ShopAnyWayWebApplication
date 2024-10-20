package com.chandan.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.chandan.dao.DbConfig;
import com.chandan.model.UserRegister;

public class RegisterUser {

	public static Connection con = null;

	public static void registerNewUser(UserRegister user) {

		con = DbConfig.getConnection();

		String query = "insert into register(first_name, last_name, user_name, password, address, contact)"
				+ "values(?,?,?,?,?,?)";

		try {
			PreparedStatement ptmt = con.prepareStatement(query);
			ptmt.setString(1, user.getFirstName());
			ptmt.setString(2, user.getLastName());
			ptmt.setString(3, user.getUserName());
			ptmt.setString(4, user.getPassword());
			ptmt.setString(5, user.getAddress());
			ptmt.setString(6, user.getContact());

			int row = ptmt.executeUpdate();
			System.out.println(row + " record inserted into table successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
