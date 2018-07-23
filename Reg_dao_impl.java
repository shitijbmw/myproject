package com.reg.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.reg.domain.Reg_domain;


@Component
public class Reg_dao_impl implements Reg_dao {
	
	@Autowired
	private HibernateTemplate template;
	
	public Reg_dao_impl() {
		// TODO Auto-generated constructor stub
	}

	public boolean addData(Reg_domain reg_domain) {
		
		
		template.save(reg_domain);
		return true;
	}








	
	
}
