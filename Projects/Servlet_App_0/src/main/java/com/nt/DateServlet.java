package com.nt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html");
		Date date = new Date();
		PrintWriter pw = resp.getWriter();
		pw.write("<h1 style='color:green'>Current date and time is " + date +"</h1>");
		pw.close();
	}
}
