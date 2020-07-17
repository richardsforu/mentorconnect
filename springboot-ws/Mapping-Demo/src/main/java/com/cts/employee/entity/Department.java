package com.cts.employee.entity;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(name = "myGen",strategy = "com.cts.employee.utils.DeptIdGen")
@Table(name = "department")
@SecondaryTable(name="project")
public class Department {
	@Id
	@GeneratedValue(generator = "myGen")
	private String deptId;  // DEPT10020200817124146
	private String deptName;
	private String location;
	
	@Column(table = "project")
	private int projId;
	@Column(table = "project")
	private String projName;
	
	
	@OneToMany(cascade = CascadeType.PERSIST ,fetch = FetchType.EAGER)
	@JoinTable( name = "deptDetails", joinColumns = 
            { @JoinColumn(name = "deptId") }, inverseJoinColumns = {
			@JoinColumn(name = "empId") })
	private List<Employee> emps = new ArrayList<>();

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String deptName, String location) {
		super();
		this.deptName = deptName;
		this.location = location;
	}
	
	

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
