
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class customer {

    Connection con;
    ResultSet rs;

    public customer() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "root");

        } catch (Exception e) {
            System.out.println("Error in connection" + e);
        }
    }
    public ResultSet showCustomer()
    {
        try {

            String query = "select * from customer ";
            PreparedStatement stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("error in display table");
        }
        return rs;
    }
}
