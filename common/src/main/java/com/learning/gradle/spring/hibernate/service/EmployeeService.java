package com.learning.gradle.spring.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.gradle.spring.hibernate.dao.IEmployeeDAO;
import com.learning.gradle.spring.hibernate.entity.Employee;

@Service
@Transactional
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeDAO employeeDAO;

	public void save(Employee employee) {
		employeeDAO.save(employee);
	}

	public List<Employee> getAll() {
		return employeeDAO.getAll();
	}

	public Employee get(Long id) {
		return employeeDAO.get(id);
	}
}
