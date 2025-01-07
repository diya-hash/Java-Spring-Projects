package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmpDao {
	@Autowired
	private JdbcTemplate template;
	
	public void register(int id, String name, int sal) {
		Object[] args = {id, name, sal};
		template.update("insert into emp values(?,?,?)", args);
	}
}
