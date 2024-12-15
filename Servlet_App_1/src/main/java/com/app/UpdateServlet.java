package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		//read data from form and add in DB
		int id = Integer.parseInt(req.getParameter("id"));
		int salary = Integer.parseInt(req.getParameter("sal"));
		System.out.println(id + " " + salary);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/employee";
			String user = "root";
			String password = "Root_1234";
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = con.prepareStatement("update emp set sal=? where id=?");
			ps.setInt(1, salary);
			ps.setInt(2, id);
			ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();			
		}
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.write("<h1> Salary updated successfully</h1>");
		pw.close();
	}
}
