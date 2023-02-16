<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>empList</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>EmployeeId</th>
				<th>EmployeeName</th>
				<th>ContactNo</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${empList}">
				<tr>
					<td>${emp.empId }</td>
					<td>${emp.empName }</td>
					<td>${emp.contactNo}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>