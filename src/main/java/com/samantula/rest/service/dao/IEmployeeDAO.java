package com.samantula.rest.service.dao;

import java.util.List;

import com.samantula.rest.entity.Employee;

public interface IEmployeeDAO {

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int EmployeeId);

	void addEmployee(Employee Employee);

	void updateEmployee(Employee Employee);

	void deleteEmployee(int EmployeeId);

	boolean employeeExists(String title, String category);
}
