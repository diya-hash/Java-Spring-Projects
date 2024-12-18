package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.entity.Employee;

public class SelectServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		//read data from form and display data from DB
		int id = Integer.parseInt(req.getParameter("id"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employee";
			String user = "root";
			String password = "Root_1234";
			Connection con = DriverManager.getConnection(url, user, password);
			
			PreparedStatement ps = con.prepareStatement("select * from emp where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter();
			if(rs.next()) {
				int id_selected = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				
				Employee e = new Employee(id_selected, name, sal);
				req.setAttribute("emp", e);
				
				RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
				rd.forward(req, resp);
			} else {
				pw.write( "<h1 style='color:green'>No record found!!!</h1>" );
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
