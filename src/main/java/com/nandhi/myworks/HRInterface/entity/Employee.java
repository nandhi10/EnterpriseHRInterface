package com.nandhi.myworks.HRInterface.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
//@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	public Employee() {
	}
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "empfirstname")
	private String empfirstname;
	@Column(name = "emplastname")
	private String emplastname;
	@Column(name = "empdept")
	private String empdept;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpfirstname() {
		return empfirstname;
	}
	public void setEmpfirstname(String empfirstname) {
		this.empfirstname = empfirstname;
	}
	public String getEmplastname() {
		return emplastname;
	}
	public void setEmplastname(String emplastname) {
		this.emplastname = emplastname;
	}
	@Transient
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

	

}