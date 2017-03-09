<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Hotel Mayur | Accomodation</title>
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
    </head>
    <body>
        <div class="main">
            <!--==============================header=================================-->
            <header>
                <div>
                    <h1><a href="index.html"><img src="images/logo.png" height = 100 width = 100 align="center" alt=""></a></h1>
                    <div id="slide">
                        <img src="/images/slider-2.jpg" alt="" >
                        <a href="#" class="prev"></a><a href="#" class="next"></a> </div>
                    <nav>
                        <ul class="menu">
                            <li><a href="index.jsp">Main</a></li>
                            <li><a href="AboutUs.jsp">About Us</a></li>
                            <li class="current"><a href="Accomodation.jsp">Facilities</a></li>
                            <li><a href="Gallery.jsp">Gallery</a></li>
                            <li><a href="ContactUs.jsp">Contact Us</a></li>
                            <li><a href="Book.jsp">Booking</a></li>
                        </ul>
                    </nav>
                </div>
            </header>
            <!--=============================content================================-->
            <section id="content">
                <div class="container_12">
                    <h2 class="top-1 p3">Welcome To Hotel Mayur 
                        Come Experience the Warmth of Hospitality<br><br>Facilities:<br></h2><br>  
                        <br>
                    <h2><p>-->  Multi-channel Cable</p></h2>
                    <h2><p>-->  A full fledged Business Centre</p></h2>
                    <h2><p>-->  TV Laundry & Valet Service</p></h2>
                    <h2><p>-->  Bath tubs with hot & cold water </p></h2>
                    <h2><p>-->  24 hours Rooms Service</p></h2>
                    <h2><p>-->  Luxury toiletries</p></h2>
                    <h2><p>-->  Safe with internal power point to recharge your laptop</p></h2>
                    <h2><p>-->  Running hot and cold water 24 hours</p></h2>
                    <h2><p>-->  TV with cable connection</p></h2>
                    <h2><p>-->  Direct Dialing facility</p></h2>
                    <h2><p>-->  Our Guest Relations Team at your service at all times</p></h2>

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
