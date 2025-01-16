package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;
import com.app.service.EmpService;


@RestController 
public class HomeController {
	@Autowired
	EmpService empService;
	
	@GetMapping("emp/id/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		Employee e = empService.getEmployeeById(id);
		return e;
	}
	
	@GetMapping("all-employee")
	public List<Employee> getAllEmployee(){
		List<Employee> employeeList = empService.getAllEmployees();
		return employeeList;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUpdateEmployee(@RequestBody Employee employee) {
		empService.addUpdateEmployee(employee);
		return "ok";
	}
}
