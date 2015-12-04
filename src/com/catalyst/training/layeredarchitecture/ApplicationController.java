package com.catalyst.training.layeredarchitecture;

import com.catalyst.training.layeredarchitecture.services.EmployeeService;

public class ApplicationController {

	private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	public void start(){
		employeeService.getEmployees();
	}
	
	 
}
