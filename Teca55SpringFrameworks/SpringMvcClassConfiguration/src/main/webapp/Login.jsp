<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<form action="/loginCheck">
		<input type="text" placeholder="Student ID : " name="sid"><br>
		<br> <input type="text" placeholder="Student NAME : " name="s"><br>
		<br> <input type="submit" value="Login"><br> <br>
		<a href="/SpringMvcClassConfiguration/src/main/webapp/Register.jsp">New Student?</a>
	</form>
	<br>
	<br>
	



</body>
</html>