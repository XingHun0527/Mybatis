package com.briup.bean;

import org.apache.ibatis.type.Alias;

@Alias("wife")
public class Wife {
	private Integer id;
	private String name;
	
	public Wife() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Wife(String name) {
		super();
		this.name = name;
	}



	public Wife(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Wife [id=" + id + ", name=" + name + "]";
	}
	
	

}
