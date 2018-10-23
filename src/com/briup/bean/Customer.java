package com.briup.bean;

import java.util.Date;
/**
 * 地址 省份-城市-街道
 * 顾客
 * 
 * 假设：数据库中存在一个表  customer1808
 * 		create table customer1808(
 * 		id number,
 * 		username varchar2(30),
 * 		password varchar2(30),
 * 		dob date ,
 * 		address varchar2(50)
 * 		);
 * */

public class Customer {
	private Integer id;
	private String username;
	private String password;
	private Date dob;
	private Address address;
	
	public Customer() {
	}
	
	public Customer(Integer id, String username, String password, Date dob, Address address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.dob = dob;
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", password=" + password + ", dob=" + dob
				+ ", address=" + address + "]";
	}
	
	
	
	
}
