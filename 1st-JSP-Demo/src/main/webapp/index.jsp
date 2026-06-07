<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page isELIgnored="false"%>
<%@page errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Demo</title>
</head>
<body style="background:navy;">

<%@ include file="header.jsp" %>
<h1>Welcome to JSP Page</h1>

<h1>Declaration Tag</h1>

<%! int a=12; String name="Hashim Ansari";%>

<h1>Expression Tag</h1>

<h1>ID = <%=a %></h1> 
<h1>Name = <%=name %></h1>

<h1>Scriptlet Tag</h1>

<h1 style="color:green"><% int sum=12+34;
  out.println("Sum = "+sum);
%></h1>
<h1 style="color:yellow">Name = <%= name %></h1>
<h1>Date = <%= new Date()%></h1>
</body>
</html>