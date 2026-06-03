package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/second")
public class ServletUsingGenericClass extends GenericServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("This is Generic Servlet");
		
		PrintWriter out=res.getWriter();
		out.println("<h1 style='text-align:center';>This is Generic Servlet</h1>");
		out.println("<h1 style='text-align:center';>"+new Date().toString()+"</h1>");
		
	}

}
