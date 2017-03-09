<!DOCTYPE html>
<html lang="en">
<head>
<title>Hotel Mayur | Contacts</title>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" media="screen" href="css/reset.css">
<link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
<link rel="stylesheet" type="text/css" media="screen" href="css/grid_12.css">
<link rel="stylesheet" type="text/css" media="screen" href="css/slider-2.css">
<link rel="stylesheet" type="text/css" media="screen" href="css/jqtransform.css">
<script src="js/jquery-1.7.min.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/cufon-yui.js"></script>
<script src="js/vegur_400.font.js"></script>
<script src="js/Vegur_bold_700.font.js"></script>
<script src="js/cufon-replace.js"></script>
<script src="js/tms-0.4.x.js"></script>
<script src="js/jquery.jqtransform.js"></script>
<script src="js/FF-cash.js"></script>
<script>
$(document)
    .ready(function () {
    $('.form-1')
        .jqTransform();
    $('.slider')
        ._TMS({
        show: 0,
        pauseOnHover: true,
        prevBu: '.prev',
        nextBu: '.next',
        playBu: false,
        duration: 1000,
        preset: 'fade',
        pagination: true,
        pagNums: false,
        slideshow: 7000,
        numStatus: false,
        banners: false,
        waitBannerAnimation: false,
        progressBar: false
    })
});
</script>
<!--[if lt IE 9]>
<script src="js/html5.js"></script>
<link rel="stylesheet" type="text/css" media="screen" href="css/ie.css">
<![endif]-->
<script>
function validFunc()
{
	if (document.f1.NameText.value == "")
	{
		alert ( "Please enter your Name." );
		document.f1.NameText.focus();
		return false;
	}
	if (document.f1.EmailText.value == "")
	{
		alert ( "Please enter E-mail id." );
		document.f1.EmailText.focus();
		return false;
	}
	/*if (!(document.f1.EmailText.contains ('@') && document.f1.EmailText.contains('.'))
	{
		alert ( "Please enter valid E-mail id." );
		document.f1.EmailText.focus();
		return false;
	}*/
	if (document.f1.TArea.value == "")
	{
		alert ( "Please enter a message." );
		document.f1.TArea.focus();
		return false;
	}
	alert("your message has been sent successfully!!!")
}
</script>
</head>
<body>
<div class="main">
  <!--==============================header=================================-->
  <header>
    <div>
      <h1><a href="index.html"><img src="images/logo.png" height = 100 width = 100 align="center" alt=""></a></h1>
      <div id="slide">
        <!--<div class="slider">
          <ul class="items">
            <li><img src="images/slider-1.jpg" alt=""></li>
            <li><img src="images/slider-2.jpg" alt=""></li>
            <li><img src="images/slider-3.jpg" alt=""></li>
          </ul>
        </div>--><img src="/images/slider-2.jpg" alt="" >
        <a href="#" class="prev"></a><a href="#" class="next"></a> </div>
      <nav>
        <ul class="menu">
          <li><a href="index.jsp">Main</a></li>
          <li><a href="AboutUs.jsp">About us</a></li>
          <li><a href="Accomodation.jsp">Facilities</a></li>
          <li><a href="Gallery.jsp">Gallery</a></li>
          <li class="current"><a href="ContactUs.jsp">Contacts</a></li>
		  <li><a href="Book.jsp">Booking</a></li>
        </ul>
      </nav>
    </div>
  </header>
  <!--==============================content================================-->
  <section id="content">
    <div class="container_12">
      <div class="grid_8">
        <h2 class="top-1 p3">Contact form</h2>
        <form id ="form" name ="f1" method="post" onsubmit="validFunc()" action = "jsp/index.jsp">
          <fieldset>
              <label><strong><h3>Your Name:</h3></strong>
              <input type="text" value="" name = "NameText">
            </label>
              <label><strong><h3>Your E-mail:</h3></strong>
              <input type="text" value="" name = "EmailText">
            </label>
              <label><strong><h3>Your Message:</h3></strong>
              <textarea name = "TArea"></textarea>
            </label>
            <div class="btns"><input type ="submit" value = "submit" name ="Send" ><!--<a href="#" class="button">Send</a></div>-->
          </fieldset>
        </form>
      </div>
      <div class="grid_4">
        <div class="left-1">
          <form id="form-1" class="form-1 bot-2" action="#">
            
            <div class="clear"></div>
          </form>
          <h2 class="p3">Our contacts</h2>
          <dl>
            <dt class="color-1 p2"><strong><h3>Central Hospital Road, <br>
                    Ulhasnagar, Maharashtra 421003</h3></strong></dt>
                    <dd><span><h3>Phone:</h3></span>0251 273 2352</dd>  
                    <dd><span><h3>Telephone:</h3></span>+91 9922092000</dd>
                    <dd><span></h3>E-mail:</h3></span><a href="#" class="link">Hmayur1990@gmail.com</a></dd>
          </dl>
        </div>
      </div>
      <div class="clear"></div>
    </div>
  </section>
</div>
<!--==============================footer=================================-->
<footer>
  <p>© Hotel Mayur</p>
  <p>Website = <a target="_blank" href="http://www.mayurhotel.com/">www.HotelMayur.com</a></p>
</footer>
<script>Cufon.now();</script>
</body>
</html>

