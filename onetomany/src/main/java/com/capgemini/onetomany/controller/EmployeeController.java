package com.capgemini.onetomany.controller;


import java.util.HashSet;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onetomany.entity.Certificate;
import com.capgemini.onetomany.entity.Employee;
import com.capgemini.onetomany.service.EmployeeService;

@RestController
public class EmployeeController  {
	
	@Autowired
	EmployeeService service;
	
	@RequestMapping("/")
	public Employee showResult() {
		
		Set certificate = new HashSet<Certificate>() {
			{
				add(new Certificate(101, "JAVA"));
				add(new Certificate(102, ".Net"));

			}
		};

		Employee employee = new Employee(101, "Elena", certificate);

		service.addNewEmployee(employee);
		return employee;
	}
			
	
			@RequestMapping("/certification")
			public Set<Employee> employeeList() {
				
				Set<Employee> employeeList= new HashSet<Employee>();
				
				Certificate certification1=new Certificate(102,"java");
				Certificate certification2=new Certificate(103,"Spring");
				Certificate certification3=new Certificate(104,"Web Designing");
				Certificate certification4=new Certificate(105,"DotNet");
				
			    Set<Certificate> certifications= new HashSet<>();
				certifications.add(certification1);
				certifications.add(certification2);
				
				Set<Certificate> certification= new HashSet<>();
				certification.add(certification4);
				certification.add(certification3);

				Employee employee1= new Employee(101,"Stefan",certifications);
				Employee employee2= new Employee(102,"Damon",certifications);
				
				employeeList.add(employee1);
				employeeList.add(employee2);
				
				//service.oneToManyAddition(employeeList);
				return employeeList;
			}
			
			@RequestMapping("/show")
			public Employee show() {
				return service.showOneToMany(101);
			}

}
