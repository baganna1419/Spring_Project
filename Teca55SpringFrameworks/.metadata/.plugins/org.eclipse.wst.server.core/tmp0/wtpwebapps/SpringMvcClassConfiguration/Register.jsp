<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<center>
		<form action="./admission">
			<input type="text" placeholder="Enter Student Id " name="studentid"><br>
			<br> <input type="text" placeholder="Enter Student Name "
				name="studentname"><br> <br> <input type="text"
				placeholder="Enter Student Stream " name="studentstream"><br>
			<br> <input type="text" placeholder="Enter Student Email "
				name="studentemail"><br> <br> <input type="text"
				placeholder="Enter Student Percentage " name="studentpercentage"><br>
			<br> <input type="text"
				placeholder="Enter Student Mobile Number "
				name="studentmobilenumber"><br> <br> <input
				type="text" name="date"><br> <br> <input
				type="submit" value="Register">

		</form>
	</center>
	<br>
	<br>
	<br>
	<br>
	<%
	String temp = (String) request.getAttribute("status");
	if (temp != null)
	%>{<%
	boolean status = Boolean.parseBoolean(temp);
	if (status == false) {
	%>
	<h2 style="color: red">${msg }</h2>
	<%
	}
	%>



</body>
</html>