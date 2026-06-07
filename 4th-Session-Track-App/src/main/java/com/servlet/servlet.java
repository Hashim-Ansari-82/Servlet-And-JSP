package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class servlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		
		PrintWriter out = resp.getWriter();
	
        Cookie c=new Cookie("name", name);
        resp.addCookie(c);
		
		resp.setContentType("text/html");
		out.println("<h1>Welcome to servlet, name : "+name+"</h1>");
		out.println("<br> <br> <a href='servlet2'>Servlet2</a>");
	}

}
