package com.samantula.rest.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.samantula.rest.entity.Employee;

public interface IEmployeeService {
	
	@Secured({ "ROLE_ADMIN", "ROLE_USER" })
	List<Employee> getAllEmployees();

	@Secured({ "ROLE_ADMIN", "ROLE_USER" })
	Employee getEmployeeById(int articleId);

	@Secured({ "ROLE_ADMIN" })
	boolean addEmployee(Employee article);

	@Secured({ "ROLE_ADMIN" })
	void updateEmployee(Employee article);

	@Secured({ "ROLE_ADMIN" })
	void deleteEmployee(int articleId);
}
