package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sum")
public class SumServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int fn = Integer.parseInt(req.getParameter("fn"));
		int sn = Integer.parseInt(req.getParameter("sn"));
		
		int sum=fn+sn;
		
		req.setAttribute("sum", sum);
		
		req.getRequestDispatcher("/MultiServlet").forward(req, resp);
		
	}

	
}
