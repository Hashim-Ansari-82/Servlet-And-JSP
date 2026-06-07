package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		String name = request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		out.println("<h1> Welcome Bro First Servlet = "+name+"</h1>");
		
		HttpSession session = request.getSession();
		
       session.setAttribute("username",name);		
       
       out.println("<h1><a href='servlet2'>Servelt 2</a></h1 >");

	}

}
