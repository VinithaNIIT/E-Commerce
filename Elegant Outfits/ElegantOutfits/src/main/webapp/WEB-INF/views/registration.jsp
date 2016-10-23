<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
 <link rel="stylesheet" href="resources/bootstrap/css/style.css"/>
<title>Registration Form</title>
</head>
<body style="background-image:url('resources/images/12.jpg');background-repeat: no-repeat;background-size:cover; ">
<jsp:include page="header.jsp"></jsp:include>
<div class="container" >
            <form class="form-horizontal" role="form" action="index.jsp" >
                <h2>Registration Form</h2>
                <div class="form-group">
                   
                    <div class="col-sm-9" style="margin-left: 5em;
    margin-bottom: 1em;" >
                        <input type="text" id="firstName" name="firstname" placeholder="Full Name" class="form-control" autofocus required>
                       <!--  <span class="help-block">Last Name, First Name, eg.: Smith, Harry</span> -->
                    </div>
                </div>
                <div class="form-group">
                   
                    <div class="col-sm-9" style="margin-left: 5em;
    margin-bottom: 1em;" >
                        <input type="text" id="UserName" name="username" placeholder="UserName" class="form-control"  required>
                       <!--  <span class="help-block">Last Name, First Name, eg.: Smith, Harry</span> -->
                    </div>
                </div>
                <div class="form-group">
                   
                    <div class="col-sm-9" style="margin-left: 5em;
    margin-bottom: 1em;" >
                        <input type="email" id="email" name="email" placeholder="Email" class="form-control" required>
                    </div>
                </div>
                <div class="form-group">
                 
                    <div class="col-sm-9" style="margin-left: 5em;
    margin-bottom: 1em;" >
                        <input type="password" id="password" name="password" placeholder="Password" class="form-control" required>
                    </div>
                </div>
                <div class="form-group">
                  
                    <div class="col-sm-9" style="margin-left: 5em;
    margin-bottom: 1em;" >
                        <input type="text" id="mobile1" name="mobile" placeholder="Mobile No:" pattern="[789][0-9]{9}" class="form-control" required >
                         <span class="help-block">Please enter 10 digit no: starting with 7/8/9</span>
                    </div>
                </div>
                
               
                        
                
                <div class="form-group" >
                    <div class="col-sm-9" style="margin-left: 5em;
    margin-bottom: 1em;" >
                        <button type="submit" class="btn btn-primary btn-block" style="background-color: #FF69B4">REGISTER</button>
                    </div>
                </div>
           </form>
        </div> <!-- ./container -->
        <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>