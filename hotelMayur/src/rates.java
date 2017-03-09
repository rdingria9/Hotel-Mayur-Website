
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AKHIL
 */
public class rates {

    Connection con;
    ResultSet rs;

    public rates() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "root");

        } catch (Exception e) {
            System.out.println("Error in connection" + e);
        }
    }

    public ResultSet updateRate() throws SQLException {
        try {

            String query = "select * from season ";
            PreparedStatement stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("error in display table");
        }
        return rs;
    }
       public ResultSet showRoomRate()
    {
        try {

            String query = "select * from rate ";
            PreparedStatement stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("error in displaying details.."+e);
        }
        return rs;
    }
    public boolean updateRate(int r , String i) throws SQLException {
        try {
            PreparedStatement stmt = con.prepareStatement("update season set srate = ? where stype = ?");
            stmt.setInt(1, r);
            stmt.setString(2,i);
            stmt.executeUpdate();
            return false;
        } catch (Exception e) {
            System.out.println("error in changing values of  table");
        }
        return false;
    }
    public boolean updateRoomRate(int r) throws SQLException {
        try {
            PreparedStatement pst1 = con.prepareStatement("update rate set rate = ? where rtype = '2AC'");
            pst1.setInt(1, (int) (r*1.5));
            pst1.executeUpdate();
            PreparedStatement pst2 = con.prepareStatement("update rate set rate = ? where rtype='2NAC'");
            pst2.setInt(1,r);
            pst2.executeUpdate();
            PreparedStatement pst3 = con.prepareStatement("update rate set rate = ? where rtype='3AC'");
            pst3.setInt(1, (int) (r*1.75));
            pst3.executeUpdate();
            PreparedStatement pst4 = con.prepareStatement("update rate set rate = ? where rtype='3NAC'");
            pst4.setInt(1, (int) (r*1.5));
            pst4.executeUpdate();
            return false;
            
        } catch (Exception e) {
            System.out.println("error in changing values of room table");
        }
        return false;
    }
}
