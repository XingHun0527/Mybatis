package com.briup.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.briup.bean.Wife;
import com.briup.dao.IOne2OneMapper;
import com.briup.utils.MybatisSqlSessionFactory;

public class o2oTest {
	SqlSession sqlSession=null;
	IOne2OneMapper mapper=null;
	
	@Test
	public void save() {
		Wife wife=new Wife("wife");
		mapper.saveWife(wife);
	}
	
	@Test
	public void selectWife() {
		Wife wife=mapper.selectWifeById(1);
		System.out.println(wife);
	}
	
	
	@Before
	public void before() {
		try {
			sqlSession=MybatisSqlSessionFactory.getSqlSession();
			mapper=sqlSession.getMapper(IOne2OneMapper.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void commitSession() {
		sqlSession.commit();
		sqlSession.close();
	}
	
}
