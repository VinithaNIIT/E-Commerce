<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
 <link rel="stylesheet" href="resources/bootstrap/css/style.css"/>
<title>Add Supplier </title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include><br><br><br><br><br><br><br><br>
<center>
<div style="color: black; font-size: 30px">Enter Supplier Details</div>
<form action="Supplierdetails">
<table width="400px" height="150px">
<tr><td>Name:</td><td><input type="text" name="suppliername"></td></tr>
<tr><td>Description:</td><td><input type="textarea" name="supplierdescription"></td></tr>
<tr><td></td><td><input type="submit" value="Submit"></td></tr>
</table>

</form><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</center>
 <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>