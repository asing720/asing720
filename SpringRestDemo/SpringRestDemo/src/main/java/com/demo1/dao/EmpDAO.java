package com.demo1.dao;

import java.util.List;

import com.demo1.model.Employee;

public interface EmpDAO {
	List<Employee> getAllEmployees();
	
	int createEmployee(Employee e);
	
	void deleteEmployee(int empId);
	
}
