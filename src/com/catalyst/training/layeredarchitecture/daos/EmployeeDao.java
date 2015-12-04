package com.catalyst.training.layeredarchitecture.daos;

import java.util.List;

import com.catalyst.training.layeredarchitecture.entities.Employee;

public interface EmployeeDao {

	List<Employee> getEmployees();
}
