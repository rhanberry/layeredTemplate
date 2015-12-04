package com.catalyst.training.layeredarchitecture;

import com.catalyst.training.layeredarchitecture.daos.csv.EmployeeCsvData;
import com.catalyst.training.layeredarchitecture.daos.xml.EmployeeXmlData;
import com.catalyst.training.layeredarchitecture.services.impl.EmployeeServiceImpl;

public class AppRunner {

	public static void main(String[] args) {
		ApplicationController appController = new ApplicationController();
		EmployeeCsvData employeeCsvData = new EmployeeCsvData();
		EmployeeXmlData employeeXmlData = new EmployeeXmlData();
		EmployeeServiceImpl empService = new EmployeeServiceImpl();
		appController.setEmployeeService(empService);

		//setting EmployeeCsvData as the dependency for EmployeeServicesImpl
		empService.setEmployeeDao(employeeCsvData);
		appController.start();

		//Setting EmployeeXmlData as the dependency for EmployeeServiceImpl
		empService.setEmployeeDao(employeeXmlData);
		appController.start();

	}
}
