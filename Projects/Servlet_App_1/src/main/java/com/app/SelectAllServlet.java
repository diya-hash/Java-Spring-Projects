package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.entity.Employee;

public class SelectAllServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employee";
			String user = "root";
			String password = "Root_1234";
			Connection con = DriverManager.getConnection(url, user, password);
			
			PreparedStatement ps = con.prepareStatement("select * from emp");
			ResultSet rs = ps.executeQuery();

			List<Employee> list = new ArrayList<>();
			while(rs.next()) {
				int id_selected = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");					
				Employee e = new Employee(id_selected, name, sal);
				list.add(e);								
			}
			req.setAttribute("emplist", list);	
			RequestDispatcher rd = req.getRequestDispatcher("displayAll.jsp");
			rd.forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
