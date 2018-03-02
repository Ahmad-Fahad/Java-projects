package FirstPac;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.print.attribute.standard.PresentationDirection;


public class NewDbase {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=root&passward=rootpassward");
			PreparedStatement ps=con.prepareStatement("CREATE DATABASE databasename");
			int result=ps.executeUpdate();
			System.out.println("Database Connected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
