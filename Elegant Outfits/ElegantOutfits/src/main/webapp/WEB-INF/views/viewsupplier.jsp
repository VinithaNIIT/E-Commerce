<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Supplier List</h1>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Address</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="x" items="${vlist}">   
   <tr>  
   <td>${x.supplierid}</td>  
   <td><c:out value="${x.suppliername}"/></td>  
   <td><c:out value="${x.supplieraddress}"/></td>  
   <td><a href="editsupplier1/${x.supplierid}">Edit</a></td>  
   <td><a href="deletesupplier/${x.supplierid}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="supplier">Add New Supplier</a>  

</body>
</html>