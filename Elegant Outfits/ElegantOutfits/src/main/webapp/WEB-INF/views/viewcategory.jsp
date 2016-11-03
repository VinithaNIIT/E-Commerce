<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category List</title>
</head>
<body>
<h1>Category List</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>Id</th><th>Name</th><th>Description</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="x" items="${list}">   
   <tr>  
   <td>${x.categoryid}</td>  
   <td><c:out value="${x.categoryname}"/></td>  
   <td><c:out value="${x.categorydescription}"/></td>  
   <td><a href="editcategory/${x.categoryid}">Edit</a></td>  
   <td><a href="deletecategory/${x.categoryid}">Delete</a></td>  
   </tr>  
   </c:forEach> 
</table>
<br/>  
   <a href="category">Add New Category</a>  
</body>
</html>