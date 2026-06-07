package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class servlet2 extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//String name = req.getParameter("name");
		
		PrintWriter out = resp.getWriter();
		
		Cookie[] cookie = req.getCookies();
		
		resp.setContentType("text/html");
		out.println("<h1>Welcome to servlet2, name "+cookie[0].getValue()+"</h1>");
	}

}
