<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Register Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css" />
</head>
<body>

	<div class="w-25 mx-auto mt-5 shadow p-3 mb-5 bg-body rounded">
		<h4 class="bg-secondary text-white text-center p-2">Customer
			Register Form</h4>
		<form:form action="add" modelAttribute="customer" method="POST"
			class="border p-3">
			<div class="mb-3">
				<form:input path="custName" name="custName"
					placeholder="Enter your name" class="form-control" />
			</div>
			<div class="mb-3">
				<form:input type="?number?" path="contactNo" name="contactNo"
					placeholder="Enter contact number" class="form-control" />
			</div>
			<div class="mb-3">
				<form:input path="login.email" name="email" class="form-control"
					placeholder="Enter your email address" />
			</div>
			<div class="mb-3">
				<form:input path="login.password" name="password" type="?password?"
					class="form-control" placeholder="Enter password" />
			</div>
			<div class="mb-3">
				<form:select path="login.role" class="form-control">
					<form:option value="admin" label="Admin" />
					<form:option value="customer" label="Customer" />
					<form:option value="employee" label="Employee" />
				</form:select>
			</div>
			<div class="d-grid gap-2">
				<input type="submit" value="Register" class="btn btn-secondary" />
			</div>
		</form:form>
	</div>

</body>
</html>