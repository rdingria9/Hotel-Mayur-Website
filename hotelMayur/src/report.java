
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class report {
     Connection con;
    ResultSet rs;

    public report() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "root");

        } catch (Exception e) {
            System.out.println("Error in connection" + e);
        }
    }
}