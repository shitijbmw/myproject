package com.reg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.dao.Reg_dao;
import com.reg.domain.Reg_domain;
import com.reg.model.Reg_model;
@Service
public class Reg_service_impl implements Reg_service {
	
	@Autowired
	private Reg_dao reg_dao;
	
	public Reg_service_impl() {
		// TODO Auto-generated constructor stub
	}

	public Reg_domain getdo(Reg_model reg_model)
	{
		Reg_domain rd = new Reg_domain();
		
		rd.setFullname(reg_model.getFullname());
		rd.setPhone(reg_model.getPhone());
		rd.setAddress(reg_model.getAddress());
		rd.setEmail(reg_model.getEmail());
		rd.setPassword(reg_model.getPassword());
		rd.setQualification(reg_model.getPassword());
		rd.setUsername(reg_model.getUsername());
		
		return rd;
	}
	
	
	
	@Override
	public boolean register(Reg_model reg_model) {
		
	Reg_domain reg_domain= getdo(reg_model);	
		
	    
		return reg_dao.addData(reg_domain);
	}

	
}
