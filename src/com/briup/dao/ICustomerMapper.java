package com.briup.dao;

import com.briup.bean.Customer;

public interface ICustomerMapper {
	public void saveCustomer(Customer customer);
	public void saveCustomerWithAutoId(Customer customer);
	public void saveCustomerWithAutoIdByOracle1(Customer customer);
	public void saveCustomerWithAutoIdByOracle2(Customer customer);
	
	//更新
	public void updateCustomer(Customer customer); 
	
	//删除
	public void deleteCustomerById(int id);
	
	//@Select("select id,username,password,dob,address  from customer1808 where id = #{id}")
	public Customer selectCustomerById(int id);
	
}
