<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<html> 
<head> 
    <meta http-equiv="refresh" content="3; URL='../ContactUs.html'">
<title>Connection with mysql database</title> 
</head> 
<body>
<% 
        String connectionURL = "jdbc:mysql://localhost/project";
        Connection conn = null; 
	try 
	{
		Class.forName("com.mysql.jdbc.Driver").newInstance(); 
		conn = DriverManager.getConnection(connectionURL, "root", "root");
	}
	catch(Exception ex)
        {
            out.println("Unable to connect to database.");
	}
        String nameText, emailText, msgText;
        nameText = request.getParameter("NameText");
        emailText = request.getParameter("EmailText");
        msgText = request.getParameter("TArea");
        try{
        PreparedStatement stmt = conn.prepareStatement("insert into contact values('"+nameText+"','"+emailText+"','"+msgText+"')");
        int i=stmt.executeUpdate();
        if(i!=0){
        out.println("Your Message has been sent!!");
        out.println("thank you fir your valuable feedback!!");
        out.println("please wait while you are re-directed to your previous page");
        }
        }catch(Exception e){out.println(""+e);}
        conn.close() ;
%>
</body> 
</html>