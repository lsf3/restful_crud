package com.sf.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sf.restful.bean.Employee;

@Controller
public class CommController {
	
	//返回首页
	@GetMapping(value="hello")
	public String toHello() {
		
		return "hello";
	}
	
	
	
	
	

}
