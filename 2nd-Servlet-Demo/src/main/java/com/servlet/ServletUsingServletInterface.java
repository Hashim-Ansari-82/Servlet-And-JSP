package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletUsingServletInterface implements Servlet{

	ServletConfig con;
	
	@Override
	public void init(ServletConfig config) throws ServletException {

		this.con=config;
		System.out.println("I am in Init Method()");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("I am in Destroy Method()");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("I am in service Method");
		
		PrintWriter out = res.getWriter();
		
		out.println("<h1 style='text-align:center;'>I am Learn Servlet</h1>");
		out.println("<h1 style='text-align:center;'>Today : "+new Date().toString()+"</h1>");
		out.println("<h1 style='text-align:center;'>"+getServletInfo()+"</h1>");
		out.println("<h1 style='text-align:center;'>"+getServletConfig().getServletName()+"</h1>");
		
	}
	@Override
	public ServletConfig getServletConfig() {
		 
		return con;
	}

	@Override
	public String getServletInfo() {
		
		return "My First Program";
	}

}
