package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;


@RestController //@Controller + @ResponseBody
public class HomeController {
	
//	@ResponseBody - Jackson API whicvh enables the mapping and for the Controller annotation to show the output in view(jsp in this case)
	@RequestMapping(value = "/test-api", method = RequestMethod.GET)
	public Employee myFirstWebService() {
		Employee e = new Employee(1, "Riya", 1000);
		return e;
	}
//this is query string and is used to get unique values like id	
	@RequestMapping(value = "/emp")
	public Employee getById(@RequestParam("id") int id) {
		Employee e = new Employee(id, "sam", id*1000);
		return e;
	}

	@RequestMapping(value = "/emps")
	public Employee getByIdAndName(@RequestParam int id, @RequestParam String name) {
		Employee e = new Employee(id, name, 20000);
		return e;
	}
//this is using Path Variable annotation and it is used to get values for variables whic are not unique in the DB
	@RequestMapping(value = "/emp_id/id/{id}")
	public Employee getById_v1(@PathVariable int id) {
		Employee e = new Employee(id, "Pamela", 20000);
		return e;
	}
	@RequestMapping(value = "/emp/id/{id}/name/{name}")
	public Employee getByIdName_v1(@PathVariable int id, @PathVariable String name) {
		Employee e = new Employee(id, name, 300);
		return e;
	}
// put method and testing using postman
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String addEmployee(@RequestBody Employee employee) {
		System.out.println(employee.getId() + employee.getName() + employee.getSal());
		return "ok";
	}
	
}
