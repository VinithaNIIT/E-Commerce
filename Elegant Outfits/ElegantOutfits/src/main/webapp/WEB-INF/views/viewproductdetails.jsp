<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    <c:url value="/resources/bootstrap/css" var="a"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- All the files that are required -->
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
 <link rel="stylesheet" href="${a}/style.css"/>
 <style>
table, th , td {
  border: 1px solid grey;
  border-collapse: collapse;
  padding: 25px;
  cellspacing:10px;
}
table tr:nth-child(odd) {
  background-color: #f1f1f1;
}
table tr:nth-child(even) {
  background-color: #ffffff;
}
</style>
<title>Product Details</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
</head>
<body>

<%-- <jsp:include page="header.jsp"></jsp:include> --%>
<c:import url="/header"></c:import>
<!-- <br><br><br> -->

<div ng-app="myApp" ng-controller="productCtrl">
<br><br><br>
<div style="margin:20px;">
<input type="text" ng-model="searchString" class="search" placeholder="Search"> 
</div><br><br><br>
<div>
<table style="margin-left: 40px;">
<tr ng-repeat="x in products|filter:searchString">
<td>{{x.productid}}</td>
<td>{{x.productname}}</td>
<td>{{x.productdescription}}</td>
<td>{{x.productprice}}</td>
<td>{{x.quantity}}</td>
 <td><a href="/ElegantOutfits/productdetails/{{x.productid}}">Details</a></td>  
</tr>

</table>
</div>
</div>
<script>
var app=angular.module('myApp',[]);
app.controller('productCtrl',function($scope){
	
	$scope.products=${list};
})
</script>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>