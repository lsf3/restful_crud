package com.sf.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sf.restful.bean.Employee;

@Controller
public class CommController {
	
	//返回首页
	@GetMapping(value="hello")
	public String toHello() {
		
		return "hello";
	}
	
	//错误页面测试  不存在的页面
	@GetMapping(value="hello123")
	public String toHello123() {
		String s1=null;
		s1.concat("123");
		
		return "hello123";
	}
	
	
	//错误页面测试  不存在的页面
	@GetMapping(value="math")
	public String toHe() {
		System.out.println(9/0);
		return "hello123";
	}
	
	
	
	//这东西必须写在同一个Controller类中,否则无效!!!!!!!当然也能加@ControllerAdvice
//	@ExceptionHandler(value={java.lang.ArithmeticException.class})
//	public ModelAndView arithmeticExceptionHandler(Exception e){
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("error", e.toString());
//		mv.setViewName("error1");
//		return mv;
//	}
	
	

}
