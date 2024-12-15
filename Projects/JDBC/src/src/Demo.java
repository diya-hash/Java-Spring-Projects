package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String password = "Root_1234";
		Connection con = DriverManager.getConnection(url, user, password);
		
		PreparedStatement ps = con.prepareStatement("insert into emp value(?, ?, ?)");
		ps.setInt(1, 5);
		ps.setString(2, "Parth");
		ps.setInt(3, 5000);
		int result = ps.executeUpdate();
		
		System.out.println(result + " record added");
		
		con.close();
	}
}
