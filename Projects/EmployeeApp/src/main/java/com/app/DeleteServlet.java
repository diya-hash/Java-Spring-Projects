package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.utility.ConnectionFactory;



public class DeleteServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		HttpSession session = req.getSession(false);
		String password = null;
		if(session != null) {
			password = (String) session.getAttribute("pass");
		}
		if(password == null) {
			req.setAttribute("errorMsg", "Login First");
			RequestDispatcher rd = req.getRequestDispatcher("delete.jsp");
			rd.forward(req, resp);
		} else {
			int id = Integer.parseInt(req.getParameter("id"));
			System.out.println(id);
			try {
				Connection con = ConnectionFactory.getCon();
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
}
