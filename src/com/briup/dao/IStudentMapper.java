package com.briup.dao;

import com.briup.bean.Student;

public interface IStudentMapper {

	public void saveStudent(Student student);
	
	public void insertStudent();
	
	public void insertStudent2(Student student);
	
	public Student selectStudentById(Student student);
	
	public Student selectStudent2(Student student);
	
}
