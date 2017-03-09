
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class feedback {
    Connection con;
    ResultSet rs;

    public feedback() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "root");

        } catch (Exception e) {
            System.out.println("Error in connection" + e);
        }
    }
    public ResultSet showFeedback()
    {
        try {

            String query = "select * from contact ";
            PreparedStatement stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("error in displaying table");
        }
        return rs;
    }
}
