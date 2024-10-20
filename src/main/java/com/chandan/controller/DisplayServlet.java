package com.chandan.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.chandan.dao.DbConfig;

@WebServlet("/viewAll")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static Connection con = null;

	public DisplayServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("You are at viewAll Records.");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("You are at viewAll Records.");

		con = DbConfig.getConnection();

		try {
			String query = "select * from register;";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.println("Id: " + rs.getInt(1));
				System.out.println("First Name: " + rs.getString(2));
				System.out.println("Last Name: " + rs.getString(3));
				System.out.println("User Name: " + rs.getString(4));
				System.out.println("Password: " + rs.getString(5));
				System.out.println("Address: " + rs.getString(6));
				System.out.println("Contact: " + rs.getString(7));
				System.out.println("==================================================");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
