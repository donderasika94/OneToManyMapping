package com.capgemini.onetomany.service;



import java.util.Set;

import com.capgemini.onetomany.entity.Employee;


public interface EmployeeService {
	
	//public void addNewEmployee(Employee employee);
	
	//public Employee showEmployeeById(int employeeId);
	public void addNewEmployee(Employee employee);
	
	public void oneToManyAddition(Set<Employee> employee);
	
	public Employee showOneToMany(int employeeId);

}
