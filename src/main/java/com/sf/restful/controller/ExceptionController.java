package com.sf.restful.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
@Configuration
public class ExceptionController implements HandlerExceptionResolver {
	/*
	 * 
	 * @ExceptionHandler(value={java.lang.ArithmeticException.class}) public
	 * ModelAndView arithmeticExceptionHandler(Exception e){ ModelAndView mv =
	 * new ModelAndView(); mv.addObject("error", e.toString());
	 * mv.setViewName("error1"); return mv; }
	 * 
	 * 
	 * @ExceptionHandler(value={java.lang.NullPointerException.class}) public
	 * ModelAndView nullPointerException(Exception e){ ModelAndView mv = new
	 * ModelAndView(); mv.addObject("error", e.toString());
	 * mv.setViewName("error2"); return mv; }
	 * 
	 * 
	 * ModelAndView mv=new ModelAndView(); if (exception instanceof
	 * ArithmeticException) { mv.setViewName("error1");
	 * 
	 * } if (exception instanceof NullPointerException) {
	 * mv.setViewName("error2");
	 * 
	 * } mv.addObject("error", exception.toString());
	 * 
	 * return mv;
	 * 
	 * HttpServletRequest request,HttpServletResponse response, Object
	 * hander,Exception exception
	 * 
	 */

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception e) {
		ModelAndView mv = new ModelAndView();
		if (e instanceof ArithmeticException) {
			mv.setViewName("error1");

		}
		if (e instanceof NullPointerException) {
			mv.setViewName("error2");

		}
		mv.addObject("error", e.toString());

		return mv;
	}

}
