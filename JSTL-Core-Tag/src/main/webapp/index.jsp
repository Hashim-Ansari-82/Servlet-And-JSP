<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Tags</title>
</head>
<body>
	<h1 style="text-align: center; color: navy">JSTL Core Tags Example</h1>
	<hr>
	<h1>
		<c:out value="H R Ansari" />
	</h1>
	<c:import url="navbar.jsp" var="data" />
	<h1>
		<c:out value="${data}"></c:out>
	</h1>
	<c:set var="result" value="${300*3}" scope="session"></c:set>
	<h1>
		Before Remove session :
		<c:out value="${result}"></c:out>
	</h1>
	<c:remove var="result" />
	<h1>
		After Remove session :
		<c:out value="${result}"></c:out>
	</h1>
	<c:catch var="exception">
		<%
		String str = null;
		str.toUpperCase();
		%>
	</c:catch>
	<c:if test="${exception != null}">
		<h1>${exception}</h1>
	</c:if>
	<c:set value="${0}" var="age" />

	<c:if test="${age >= 18}">
		<h1>Eligible For Vote</h1>
	</c:if>

	<c:choose>
		<c:when test="${age >= 18 }">
			<h1>Eligible For Vote</h1>
		</c:when>
		<c:when test="${age < 18 }">
			<h1>Eligible not For Vote</h1>
		</c:when>
		<c:otherwise>
			<h1>You are not define age</h1>
		</c:otherwise>
	</c:choose>

	<c:forEach var="value" begin="1" end="4">
		<h1>
			<c:out value="${value }"></c:out>
		</h1>
	</c:forEach>
	<c:forTokens items="Hashim Ansari Koilsa" delims=" " var="str">
		<h1>
			<c:out value="${str}"></c:out>
		</h1>
	</c:forTokens>
	<c:url value="index.jsp" var="demo">
	  <c:param name="username" value="Hashim Ansari"/>
	  <c:param name="password" value="hashim"/>
	</c:url>
	<h1><c:out value="${demo}"></c:out></h1>
	<c:redirect url="https://www.google.com"></c:redirect>
</body>
</html>