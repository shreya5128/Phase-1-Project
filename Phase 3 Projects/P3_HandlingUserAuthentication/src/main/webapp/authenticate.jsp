<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentication Page</title>
</head>
<h2>Login Page</h2>
<body>
welcome to the authentication page

<form action="Auth" method="post"comandName="login">
	<label for="username">UserName:</label>
	<input name="username"id="username"type="text"placeholder="Username"required/>
	<label for="password">Password:</label>
	<input name="password"id="password"type="password"placeholder="Password"required/>
	<input type="submit"name="Submit"/>
</form>

</body>
</html>