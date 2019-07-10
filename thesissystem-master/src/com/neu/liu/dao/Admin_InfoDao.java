package com.neu.liu.dao;

import java.util.List;
import java.util.Map;

import com.neu.dao.BaseDao;

public class Admin_InfoDao extends BaseDao{

	public List<Map<String, String>> checkLogin(String no,String pwd)
	{
		List<Map<String, String>> list = null;
		String sql = "select * from t_man_info where man_no=? and man_pwd = ? ";
		list = super.executeQuery(sql,no,pwd);
		return list;
	}
	public List<Map<String, String>> checkemail(String no,String email)
	{
		List<Map<String, String>> list = null;
		String sql = "select * from t_man_info where man_name=? and man_email = ? ";
		list = super.executeQuery(sql,no,email);
		return list;
	}
	public int updatepwd(String id,String pwd)
	{
		int row = 0;
		String sql="update t_man_info set man_pwd=? where man_no=?";
		row = super.executeUpdate(sql, pwd,id);
		return row;
	}
	
}
