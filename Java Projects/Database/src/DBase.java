import java.sql.*;

/**
 * Created by Sheikh Muhammad on 03-01-16.
 */
public class DBase {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=root&passward=rootpassward");
            PreparedStatement ps=con.prepareStatement("CREATE DATABASE databasevjdhname");
            int result=ps.executeUpdate();
            System.out.println("Database Connected");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
