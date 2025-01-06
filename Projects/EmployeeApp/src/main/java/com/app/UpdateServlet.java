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


public class UpdateServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		HttpSession session = req.getSession(false);
		String email = null;
		if(session != null) {
			email = (String) session.getAttribute("email");
		}
		if(email == null) {
			req.setAttribute("errorMsg", "update unsuccessful, login first");
			RequestDispatcher rd = req.getRequestDispatcher("update.jsp");
			rd.forward(req, resp);
		} else {
			int id = Integer.parseInt(req.getParameter("id"));
			int salary = Integer.parseInt(req.getParameter("sal"));
			EmpDao dao = new EmpDao();
			boolean isUpdated = dao.updateSalary(id, salary);
			if(isUpdated) {
				req.setAttribute("successMsg", "updated successfully");
				RequestDispatcher rd = req.getRequestDispatcher("update.jsp");
				rd.forward(req, resp);
			} else {
				req.setAttribute("errorMsg", "update unsuccessful");
				RequestDispatcher rd = req.getRequestDispatcher("update.jsp");
				rd.forward(req, resp);
			}
		}

	}
}
