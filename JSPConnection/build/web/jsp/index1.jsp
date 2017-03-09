<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<html> 
    <head> 
         <meta http-equiv="refresh" content="3; URL='../Book.html'">
        <title>Connection with mysql database</title> 
    </head> 
    <body>
        <%
            String connectionURL = "jdbc:mysql://localhost/project";
            Connection conn = null;
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection(connectionURL, "root", "root");
            } catch (Exception ex) {
                out.println("Unable to connect to database.");
            }
            String  t1, t2, ta, select, fromd, tod,status="Booked",rate="";
            t1 = request.getParameter("t1");
            t2 = request.getParameter("t2");
            ta = request.getParameter("ta");
            select = request.getParameter("select");
            fromd = request.getParameter("fromd").toString();
            tod = request.getParameter("tod").toString();
            try {
                PreparedStatement stmt1 = conn.prepareStatement("select rate from rate where rtype='"+select+"'");
                ResultSet rs=stmt1.executeQuery();
                rs.first();
                rate=rs.getString(1);
            } catch (Exception e) {
                out.println("" + e);
            }
            try {
                PreparedStatement stmt2 = conn.prepareStatement("insert into customer  (name,email,address,datefrom,dateto,rtype,status,price) values('" + t1 + "','" + t2 + "','" + ta + "','" + fromd + "','" + tod + "','" + select +"','"+status+"','"+rate+"')");
                int j = stmt2.executeUpdate();
                if (j != 0) {
                    out.println("Your room has been booked !!");
                    out.println("Please wait while you are Re-Directed to previous page");
                }
            } catch (Exception e) {
                out.println("" + e);
            }
            
            conn.close();
        %>
    </body> 
</html>