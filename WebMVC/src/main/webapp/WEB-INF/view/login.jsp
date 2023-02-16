<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="loginResp" modelAttribute="login">
	<!-- default input field type - text -->
		<form:input type="?email?" path="email" placeholder="Enter email address"/>
		<form:input type="?password?" path="password" placeholder="Enter password" />
		<form:select path="role">
			<form:option value="admin" label="Admin"/>
			<form:option value="customer" label="Customer"/>
			<form:option value="employee" label="Employee"/>
		</form:select>
		<input type="submit" value="Login"/>
	</form:form>
</body>
</html>