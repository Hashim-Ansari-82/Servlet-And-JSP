<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/mylib.tld" prefix="t" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom Tag</title>
</head>
<body>
<h1 style="text-align:center">Greeting Guys</h1> <hr>
 <t:greet msg="Good Morning guys i hope you will fine"/>
 
<h1 style="text-align:center">Demo Guys</h1> <hr>
 <t:demo side="5"/>
</body>
</html>