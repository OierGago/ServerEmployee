package com.example.play.repository;

import java.util.List;

import com.example.play.exceptions.EmployeeNotFoundException;
import com.example.play.exceptions.NotFoundConstraintException;
import com.example.play.model.Employee;

public interface EmployeeRepository {

	List<Employee> findAll();
	Employee findById(long id) throws EmployeeNotFoundException;
	int create(Employee employee) throws NotFoundConstraintException;
	int update(Employee employee);
	int deleteById(long id);
	List<Employee> findAllByDepartmentId(long departmentId);
}
