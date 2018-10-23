package com.briup.utils;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * ������ȡSqlSession���� 
 * */
public class MybatisSqlSessionFactory {
	private static SqlSessionFactory factory;
	static {//��̬�����
		
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
		//�������Զ��ύ����
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
