package com.neu.liu.dao;

import java.util.List;
import java.util.Map;

import com.neu.dao.BaseDao;

public class Teacher_InfoDao extends BaseDao{

	public int insert(String no,String name,String pwd)
	{
		int str = 0;
		String sql = "insert into t_tea_info(tea_no,tea_name,tea_pwd) values(?,?,?)";
		str = super.executeUpdate(sql,no,name,pwd);
		return str;
	}
	public int update(String no,String name,String pwd)
	{
		int str = 0;
		String sql = "UPDATE t_tea_info SET tea_no=?,tea_name=?,tea_pwd = ? WHERE tea_no = ?";
		str = super.executeUpdate(sql, no,name,pwd,no);
		return str;
	}
	public int delete(String no)
	{
		int str = 0;
		String sql = "delete from t_tea_info where tea_no = ?";
		str = super.executeUpdate(sql, no);
		return str;
	}
	public List<Map<String, String>> select()
	{
		List<Map<String, String>> list = null;
		String sql = "select * from t_tea_info";
		list = super.executeQuery(sql);
		return list;
	}
	public List<Map<String, String>> checkLogin(String no,String pwd)
	{
		List<Map<String, String>> list = null;
		String sql = "select * from t_tea_info where tea_no=? and tea_pwd = ? ";
		list = super.executeQuery(sql,no,pwd);
		return list;
	}
	public List<Map<String, String>> findall()
	{
		List<Map<String, String>> list = null;
		String sql="select *from t_tea_info";
		list = super.executeQuery(sql);
		return list;
	}
	public List<Map<String, String>> findteano(String name)
	{
		List<Map<String, String>> list = null;
		String sql="select tea_no from t_tea_info where tea_name=?";
		list = super.executeQuery(sql,name);
		return list;
	}
	
}
