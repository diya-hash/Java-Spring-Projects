package com.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dao.EmpDao;

@Controller
public class HomeController {
	
	@Autowired
	private EmpDao dao;
	
	@RequestMapping("/register-process")
	public String register(@RequestParam ("id") int i, @RequestParam ("name") String n, @RequestParam int sal ) {
		System.out.println(i + " " + n + " " + sal);	
		dao.register(i, n, sal);
		return "success";
	}

}
