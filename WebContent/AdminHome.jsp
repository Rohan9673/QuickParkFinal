<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
	<title>
			Login Page
	</title>
	
</head> 
<body >

<h1>Welcome Admin <%=session.getAttribute("username") %></h1>
<a  href="logout">Logout</a>
</body>
</html>