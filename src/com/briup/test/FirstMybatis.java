package com.briup.test;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.briup.bean.Student;
import com.briup.dao.IStudentMapper;


public class FirstMybatis {
	public static void main(String[] args) throws IOException {

		SqlSession session=null;
		SqlSessionFactoryBuilder builder=
				new SqlSessionFactoryBuilder();

//		Reader reader=new FileReader("src/mybatis-config.xml");
		InputStream reader=Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory=builder.build(reader);
		session=factory.openSession();
		
		IStudentMapper mapper=
				session.getMapper(IStudentMapper.class);
		Student student=new Student(1,"³¤°²",1,"700");
		mapper.saveStudent(student);
		session.commit();
		session.close();
		
	}
}
