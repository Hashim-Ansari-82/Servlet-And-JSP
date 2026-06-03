package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("user_name");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		String course = req.getParameter("course");
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.println("<h1> Name : "+name+"</h>");
		out.println("<h1> Eamil : "+email+"</h>");
		out.println("<h1> Password : "+pass+"</h>");
		out.println("<h1> Course : "+course+"</h>");
	}

}
