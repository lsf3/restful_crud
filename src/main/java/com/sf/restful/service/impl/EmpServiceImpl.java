package com.sf.restful.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sf.restful.bean.Employee;
import com.sf.restful.mapper.EmpMapper;
import com.sf.restful.service.EmpService;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmpMapper  empMapper;

	@Override
	public List<Employee> selectAllEmps() {
		// TODO Auto-generated method stub
		return empMapper.selectAllEmps();
	}

	@Override
	public Employee selectEmpById(Integer id) {
		// TODO Auto-generated method stub
		return empMapper.selectEmpById(id);
	}

	@Override
	public Integer updatEmp(Employee employee) {
		// TODO Auto-generated method stub
		return empMapper.updatEmp(employee);
	}

	@Override
	public Integer insertEmp(Employee employee) {
		// TODO Auto-generated method stub
		return empMapper.insertEmp(employee);
	}

	@Override
	public Integer deleteEmpById(Integer id) {
		// TODO Auto-generated method stub
		return empMapper.deleteEmpById(id);
	}
	
	
	
}
