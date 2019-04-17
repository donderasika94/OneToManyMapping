package com.capgemini.onetomany.entity;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	
	@Id
	private int employeeId;
	private String employeeName;
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private Set<Certificate> certifcate;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String employeeName) {
		super();
		this.employeeName = employeeName;
	}


	public Employee(int employeeId, String employeeName, Set<Certificate> certifcate) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.certifcate = certifcate;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Set<Certificate> getCertifcate() {
		return certifcate;
	}
	public void setCertifcate(Set<Certificate> certifcate) {
		this.certifcate = certifcate;
	}
	
	
	
	
	

}
