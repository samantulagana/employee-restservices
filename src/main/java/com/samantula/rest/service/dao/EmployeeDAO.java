package com.samantula.rest.service.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.samantula.rest.entity.Employee;

@Transactional
@Repository
public class EmployeeDAO implements IEmployeeDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Employee getEmployeeById(int employeeId) {
		return entityManager.find(Employee.class, employeeId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		String hql = "FROM Employee as atcl ORDER BY atcl.employeeid";
		return (List<Employee>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		Employee emp = getEmployeeById(employee.getEmployeeid());
		emp.setFirstname(employee.getFirstname());
		emp.setLastname(employee.getLastname());
		entityManager.flush();
	}

	@Override
	public void deleteEmployee(int employeeId) {
		entityManager.remove(getEmployeeById(employeeId));
	}

	@Override
	public boolean employeeExists(String firstname, String lastname) {
		String hql = "FROM Employee as atcl WHERE atcl.firstname = ? and atcl.lastname = ?";
		int count = entityManager.createQuery(hql).setParameter(1, firstname).setParameter(2, lastname).getResultList()
				.size();
		return count > 0 ? true : false;
	}
}
