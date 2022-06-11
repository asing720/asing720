package com.demo1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.demo1.model.Employee;

public class EmpDAOImpl implements EmpDAO {

	@PersistenceContext
	EntityManager em;

	@Override
	public List<Employee> getAllEmployees() {
		TypedQuery<Employee> emptqury = em.createQuery("Select e from Employee e", Employee.class);
		return emptqury.getResultList();
	}

	@Override
	public int createEmployee(Employee e) {
		em.persist(e);
		return e.getEmployeeId();
	}

	@Override
	public void deleteEmployee(int empId) {

	}

}
