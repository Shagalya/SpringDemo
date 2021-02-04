package com.capgemini.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.beans.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	List<Employee> emps = new ArrayList<>(Arrays.asList(
			new Employee("101","Shagalya","Software",90000),
			new Employee("102","ABC","Consultant",50000),
			new Employee("103","DEF","Software",60000)
			));
	
	@Override
	public List<Employee> getEmployees(){
		return emps;
	}
	
	@Override
	public Employee addEmployee(Employee emp) {
		emps.add(emp);
		return emp;
	}

	@Override
	public void deleteEmployee(String empId) {
		emps.removeIf(e->e.getId().equals(empId));
		
	}

	@Override
	public void updateEmployee(String empId, Employee employee) {
		for(int i=0;i<emps.size();i++)
		  {
			  Employee e = emps.get(i);
			  if(e.getId().equals(empId))
			  {
				  emps.set(i, employee);
				  return;
				  
			  }
		  }
		
	}

}
