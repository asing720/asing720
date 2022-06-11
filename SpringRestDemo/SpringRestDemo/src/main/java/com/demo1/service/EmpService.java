package com.demo1.service;

import java.util.List;

import com.demo1.model.Employee;

public interface EmpService {
	
	List<Employee> getAllEmployees();
	
	int createEmployees(Employee e);
	
	void deleteEmployee(int empId);
}
