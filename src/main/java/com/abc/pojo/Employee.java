package com.abc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@Column(name = "EID")
	private String eid;

	@Column(name = "ENAME")
	private String ename;

	@Column
	private String eage;

	@Column(name = "EADDRESS")
	private String eaddress;

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEage() {
		return eage;
	}

	public void setEage(String eage) {
		this.eage = eage;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public Employee() {
		System.out.println("Employee Serialized Object Created by HBN!!!!");
	}

	@Override
	public String toString() {
		return "[eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + "]";
	}

}
