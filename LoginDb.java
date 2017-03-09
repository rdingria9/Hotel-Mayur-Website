
import java.sql.*;

public class LoginDb {
    Connection con;
    ResultSet rs;
    public LoginDb()
    {
        try
		{
			 Class.forName("com.mysql.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","akhil1234");            

		}
		catch(Exception e)
		{
			System.out.println("Error in connection" +e);
		}
    }
    public boolean validLogin(String u , String p) throws SQLException
    {
        String s1="";
        String query = "select pass from login where name = '"+u+"';";
        PreparedStatement stmt = con.prepareStatement(query);    
	rs = stmt.executeQuery(query);
                        while(rs.next())
			{
                            s1 = rs.getString("pass");
			}
                        if(s1.equals(p))
                            return true;
                        else
                            return false;
    }
}
