package com.reg.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.reg.model.Reg_model;
import com.reg.service.Reg_service;

@Controller
public class Reg_controller {
	@Autowired
	private Reg_service reg_service;
	
	
	
	public Reg_controller() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public ModelAndView first1(Reg_model reg_model){
		System.out.println("inside login");
		return new ModelAndView("homepage","msg","Welcome to home page............");
		
	}
	
	
	
	@RequestMapping(value="/reg",method = RequestMethod.POST)
	public ModelAndView third1(@ModelAttribute("reg_model") Reg_model reg_model){
		System.out.println("inside /reg");
		String i=reg_model.getUsername();
		String j=reg_model.getPassword();
	
		System.out.println(i);
		System.out.println(j);
		
		if(i.equals("shubham") && j.equals("gadekar")){
			return new ModelAndView("success","msg","success.......");
		}else{
			return new ModelAndView("failure","msg","failure.......");
		}
		
	}
	

	@RequestMapping(value="/save", method=RequestMethod.GET)
	public ModelAndView forth(Reg_model reg_model){
		return new ModelAndView("regpage","msg","please fill all the details..........");
	}
	
	@RequestMapping(value="/dude",method=RequestMethod.POST)
	public ModelAndView first(@ModelAttribute("reg_model") Reg_model reg_model){
		
				
		
		
		boolean bb=false;
		bb=reg_service.register(reg_model);
		
		String msg="Successfully Registered........";
		String msg1="something went wrong";
		if(bb){
			return new ModelAndView("sucreg","msg",msg);
	}else{
		return new ModelAndView("failure","msg",msg1);
	}
		}
	
	
	@RequestMapping(value="/vvip", method=RequestMethod.POST)
	public ModelAndView sixth(Reg_model reg_model){
		String msg="welcome to angular login";
		return new ModelAndView("vviplogin","msg",msg);
		
	}
}
