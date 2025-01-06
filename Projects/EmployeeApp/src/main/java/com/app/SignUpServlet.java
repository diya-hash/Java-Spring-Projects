package com.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.utility.ConnectionFactory;

public class SignUpServlet extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		try {
			Connection con = ConnectionFactory.getCon();
			PreparedStatement ps = con.prepareStatement("insert into login values(?,?,?)");
			ps.setString(1, email);
			ps.setString(2,  username);
			ps.setString(3,  password);
			int isSignedUp = ps.executeUpdate();
			if(isSignedUp != 0) {
				HttpSession session = req.getSession();
				session.setAttribute("user", username);
				req.setAttribute("msg", "sucessfully registered" + username);
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.forward(req, res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
