package com.app.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.entity.Employee;

public interface EmpDao extends CrudRepository<Employee, Integer>{
	List<Employee> findAll();
}
