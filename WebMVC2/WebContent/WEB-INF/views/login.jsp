<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.error {
		color: red;
	}
</style>
</head>
<body>
	<form:form action="loginResp" modelAttribute="login">
		<form:input type="?email?" path="email" />
		<form:errors path="email" cssClass="error"/>
		<form:input type="?password?" path="password" />
		<form:errors path="password" cssClass="error"/>
		<form:select path="role">
			<form:option value="admin" label="Admin" />
			<form:option value="customer" label="Customer" />
			<form:option value="employee" label="Employee" />
		</form:select>
		<form:errors path="role" cssClass="error"/>
		<input type="submit" />
	</form:form>
</body>
</html>