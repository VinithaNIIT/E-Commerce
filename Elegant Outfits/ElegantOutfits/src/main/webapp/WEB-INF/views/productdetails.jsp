<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:url value="/resources/images" var="x"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- All the files that are required -->
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
 <link rel="stylesheet" href="resources/bootstrap/css/style.css"/>
<title>Insert title here</title>
</head>
<body>
<div>
<%-- <c:import url="/header"></c:import> --%>
</div>
<div class="container">
<div>ProductId:${p.productid} </div>
<div>ProductName:${p.productname }</div>
<div>Product Price:${p.productprice }</div>
<div>Product Description:${p.productdescription }</div>
<div>Quantity:${p.quantity}</div>
<div><img src="${x}/${p.productid}.jpg" alt="${p.productname}"/></div>



</div>
 <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>