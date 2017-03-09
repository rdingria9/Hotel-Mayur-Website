<!DOCTYPE html>
<html lang="en">
<head>
<title>HotelMayur</title>
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
            <li><img src="images\Bedrooms\slider-1.jpg" alt=""></li>
            <li><img src="images\Bedrooms\slider-2.jpg" alt=""></li>
            <li><img src="images\Bedrooms\slider-3.jpg" alt=""></li>
          </ul>
        </div>--><img src="/images/slider-2.jpg" alt="" >
        <a href="#" class="prev"></a><a href="#" class="next"></a> </div>
      <nav>
        <ul class="menu">
          <li><a href="index.jsp">Main</a></li>
          <li class="current"><a href="AboutUs.jsp">About Us</a></li>
          <li><a href="Accomodation.jsp">Facilities</a></li>
          <li><a href="Gallery.jsp">Gallery</a></li>
          <li><a href="ContactUs.jsp">Contact Us</a></li>
		  <li><a href="Book.jsp">Booking</a></li>
        </ul>
      </nav>
    </div>
  </header>
  <!--==============================content================================-->
  <section id="content">
    <div class="container_12">
      <div class="grid_8">
        <h2 class="top-1 p3">Hotel Mayur</h2>
        <div class="wrap"> <img src="images/l.jpg" alt="" class="img-border img-indent">
          <div class="extra-wrap">
            <p class="color-1 p6">A star category hotel in the heart of Ulhasnagar and Kalyan Railway Station. Designed to effectively meet the demand of modern customers. </p>
            <p class ="color-1">The hotel is professionally designed and managed to offer utmost comfort and value to our discerning clientele.</p>
          </div>
        </div>
        <p class="color-1 p5"> Hotel Mayur is just the place to get the best of both world-?Great Comfort ?and ?Unmatched Hospitality?. </p>
        <!--<a href="#" class="button">Read more</a>-->
        <p class="color-1 p2">People who just want to get away from the crowd and pollution of the city.People on a leisure trip who are looking for a quiet place to relax and unwined themselves.People prefer to stay overnight at Hotel Mayur, relax in its calm and pleasant atmosphere, refresh and attend to their business, be it in the Kalyan,</p>
        <div class="wrap"> <img src="images/logo.png" alt="" class="img-border img-indent">
          <div class="color-1 extra-wrap">
            <p>Thane or Dombivali industrial belt where they can reach in a matter of 20-30 minutes and at the end of an hectic day return back to the calm and pleasant atmosphere of Hotel Mayur.Ulhasnagar is fast emerging as an important city on the business map of Maharashtra. With its proximity to the major Industrial belts.. Hotel Mayur is choice place for sober businessmen and families.</p>
          </div>
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

