package com.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.utility.ConnectionFactory;

public class LoginUsernameServlet extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		try {
			Connection con = ConnectionFactory.getCon();
			PreparedStatement ps = con.prepareStatement("select password from login where password = ?");
			ps.setString(1, password);
			ResultSet rs = ps.executeQuery();
			String pass = null;
			if(rs.next()) {
				pass = rs.getString("password");
				System.out.println(pass);
			}
			if(password.equals(pass)) {
				HttpSession session = req.getSession();
				session.setAttribute("pass", password);
				req.setAttribute("user", username);
				RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
				rd.forward(req, res);
			}else {
				req.setAttribute("errorMsg", "Sign Up first");
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.forward(req, res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
