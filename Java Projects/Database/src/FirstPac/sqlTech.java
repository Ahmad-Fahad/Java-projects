package FirstPac;
import java.sql.*;
public class sqlTech {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/?user=root&passward=rootpassward","DataSheet","key");
		//	PreparedStatement ps=conn.prepareStatement("CREATE DATABASE DataTable");
			Statement stmt1=conn.createStatement();
			ResultSet rs1=stmt1.executeQuery("select * from department");
			
			//int result=ps.executeUpdate();
			System.out.println("Database Connected");
			while(rs1.next()){
				System.out.println(rs1.getInt("Depertment_ID")+",");
				System.out.println(rs1.getString("Dept_Name")+",");
				System.out.println(rs1.getString("Manager")+",");
			}
			
			stmt1.close();
			conn.close();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		System.out.println("SQL Exception : "+e.getMessage());
		}
	}

}
