<%@ page import="java.sql.*"%>
<%@ page import="javax.servlet.*"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Hotel Mayur | Book</title>
<div align=center>
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
            function bookValid()
            {
                var l1, l2, l3;
                l1 = document.forms.form.t1.value;
                l2 = document.forms.form.t2.value;
                l3 = document.forms.form.ta.value;
                if (l1 == "" || l1 == null)
                {
                    alert("invalid name");
                    return false;
                }
                else if (l2 == "" || l2 == null)
                {
                    alert("invalid email");
                    return false;
                }
                else if (l3 == "" || l3 == null)
                {
                    alert("invalid name");
                    return false;
                }
            }
        </script>
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
        <style>
            .select-2 {
                width:150px;
                margin-right:14px;
                float:left;
            }
        </style>
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
                            <li><a href="AboutUs.jsp">About us</a></li>
                            <li><a href="Accomodation.jsp">Facilities</a></li>
                            <li><a href="Gallery.jsp">Gallery</a></li>
                            <li><a href="ContactUs.jsp">Contact Us</a></li>
                            <li class="current"><a href="Book.jsp">Booking</a></li>
                        </ul>
                    </nav>
                </div>
            </header>
            <!--==============================content================================-->
            <section id="content">
                <div class="container_12">
                    <h2 class="top-1 p3">Book Room</h2>
                    <form id="form" name ="f1" method="post" onsubmit=" return bookValid()" action = "jsp/index1.jsp"><!--action="C:\xampp\tomcat\webapps\jsp\1.html"-->
                        <fieldset>
                            <label><strong><h3>Your Name:</h3></strong>
                                <input type="text" value="Enter Name" name = "t1" onBlur="if (this.value == '')
                                            this.value = 'Enter Name'" onFocus="if (this.value == 'Enter Name')
                                                        this.value = ''">
                            </label>
                            <label><strong><h3>Your E-mail:</h3></strong>
                                <input type="text" value="Enter Email ID" name = "t2" onBlur="if (this.value == '')
                                            this.value = 'Enter Email ID'" onFocus="if (this.value == 'Enter Email ID')
                                                        this.value = ''">
                            </label>
                            <label><strong><h3>Your Address:</h3></strong>
                                <textarea name="ta"></textarea>
                            </label>
                            <label for="dates"><strong><h3> Date Of Booking :</h3></strong></label>
                            <label for="dates"><strong><h3>From</h3> </strong><input  type="date" id= "dates" name ="fromd" value=""/></label>
                            <label for="dates"><strong><h3>TO</h3></strong></label><input id="dates" type="date" name = "tod"value="From"/><br>
                            <br><label><h3>Choose your room:</h3></label>
                            <select name="select" >
                                <option>---SELECT ROOM---</option>
                                <option>2NAC</option>
                                <option>2AC</option>
                                <option>3AC</option>
                                <option>3NAC</option>
                            </select><br><br>
                            <%
                                Connection con = null;
                                ResultSet rs1 = null, rs = null;
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "root");
                                } catch (Exception e) {
                                    out.println("Error in loading drivers" + e);
                                }
                            %>                  

                            <br>
                            <%
                                String query = "select * from rate";
                                String query1 = "select * from dis";
                                Statement pst, pst1;
                                pst = con.createStatement();
                                rs = pst.executeQuery(query);
                                pst1 = con.createStatement();
                                rs1 = pst1.executeQuery(query1);
                            %>
                            <TABLE BORDER="2" color="white">
                                <TR>
                                    <TH><h3>Rooms</h3></TH>
                            
                                    <TH><h3>Rates</h3></TH>

                                </TR>
                                <% while (rs.next()) {%>
                                <TR>
                                    <TD><h4> <%= rs.getString(1)%></h4></td>
                                   
                                    <TD><h4> <%= rs.getString(2)%></h4></TD>
                                </TR>
                                <% }%>
                            </TABLE><br><br>
                            <table>
                                <TR>
                                    <TH><h3>Discount</h3></TH>

                                </TR>
                                <% while (rs1.next()) {%>
                                <TR>
                                    <TD> <h4><%= rs1.getString(1)%>%</h4></TD>
                                </TR>
                                <% }%>
                            </table>
                          <br>

                                <div class="btns"><input type = "submit"  class="button"><br><input type = "reset"  class="button"></div>
                                <br><br> </fieldset>
                    </form>
                </div>
                <!--==============================footer=================================-->
                <footer>
                    <p>© Hotel Mayur</p>
                    <p><a target="_blank" href="http://www.mayurhotel.com/">www.HotelMayur.com</a></p>
                </footer>
                <script>Cufon.now();</script></div>
                </body>
                </html>