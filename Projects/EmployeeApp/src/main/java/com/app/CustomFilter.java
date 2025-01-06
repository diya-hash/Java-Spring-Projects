package com.app;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CustomFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String url = req.getRequestURI();
		System.out.println(url);
		if(url.endsWith("/") || url.endsWith("/index.jsp") || url.endsWith("/signup.jsp") || url.endsWith("/login_username")) {
			chain.doFilter(req, res);
		} else {
			HttpSession session = req.getSession();
			String password = null;
			if(session!=null) {
				password = (String) session.getAttribute("pass");
			}
			if(password == null) {
				req.setAttribute("errorMsg", "please login first");
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.forward(request, res);
			} else {
				chain.doFilter(req, res);
			}
		}
	}
}
