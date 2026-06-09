<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@page errorPage="error.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="r" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center; background-color:navy; color: white">Taglib Directive Page</h1><hr>
<h1 style="text-align:center;"><r:set var="name" value="Hashim Ansari"></r:set>
<r:out value="${name}"></r:out></h1>

<% String name=null;
  int s=name.length();
%>
<h1 style="text-align:center"><%="Size is = "+s %></h1>
</body>
</html>