<html>
<head>
<title>Elegant Outfits</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="resources/bootstrap/css/style.css"/>
   <!-- <link rel="stylesheet" href="resources/bootstrap/css/cssbootstrap.css"/> -->
   <script>
	$('#myCarousel').carousel({
		interval: 1000
	})
</script>

</head>
<body>


<!-- <a href="#" class="pull-left"><img src="resources/images/logo_1.jpg" height="80px" width="80px" ></a> -->


<nav class="navbar navbar-inverse navbar-fixed-top"> 
  <div class="container-fluid">
    <div class="navbar-header">
     <!--  <a class="navbar-brand" href="#">Elegant Outfits</a> -->
      <a href="#" class="pull-left"><img src="resources/images/logo_1.jpg" height="60px" width="80px" ></a> 
    </div>
    <ul class="nav navbar-nav" style="font-family: sans-serif;text-transform: uppercase;">
     <li  ><a href="Index" class="active" style="color: black;">Home</a></li> 
      <li class="dropdown" ><a class="dropdown-toggle" data-toggle="dropdown" href="#" style="color: black;">Product <span class="caret"></span></a>
        <ul class="dropdown-menu" >
          <li><a href="#" style="color: black;">Indian Wear</a></li>
          <li><a href="#" style="color: black;">Western Wear</a></li>
          <li><a href="#" style="color: black;">Sleepwear</a></li>
        </ul>
      </li>
      <li><a href="Aboutus" style="color: black;">About Us</a></li>
       <li><a href="Contactus" style="color: black;">Contact Us</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="Registration" style="color: black;"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="Login" style="color: black;"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="resources/images/ethnic_banner1.jpg" alt="IndianWear" width="100%" height="700px">
      </div>

      <div class="item">
        <img src="resources/images/western_banner1.jpg" alt="WesternWear" width="100%" height="250px">
      </div>
    
      <div class="item">
        <img src="resources/images/sleepwear_banner.jpg" alt="Sleepwear" width="100%" height="250px">
      </div>

      <div class="item">
        <img src="resources/images/indian_banner1.jpg" alt="IndianWear" width="100%" height="250px">
      </div>
      <div class="item">
        <img src="resources/images/western_banner.jpg" alt="WesternWear" width="100%" height="250px">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<div class="row">
  <div class="col-md-6" >
  <marquee  width="450px"  direction="up" onmouseover="stop()" onmouseout="start()" scrollamount="2"style="color:black;margin-left: 100px;padding:20px">
  <center>
Online Shopping: convenient, fast and affordable!<br>
Shopping is fun and exhilarating and more so when<br> you can shop 24x7 without leaving the comfort of home.
<br>
Elegant Outfits the hottest online fashion destination of all times!
<br>
'Fashion' is definitely more accessible with Elegant Outfits.
<br>
Avail added online shopping benefits
<br>
You choose your product, order it online,<br> and we deliver it right at your doorstep anywhere in India.<br> You just need to pay for the product.
</center></marquee>
  </div>
  <div class="col-md-6"><video width="400" controls>
  <source src="resources/videos/Women-Ethnic Wear.mp4" type="video/mp4">
</video></div>
</div>


<div class="row" style="text-align: center">
 <div class="col-md-4 " >

 <a href="#" title="Indian Wear">
  <figure >
   <img class="img-responsive fa-3x social" src="resources/images/indian11.jpg" alt="Indian Wear" width="350px" height="80px" style="margin-left:20px" />
   <figcaption >Indian Wear</p></figcaption>
   </figure>
   </a>
   
 </div>
 <div class="col-md-4">
 <a href="#" title="Western Wear">
 <figure >
   <img class="img-responsive fa-3x social" src="resources/images/western_1.jpg" alt="Western Wear" width="310px" height="80px" style="margin-left:20px" />
   <figcaption><p>Western Wear</p></figcaption>
   </figure>
   </a>
 </div>

 <div class="col-md-4">
 <a href="#" title="SleepWear">
 <figure >
   <img class="img-responsive fa-3x social" src="resources/images/sleepwear_1.jpg" alt="Sleepwear" width="310px" height="80px"  />
   <figcaption><p>SleepWear</p></figcaption>
   </figure>
   </a>
 </div>
 
</div>
<div class="footer " style="background-color:#f65a8c;width:'100%';margin:'auto'; ">
<div class="text-center center-block" style="background-color:#f65a8c;">
            <p class="txt-railway"><b>- Elegant Outfits -</b></p>
            
            <p>Copyright © 2016,Created by Vinitha</p>
                <a href="https://www.facebook.com"><i id="social-fb" class="fa fa-facebook-square fa-3x social"></i></a>
	            <a href="https://twitter.com"><i id="social-tw" class="fa fa-twitter-square fa-3x social"></i></a>
	            <a href="https://plus.google.com"><i id="social-gp" class="fa fa-google-plus-square fa-3x social"></i></a>
	            
</div>
</div>

</body>
</html>
