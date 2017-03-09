
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AKHIL
 */
public class discount {
    
    Connection con;
    ResultSet rs;

    public discount() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "root");

        } catch (Exception e) {
            System.out.println("Error in connection" + e);
        }
    }
    public ResultSet showDiscount()
    {
        try {

            String query = "select * from dis ";
            PreparedStatement stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("error in displaying details.."+e);
        }
        return rs;
    }
     
     public void  showDiscount(String disc)
    {
        try {
               
            //String query = ;
            PreparedStatement stmt1 = con.prepareStatement("update dis set discount =?");
            stmt1.setString(1,disc);
            stmt1.executeUpdate();
        } catch (Exception e) {
            System.out.println("error in displaying details.."+e);
        }
    }
    
}