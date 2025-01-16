package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmpDao;
import com.app.entity.Employee;

@Service
public class EmpService {

	@Autowired
	private EmpDao empDao;
	
	public Employee getEmployeeById(int id) {
		Optional<Employee> opt = empDao.findById(id);
		if(opt.isPresent())
			return opt.get();
		else
			return null;
	}
	
	public List<Employee> getAllEmployees(){
		List<Employee> list = empDao.findAll();
		return list;
	}
	
	public void addUpdateEmployee(Employee e) {
		empDao.save(e);
	}
}
