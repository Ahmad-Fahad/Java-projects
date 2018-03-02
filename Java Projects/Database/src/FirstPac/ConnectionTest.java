package FirstPac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class ConnectionTest {

	/**
	 * @param args
	 */
	static Connection c=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			c=jdbc();
			String query="Select * from Name&Batch where Name='Rifat'";
			java.sql.PreparedStatement ps=c.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			
			JOptionPane.showMessageDialog(null, rs.getString("Batch"));
			ps.close();
			rs.close();
			
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error : "+e);
			
		}
		

	}
	static Connection jdbc(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c1=DriverManager.getConnection("jdbc:sqlite:E:\\Databases\\DBase.sqlite");
			JOptionPane.showMessageDialog(null, ".....Connected.....!");
			return c1;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error : "+e);
			return null;
			
		}
		
	}

}
