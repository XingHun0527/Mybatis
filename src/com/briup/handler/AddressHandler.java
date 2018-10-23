package com.briup.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.briup.bean.Address;
/**
 * Address类型的处理器
 * */
public class AddressHandler 
	extends BaseTypeHandler<Address>{

	@Override
	public Address getNullableResult(ResultSet rs, String columnName) throws SQLException {
		//
		String info=rs.getString(columnName);
		Address address=null;
		if(info!=null) {
			String[] arr=info.split("\\-");
			address=new Address();
			address.setProvince(arr[0]);
			address.setCity(arr[1]);
			address.setStreet(arr[2]);
		}
		return address;
	}

	@Override
	public Address getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		String info=rs.getString(columnIndex);
		Address address=null;
		if(info!=null) {
			String[] arr=info.split("\\-");
			address=new Address();
			address.setProvince(arr[0]);
			address.setCity(arr[1]);
			address.setStreet(arr[2]);
		}
		return address;
	}

	@Override
	public Address getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		String info=cs.getString(columnIndex);
		Address address=null;
		if(info!=null) {
			String[] arr=info.split("\\-");
			address=new Address();
			address.setProvince(arr[0]);
			address.setCity(arr[1]);
			address.setStreet(arr[2]);
		}
		return address;
	}
	/**
	 *  ? ? ?
	 *  执行SQL语句之前必须给？赋值
	 *  
	 *  ps.setInteger(？,值)
	 *  
	 *  Address address  varchar2
	 *  	address类型的对象转化成String字符串
	 *  
	 *  
	 * */

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Address address, JdbcType arg3) throws SQLException {
		System.out.println("address set...");
		String info=address.getProvince()+"-"+address.getCity()+"-"+address.getStreet();
		ps.setString(i, info);
	}

}
