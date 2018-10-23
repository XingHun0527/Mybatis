package com.briup.utils;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 用来获取SqlSession对象 
 * */
public class MybatisSqlSessionFactory {
	private static SqlSessionFactory factory;
	static {//静态代码块
		
		//////////////////////////////
		try {
			SqlSessionFactoryBuilder builder=
					new SqlSessionFactoryBuilder();
			factory=
					builder.build(Resources.getResourceAsStream("mybatis-config.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		///////////////////////////////
	}
	
	public static SqlSession getSqlSession() {
		//不进行自动提交事务
		return getSqlSession(false);
	}
	public static SqlSession getSqlSession(boolean autoCommit) {
		SqlSession sqlSession=null;
		if(factory!=null) {
			sqlSession = factory.openSession(autoCommit);
		}
		return sqlSession;
	}
	
}
