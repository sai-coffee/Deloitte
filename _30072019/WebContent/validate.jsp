<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validation</title>
</head>
<body>
<%
String username = request.getParameter("Username");
String Password = request.getParameter("Password");
if(username.equals("sai")&& Password.equals("prasanth"))
{
	%>
	<jsp:forward page ="result.jsp"></jsp:forward>
	<%
}
else
{
	session.setAttribute("errMsg", "Credentials are wrong");
	response.sendRedirect("index_text.jsp");
}
session.invalidate();
%>
</body>
</html>