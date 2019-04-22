package com.sf.restful.service;

import java.util.List;

import com.sf.restful.bean.Employee;

public interface EmpService {
	
	List<Employee> selectAllEmps();
	
	Employee selectEmpById(Integer id);
	
	Integer updatEmp(Employee employee);
	
	Integer insertEmp(Employee employee);
	
	Integer deleteEmpById(Integer id);
	
	
}
