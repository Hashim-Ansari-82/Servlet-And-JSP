package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MultiServlet")
public class MultiServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int fn = Integer.parseInt(req.getParameter("fn"));
		int sn = Integer.parseInt(req.getParameter("sn"));

		int sum = (int) req.getAttribute("sum");
		int multi = fn * sn;
		int divide = fn / sn;
		int modulus = fn % sn;
		int sub = fn - sn;

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.println("<h1 style='text-align:center;'> Result for Calculation</h1>");
		out.println("<h1 style='text-align:center;'> Sum of " + fn + " and " + sn + " = " + sum + "</h1>");
		out.println("<h1 style='text-align:center;'> Multiply of " + fn + " and " + sn + " = " + multi + "</h1>");
		out.println("<h1 style='text-align:center;'> Divide of " + fn + " and " + sn + " = " + divide + "</h1>");
		out.println("<h1 style='text-align:center;'> Mudulus of " + fn + " and " + sn + " = " + modulus + "</h1>");
		out.println("<h1 style='text-align:center;'> Sub of " + fn + " and " + sn + " = " + sub + "</h1>");
	}

}
