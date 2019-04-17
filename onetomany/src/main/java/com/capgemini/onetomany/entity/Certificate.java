package com.capgemini.onetomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Certificate {
	
	@Id
	private int certificateId;
	
	private String certificateName;
	
	@ManyToOne
	private Employee employee;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Certificate(int certificateId, String certificateName) {
		super();
		this.certificateId = certificateId;
		this.certificateName = certificateName;
	}


	public Certificate(String certificateName) {
		super();
		this.certificateName = certificateName;
	}

	public int getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
//
//	public Employee getEmployee() {
//		return employee;
//	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
