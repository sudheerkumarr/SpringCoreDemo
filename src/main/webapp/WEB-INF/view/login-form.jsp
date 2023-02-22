<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="w-25 mx-auto mt-5">
		<h4 class="bg-secondary text-white text-center p-2" >Customer Login Form</h4>
		<form:form action="/login" modelAttribute="login" method="POST"
			class="border p-3">
			<div class="mb-3">
				<form:input path="email" name="email" class="form-control"
					placeholder="Enter your email address" />
			</div>
			<div class="mb-3">
				<form:input path="password" name="password" type="?password?"
					class="form-control" placeholder="Enter password" />
			</div>
			<div class="mb-3">
			<form:select path="role" class="form-control">
				<form:option value="admin" label="Admin" />
				<form:option value="customer" label="Customer" />
				<form:option value="employee" label="Employee" />
			</form:select>
			</div>
			<input type="submit" value="Login" class="btn btn-secondary" />
		</form:form>
	</div>



</body>
</html>