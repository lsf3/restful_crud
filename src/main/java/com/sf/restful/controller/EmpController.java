package com.sf.restful.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sf.restful.bean.Employee;
import com.sf.restful.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService empService;

	// restful增加员工
	@PostMapping(value = "/emp")
	//@Valid Employee employee,Model model, BindingResult result  这样写一定报错!!!!!!!!!!!!!!!!!!!!!????????????
	public String insertEmp(@Valid Employee employee, BindingResult result,Model model) {
		if (result.hasErrors()) {

			return "editEmp";

		}
		Integer line = empService.insertEmp(employee);
		model.addAttribute(line);
		// TODO Auto-generated method stub
		return "success";
	}

	// restful删除员工
	@DeleteMapping(value = "/emp")
	public String deleteEmp(Integer id, Model model) {
		Integer line = empService.deleteEmpById(id);
		model.addAttribute(line);
		// TODO Auto-generated method stub
		return "success";
	}

	// restful修改员工
	@PutMapping(value = "/emp")
	public String updatEmp(Employee employee, Model model) {
		System.out.println(employee);

		Integer line = empService.updatEmp(employee);
		model.addAttribute(line);
		// TODO Auto-generated method stub
		return "success";
	}

	// restful查询员工
	@GetMapping(value = "/emp/{id}")
	public String selectEmpById(@PathVariable Integer id, Model model) {
		Employee employee = empService.selectEmpById(id);
		List<Employee> list = new ArrayList<Employee>();
		list.add(employee);
		model.addAttribute("emps", list);
		return "empsList";
	}

	// 也支持非restful...............................................................

	// 查询员工
	@GetMapping(value = "/emp")
	public String selectEmpById3(@RequestParam("wwid") Integer id, Model model) {
		Employee employee = empService.selectEmpById(id);
		List<Employee> list = new ArrayList<Employee>();
		list.add(employee);
		model.addAttribute("emps", list);
		return "empsList";
	}

	// 删除员工
	@DeleteMapping(value = "/emp/{id}")
	public String deleteEmpById(@PathVariable Integer id, Model model) {
		Integer line = empService.deleteEmpById(id);
		model.addAttribute(line);
		// TODO Auto-generated method stub
		return "success";
	}

	// 去员工添加页面
	@GetMapping(value = "/editEmp")
	public String toEditEmp(Model model) {
		

		return "editEmp";
	}

	// 查询所有员工
	@GetMapping(value = "/emps")
	public String selectAllEmps(Model model) {
		List<Employee> list = empService.selectAllEmps();
		model.addAttribute("emps", list);
		Integer line = list.size();
		model.addAttribute(line);
		return "empsList";
	}

	// 查询并去编辑修改员工页面
	@GetMapping(value = "/emp/toEditPage/{id}")
	public String selectEmpById2(@PathVariable Integer id, Model model) {
		Employee employee = empService.selectEmpById(id);
		System.out.println(employee.getId());

		String s1 = "1003";
		model.addAttribute("s1", s1);

		model.addAttribute(employee);
		return "editEmp";
	}

}
