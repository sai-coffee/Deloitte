<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login App</title>
</head>
<body>
<h2>Login App</h2>
<form action ="validate.jsp">
Username = <input type ="text" name="Username"><br/>
Password = <input type ="text" name="Password"><br/>
<input type="submit" value ="login">

<%

String errorMessage =(String)session.getAttribute("errMsg");
if(errorMessage==null)
errorMessage="";
%>
<br/>
<font color="red"><%= errorMessage %></font>


</form>

</body>
</html>