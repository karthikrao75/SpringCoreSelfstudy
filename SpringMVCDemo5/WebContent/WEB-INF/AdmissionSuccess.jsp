<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">${headerMessage}</h1>
	</br>
	<h3>Congratulation ! your admission to GPS Private Limited is
		success</h3>
	</br>
	<h4>Bellow find your details</h4>
	<table>
		<tr>
			<td>Full Name:</td>
			<td>${student.studentName}</td>
		</tr>
		<tr>
			<td>Mobile Number:</td>
			<td>${student.mobileNumber}</td>
		</tr>
		<tr>
			<td>Joining Date:</td>
			<td>${student.dateOfJoining}</td>
		</tr>
		<tr>
			<td>Student Hobby:</td>
			<td>${student.studentHobby}</td>
		</tr>
		<tr>
			<td>Courses Opted:</td>
			<td>${student.courses}</td>
		</tr>
		<tr>
			<td>Student Address:</td>
			<td>Line1:${student.address.line1}</br>Line2:${student.address.line2}</br>Pincode:${student.address.pincode}
			</td>
		</tr>

	</table>
</body>
</html>