package com.catalyst.training.layeredarchitecture.daos.csv;

import java.util.List;

import com.catalyst.training.layeredarchitecture.daos.EmployeeDao;
import com.catalyst.training.layeredarchitecture.entities.Employee; 

public class EmployeeCsvData implements EmployeeDao {

	@Override
	public List<Employee> getEmployees(){ 
		System.out.println("CSV Data");
		return null;
	}

}
