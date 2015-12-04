package com.catalyst.training.layeredarchitecture.services.impl;

import java.util.List;

import com.catalyst.training.layeredarchitecture.daos.EmployeeDao;
import com.catalyst.training.layeredarchitecture.entities.Employee;
import com.catalyst.training.layeredarchitecture.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@Override
	public List<Employee> getEmployees() {
		 
		return employeeDao.getEmployees();
	}

	
}
