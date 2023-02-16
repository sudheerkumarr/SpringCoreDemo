<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

	<form:form action="resp" modelAttribute="emp">
		<form:input path="name" placeholder="Enter your name" name="name" />
		<form:errors path="name" cssClass="error"/>
		<br><br>
		<form:input path="email" type="?email?" placeholder="Enter email address" name="email" />
		<form:errors path="email" cssClass="error"/>
		<br><br>
		<form:input path="contactNo" placeholder="Enter contact number" name="contactNo" />
		<form:errors path="contactNo" cssClass="error"/>
		<br><br>
		<input type="submit" value="Add Employee"/>
	</form:form>

</body>
</html>