package com.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo1.dao.EmpDAO;
import com.demo1.model.Employee;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private EmpDAO empdao;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList = empdao.getAllEmployees();
		return empList;
	}

	@Override
	@Transactional
	public int createEmployees(Employee e) {
		System.out.println(e);
		int id= empdao.createEmployee(e);
		return id;
	}

	@Override
	@Transactional
	public void deleteEmployee(int empId) {
		System.out.println(empId);
		empdao.deleteEmployee(empId);
	}
	
	
}
