package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet{


	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[] c = req.getCookies();
		
		if(c==null) {
			resp.sendRedirect("index.html");
		}
		else {
			
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			out.println("<h1><------ User Detail -------></h1>");
			out.println("<h1> Email = "+c[0].getValue()+"</h1>");
			out.println("<h1> Password = "+c[1].getValue()+"</h1>");
			out.println("<a href='logout'><h1>Logout</h1></a>");
		
		}
	}

	
}
