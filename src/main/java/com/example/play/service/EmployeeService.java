package com.example.play.service;

import java.util.List;

import com.example.play.exceptions.EmployeeNotFoundException;
import com.example.play.exceptions.NotFoundConstraintException;
import com.example.play.model.Employee;
import com.example.play.model.EmployeeServiceResponse;

public interface EmployeeService {
	List<EmployeeServiceResponse> getAllEmployees();
	EmployeeServiceResponse getEmployeeById(long id) throws EmployeeNotFoundException;
	int createEmployee(Employee employee) throws NotFoundConstraintException;
	int updateEmployee(Employee employee);
	int deleteEmployeeById(long id);
	EmployeeServiceResponse getEmployeeWithBoss(long id) throws EmployeeNotFoundException;
	List<EmployeeServiceResponse> getEmployeesByDepartmentId(long id);
}
