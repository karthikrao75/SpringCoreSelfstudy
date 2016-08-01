<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./submitForm.html" method="post">
		<h1 align="center">${headerMessage}</h1>
		<br></br>
		<h3>Admission page for GPS private Limited</h3>
		<table>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="studentName" /></td>
				<td><form:errors path="student.studentName"></form:errors></td>
			</tr>
			<tr>
				<td>Mobile Number:</td>
				<td><input type="text" name="mobileNumber" /></td>
				<td><form:errors path="student.mobileNumber"></form:errors></td>
			</tr>
			<tr>
				<td>Joining Date:</td>
				<td><input type="text" name="dateOfJoining"
					placeholder="dd-mm-yyyy" /></td>

				<td><form:errors path="student.dateOfJoining"></form:errors></td>
			</tr>
			<tr>
				<td>Student Hobby:</td>
				<td><input type="text" name="studentHobby" /></td>
				<td><form:errors path="student.studentHobby"></form:errors></td>
			</tr>
			<tr>
				<td>courses:</td>
				<td><select multiple="multiple" name="courses">
						<option>Java Core</option>
						<option>Spring Core</option>
						<option>Spring MVC</option>
						<option>Hibernate</option>
				</select></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td>Line1: <input type="text" name="address.line1" /></br>Line2: <input
					type="text" name="address.line2" /></br>pincode:<input type="text"
					name="address.pincode" /></td>
			</tr>
		</table>
		<input type="submit" value="Submit the form">
	</form>
</body>
</html>