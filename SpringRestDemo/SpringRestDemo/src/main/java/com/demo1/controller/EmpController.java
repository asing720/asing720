package com.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo1.model.Employee;
import com.demo1.service.EmpService;

@RestController
@RequestMapping(value = "/emp")

public class EmpController {
	
	@Autowired
	private EmpService empservice;
	
	@GetMapping(value = "/getempdetails", produces = "application/json")
	List<Employee> getEmployees() {
		List<Employee> empList = empservice.getAllEmployees();
		return empList;
	}
	
	@GetMapping(value = "/saveemp", consumes = "application/json", produces = "application/json")
	ResponseEntity<Employee> createEmployee(@RequestBody Employee e) {
		int id = empservice.createEmployees(e);
		System.out.println("Employee with id " + id + " has been created");
		return ResponseEntity.ok(e);
	}
}
