package com.capgemini.onetomany.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onetomany.dao.EmployeeDao;
import com.capgemini.onetomany.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;

//	@Override
//	public void addNewEmployee(Employee employee) {
//	employeeDao.save(employee);
//
//	}
//
//	@Override
//	public Employee showEmployeeById(int employeeId) {
//		return (employeeDao.findById(employeeId).get());
//	}
//	
	

	@Override
	public void addNewEmployee(Employee employee) {
	employeeDao.save(employee);
	}
	@Override
	public void oneToManyAddition(Set<Employee> employee) {
		employeeDao.saveAll(employee);	
	}
	
	@Override
	public Employee showOneToMany(int employeeId) {
		return employeeDao.findById(employeeId).get();

}
}
