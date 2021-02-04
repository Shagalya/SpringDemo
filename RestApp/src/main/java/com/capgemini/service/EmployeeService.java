package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Employee;

public interface EmployeeService {

	List<Employee> getEmployees();

	Employee addEmployee(Employee emp);
	
     void deleteEmployee(String empId);
	
	void updateEmployee(String empId, Employee employee);

}