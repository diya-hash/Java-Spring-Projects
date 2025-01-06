package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.EmpDao;
import com.app.entity.Employee;

public class SelectAllServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		HttpSession session = req.getSession(false);
		String password = null;
		if(session != null) {
			password = (String) session.getAttribute("pass");
		}
		if(password == null) {
			req.setAttribute("errorSelect", "Login first");
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);
		} else {
			EmpDao dao = new EmpDao();
			List<Employee> list = dao.selectAll();
			if(list == null) {
				req.setAttribute("errorSelect", "Employees unavailable");
				RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
				rd.forward(req, resp);
			}else {
				req.setAttribute("emplist", list);
				RequestDispatcher rd = req.getRequestDispatcher("displayAll.jsp");
				rd.forward(req, resp);
			}
		
		}
	}
}
