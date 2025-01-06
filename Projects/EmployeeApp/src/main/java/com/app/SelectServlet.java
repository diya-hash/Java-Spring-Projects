package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.EmpDao;
import com.app.entity.Employee;

public class SelectServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		HttpSession session = req.getSession(false);
		String username = null;
		if(session != null) {
			username = (String) session.getAttribute("pass");
		}
		if(username == null) {
			req.setAttribute("errorMsg", "Employee unavailable");
			RequestDispatcher rd = req.getRequestDispatcher("select.jsp");
			rd.forward(req, resp);
		} else {
			int id = Integer.parseInt(req.getParameter("id"));
			resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter();
			EmpDao dao = new EmpDao();
			Employee e = dao.selectById(id);
			if(e == null) {
				req.setAttribute("errorMsg", "Employee unavailable");
				RequestDispatcher rd = req.getRequestDispatcher("select.jsp");
				rd.forward(req, resp);
			}else {
				req.setAttribute("emp", e);
				RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
				rd.forward(req, resp);
			}
		}
	}
}
