package com.demo1.model;

import javax.persistence.*;

@Entity
@Table(name = "Emoployee")
public class Employee {
	@Id
	@Column(name = "employee_id")
	private int employeeId;
	
	@Column(name = "employee_name")
	private int employeeName;
	
	@Column(name = "employee_salary")
	private int employeeSalary;
	
	public Employee() {
		
	}

	public Employee(int employeeId, int employeeName, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(int employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

}
