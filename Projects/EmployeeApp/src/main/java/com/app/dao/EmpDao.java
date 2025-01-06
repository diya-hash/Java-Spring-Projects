package com.app.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.entity.Employee;
import com.utility.ConnectionFactory;


public class EmpDao {
public List<Employee> selectAll() {
	try {
		Connection con = ConnectionFactory.getCon();
		PreparedStatement ps = con.prepareStatement("select * from emp");
		ResultSet rs = ps.executeQuery();
		
		List<Employee> list = new ArrayList();
		while(rs.next()) {
			int id_selected = rs.getInt("id");
			String name = rs.getString("name");
			int sal = rs.getInt("sal");					
			Employee e = new Employee(id_selected, name, sal);
			list.add(e);								
		}
		return list;
	}catch(Exception ex) {
		ex.printStackTrace();				
	}
	return null;
	}
	public Employee selectById(int id) {
		try {
			Connection con = ConnectionFactory.getCon();
			PreparedStatement ps = con.prepareStatement("select * from emp where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int id_selected = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				Employee e = new Employee(id_selected, name, sal);
				return e;
			} else {
				return null;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public boolean add(Employee e) {
		try {
			Connection con = ConnectionFactory.getCon();
			PreparedStatement ps = con.prepareStatement("insert into emp values(?, ?, ?)");
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setInt(3, e.getSal());
			ps.executeUpdate();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		
	}
	public boolean updateSalary(int id, int salary) {
		try {
			Connection con = ConnectionFactory.getCon();
			PreparedStatement ps = con.prepareStatement("update emp set sal=? where id=?");
			ps.setInt(1, salary);
			ps.setInt(2, id);
			ps.executeUpdate();
			return true;
		}catch(Exception e){
			e.printStackTrace();	
			return false;
		}
	}
}
