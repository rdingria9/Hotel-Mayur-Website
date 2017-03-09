<!DOCTYPE html>
<html lang="en">
    <head>
        <title>HotelMayur</title>
        <meta charset="utf-8">

        <link rel="stylesheet" type="text/css" media="screen" href="css/reset.css">
        <link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
        <link rel="stylesheet" type="text/css" media="screen" href="css/grid_12.css">
        <link rel="stylesheet" type="text/css" media="screen" href="css/slider.css">
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
                    <h1><a href="index.html"><img src="images/logo.png" height = 200 width = 200 alt="" align="middle"></a></h1>
                    <div id="slide">
                        <img src="/images/slider-2.jpg" alt="" >
                        <a href="#" class="prev"></a><a href="#" class="next"></a></div>
                    <nav>
                        <ul class="menu">
                            <li class="current"><a href="index.jsp">Main</a></li>
                            <li><a href="AboutUs.jsp">About us</a></li>
                            <li><a href="Accomodation.jsp">Facilities</a></li>
                            <li><a href="Gallery.jsp">Gallery</a></li>
                            <li><a href="ContactUs.jsp">Contact us</a></li>
                            <li><a href="Book.jsp">Booking</a></li>
                        </ul>
                    </nav>
                </div>
            </header>
            <!--==============================content================================-->
            <section id="content">
                <div class="container_12">
                    <div class="grid_8">
                        <h2 class="top-1 p3">Welcome To Hotel Mayur 
                            Come Experience the Warmth of Hospitality</h2>
                        <p class="line-1">Hotel Mayur is just the place to get the best of both world-"Great Comfort "and "Unmatched Hospitality". The hotel is professionally designed and managed to offer utmost comfort and value to our discerning clientele. </p>
                        <p class="p2">People who just want to get away from the crowd and pollution of the city.People prefer to stay overnight at Hotel Mayur, relax in its calm and pleasant atmosphere, refresh and attend to their business, be it in the Kalyan.</p>

                    </div>
                    <div class="clear"></div>
                </div>
            </section>
        </div>
        <!--==============================footer=================================-->
        <footer>
            <p>© Hotel Mayur</p>
            <p><a target="_blank" href="http://www.mayurhotel.com/">www.HotelMayur.com</a></p>
        </footer>
        <script>Cufon.now();</script>
    </body>
</html>