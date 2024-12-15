package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcExample {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String password = "Root_1234";
		Connection con = DriverManager.getConnection(url, user, password);
	
		Statement st = con.createStatement();
		
		int result = st.executeUpdate("insert into emp value(3, 'Nam', 5000)");
		
		System.out.println(result + " record added");
	}
}
