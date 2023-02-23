<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet" />
</head>
<body>
	<div class="w-50 mx-auto mt-5 shadow p-3 mb-5 bg-body rounded">
		<h4 class="bg-secondary text-center p-2 text-white">Update
			Employee Form</h4>
		<form:form action="/employee/updateEmpResp" modelAttribute="emp" method="POST">
			<div class="mb-3">
				<label for="empId" class="form-label">Emp Id</label>
				<form:input path="empId" name="empId"
					readonly="true" class="form-control" id="empId" />
			</div>
			<div class="mb-3">
				<label for="empName" class="form-label">Employee Name</label>
				<form:input path="empName" name="empName" id="empName"
					placeholder="Enter your name" class="form-control" />
			</div>
			<div class="mb-3">
				<label for="contactNo" class="form-label">Contact No</label>
				<form:input path="contactNo" name="contactNo" id="contactNo"
					placeholder="Enter contact number" class="form-control" />
			</div>
			<div class="mb-3">
				<label for="salary" class="form-label">Salary</label>
				<form:input path="salary" name="salary" placeholder="Enter Salary"
					class="form-control" id="salary" />
			</div>
			<div class="d-grid gap-2">
				<input type="submit" value="Update" class="btn btn-secondary" />
			</div>
		</form:form>
	</div>

</body>
</html>