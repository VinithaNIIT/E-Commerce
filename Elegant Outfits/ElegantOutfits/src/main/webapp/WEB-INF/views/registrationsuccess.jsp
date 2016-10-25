<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><td><h2>Thank you for Registering!!!! Your details are</h2></td></tr>
<tr><td>FirstName:${u.firstname}</td></tr>
<tr><td>UserName:${u.username}</td></tr>
<tr><td>Password:${u.password}</td></tr>
 <tr><td>EmailId:${u.email}</td></tr>
<tr><td>MobileNo:${u.mobile}</td></tr> 
</table>

</body>
</html>