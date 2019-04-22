package com.sf.restful.bean;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class Department implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7252042969358995546L;
	private Integer id; 
	private String departmentName ;
	
	private List<Employee> emps ;
	
	
	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
		result = prime * result + ((emps == null) ? 0 : emps.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (departmentName == null) {
			if (other.departmentName != null)
				return false;
		} else if (!departmentName.equals(other.departmentName))
			return false;
		if (emps == null) {
			if (other.emps != null)
				return false;
		} else if (!emps.equals(other.emps))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Integer id, String departmentName, List<Employee> emps) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.emps = emps;
	}
	
	
}
