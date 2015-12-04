package com.catalyst.training.layeredarchitecture.daos.xml;

import java.util.List;

import com.catalyst.training.layeredarchitecture.daos.EmployeeDao;
import com.catalyst.training.layeredarchitecture.entities.Employee;

public class EmployeeXmlData implements EmployeeDao {

	@Override
	public List<Employee> getEmployees(){ 
		System.out.println("XML Data");
		return null;
	}
}
