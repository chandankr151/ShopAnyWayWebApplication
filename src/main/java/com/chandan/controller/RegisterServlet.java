package com.chandan.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.chandan.model.UserRegister;
import com.chandan.service.RegisterUser;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Welcome Chandan. Your registration page is in working mode.");

		String fname = null, lname = null, uname = null, pass = null, addr = null, cont = null;

		UserRegister user = new UserRegister();

		user.setFirstName(request.getParameter("firstName"));
		user.setLastName(request.getParameter("lastName"));
		user.setUserName(request.getParameter("userName"));
		user.setPassword(request.getParameter("password"));
		user.setAddress(request.getParameter("address"));
		user.setContact(request.getParameter("contact"));

		RegisterUser.registerNewUser(user);

		System.out.println("User registered successfully.");
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath + "/index.jsp");
	}

}
