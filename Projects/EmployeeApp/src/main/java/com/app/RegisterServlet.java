package com.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.EmpDao;
import com.app.entity.Employee;

public class RegisterServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		HttpSession session = req.getSession(false);
		String password = null;
		if(session != null) {
			password = (String) session.getAttribute("pass");
		}
		if(password == null) {
			req.setAttribute("errorMsg", "registration unsuccessful, login first");
			RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
			rd.forward(req, res);
		} else {
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			int salary = Integer.parseInt(req.getParameter("salary"));
			Employee e = new Employee(id, name, salary);
			
			EmpDao dao = new EmpDao();
			boolean isRegistered = dao.add(e);
			if(isRegistered) {
				req.setAttribute("successMsg", "registration successful");
				RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
				rd.forward(req, res);
			} else {
				req.setAttribute("errorMsg", "registration unsuccessful");
				RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
				rd.forward(req, res);
			}
		}
	}
}
