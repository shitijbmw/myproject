package com.reg.model;

public class Reg_model {
	
	
	private String username;
	private String password;
	private String fullname;
	private String email;
	private String phone;
	private String address;
	private String qualification;
	
	
	public Reg_model() {
		// TODO Auto-generated constructor stub
	}
	public Reg_model(String fullname,String email,String phone,String address,String qualification,String username,String password) {
		this.fullname=fullname;
		this.email=email;
		this.phone=phone;
		this.address=address;
		this.qualification=qualification;
		this.username=username;
		this.password=password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
	
}
