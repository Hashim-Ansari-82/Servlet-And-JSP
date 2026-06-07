package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<form action='SecondServlet'> <input type='hidden' name='user' value='"+name+"'><br>"
				+ "<br><button type='submit'>Servlet2</button></form>");
	}
	
    
}
