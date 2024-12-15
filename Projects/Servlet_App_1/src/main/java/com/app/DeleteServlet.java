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

public class DeleteServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		//read data from form and add in DB
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/employee";
			String user = "root";
			String password = "Root_1234";
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = con.prepareStatement("delete from emp where id in (?)");
			ps.setInt(1, id);
			ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();			
		}
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.write("<h1> Record deleted successfully</h1>");
		pw.close();
	}
}
