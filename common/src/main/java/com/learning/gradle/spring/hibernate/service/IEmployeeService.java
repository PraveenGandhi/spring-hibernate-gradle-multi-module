package com.learning.gradle.spring.hibernate.service;

import java.util.List;

import com.learning.gradle.spring.hibernate.entity.Employee;

public interface IEmployeeService {

	public abstract void save(Employee employee);

	public abstract List<Employee> getAll();

	public abstract Employee get(Long id);

}