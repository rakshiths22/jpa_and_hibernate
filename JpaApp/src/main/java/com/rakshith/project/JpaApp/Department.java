package com.rakshith.project.JpaApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENTS",schema="HR")
@NamedQuery(name = "Department.findAll", query = "SELECT d FROM Department d")
public class Department {

	@Id
	@GeneratedValue
	@Column(name="DEPARTMENT_ID")
	private Integer deptId;
	
	@Column(name="DEPARTMENT_NAME")
	private String deptName;
	@Column(name="MANAGER_ID")
	private Integer managerId;
	@Column(name="LOCATION_ID")
	private Integer locationId;
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	
	
	
}
