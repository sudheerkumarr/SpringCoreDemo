<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet" />
</head>
<body>
	<div class="w-25 mx-auto mt-5 shadow p-3 mb-5 bg-body rounded">
		<h4 class="bg-secondary text-center p-2 text-white">Add Employee Form</h4>
		<form:form action="addEmpResp" modelAttribute="emp" method="POST"
			class="border p-3">
			<div class="mb-3">
				<label for="empName" class="form-label">Employee Name</label>
				<form:input path="empName" name="empName"
					placeholder="Enter your name" class="form-control" id="empName" />
			</div>
			<div class="mb-3">
				<label for="contactNo" class="form-label">Contact No</label>
				<form:input path="contactNo" name="contactNo"
					placeholder="Enter contact number" class="form-control"
					id="contactNo" />
			</div>
			<div class="mb-3">
				<label for="salary" class="form-label">Salary</label>
				<form:input type="?number?" path="salary" name="salary" id="salary"
					placeholder="Enter salary" class="form-control" />
			</div>
			<div class="d-grid gap-2">
				<input type="submit" value="Add" class="btn btn-secondary" />
			</div>
		</form:form>
	</div>
</body>
</html>