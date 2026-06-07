package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String name = req.getParameter("name");
		
		PrintWriter out = resp.getWriter();
	
		resp.setContentType("text/html");
		out.println("<h1>Welcome to servlet1, name : "+name+"</h1>");
		out.println("<a href='servlet2?username= "+name+"'><h1>Servlet2</h1></a>");
		
	}

	
}
