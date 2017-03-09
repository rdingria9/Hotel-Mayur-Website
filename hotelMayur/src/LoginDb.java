
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginDb {

    Connection con;
    ResultSet rs;

    public LoginDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "root");

        } catch (Exception e) {
            System.out.println("Error in connection" + e);
        }
    }

    public boolean validLogin(String u, String p) throws SQLException {
        String s1 = "";
        try {
            String query = "select pass from login where name = '" + u + "';";
            PreparedStatement stmt = con.prepareStatement(query);
            rs = stmt.executeQuery(query);
            rs.first();
            s1 = rs.getString("pass");
            //System.out.println("db:"+s1+"user:"+p);
            if (s1.equals(p)) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in Validation.");
        }
        return false;
    }

    public boolean changePassword(String str1, String str2) {
        try {

            /*String q1 = "update login set pass= '"+str2+"' where name = 'admin';";
             String q2 = "update login set name = '"+str1+"' where pass ='"+str2+"';";*/
            String q3 = "select * from login;";
            String r1 = "update login set pass=? where name =?";
            PreparedStatement stmt1 = con.prepareStatement(r1);
            stmt1.setString(1, str2);
            stmt1.setString(2, "admin");
            int i1 = stmt1.executeUpdate();
            r1 = "update login set name =? where pass =?";
            PreparedStatement stmt2 = con.prepareStatement(r1);

            stmt1.setString(1, str1);
            stmt1.setString(2, str2);
            int i2 = stmt2.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Password SuceessFully Changed");
            //if(i1==1)
            //JOptionPane.showMessageDialog(null,"Password SuceessFully Changed");

            PreparedStatement stmt3 = con.prepareStatement(q3);
            rs = stmt3.executeQuery(q3);
            while (rs.next()) {
                System.out.println(rs.getString("name") + "\t" + rs.getString("pass"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password SuceessFully Changed");
        }
        return false;

    }
}
