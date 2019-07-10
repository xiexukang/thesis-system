package com.neu.liu.dao;

import java.util.List;
import java.util.Map;

import com.neu.dao.BaseDao;

public class StudentInfoDao extends BaseDao {
	public int insert1(String no,String name,String pwd)
	{
		int str = 0;
		String sql = "insert into t_student_info(stu_no,stu_name,stu_pwd) values(?,?,?)";
		str = super.executeUpdate(sql, no,name,pwd);
		return str;
	}
		
	public int insert(String no,String name,String pwd,String check)
	{
		int str = 0;
		String sql = "insert into t_student_info(stu_no,stu_name,stu_pwd,stu_checked) values(?,?,?,?)";
		str = super.executeUpdate(sql, no,name,pwd,check);
		return str;
	}
	public int update(String no,String name,String pwd,String time,String check)
	{
		int str = 0;
		String sql = "UPDATE t_student_info SET stu_no=?,stu_name=?,stu_pwd = ?,stu_time=?,stu_checked=? WHERE stu_no = ?";
		str = super.executeUpdate(sql, no,name,pwd,time,check,no);
		return str;
	}
	
	public int updateCheck(String check,String sno)
	{
		int str = 0;
		String sql = "UPDATE t_student_info SET stu_checked=? where stu_no=?";
		str = super.executeUpdate(sql, check,sno);
		return str;
	}
	
	public int delete(String no)
	{
		int str = 0;
		String sql = "delete from t_student_info where stu_no = ?";
		str = super.executeUpdate(sql, no);
		return str;
	}
	public List<Map<String, String>> select()
	{
		List<Map<String, String>> list = null;
		String sql = "select * from t_student_info";
		list = super.executeQuery(sql);
		return list;
	}
	public List<Map<String, String>> selectno(String no)
	{
		List<Map<String, String>> list = null;
		String sql = "select * from t_student_info where stu_no=?";
		list = super.executeQuery(sql,no);
		return list;
	}
	public List<Map<String, String>> checkLogin(String no,String pwd)
	{
		List<Map<String, String>> list = null;
		String sql = "select * from t_student_info where stu_no=? and stu_pwd = ? ";
		list = super.executeQuery(sql,no,pwd);
		return list;
	}
	
	public List<Map<String, String>> findall()
	{
		List<Map<String, String>> list = null;
		String sql="select *from t_student_info";
		list = super.executeQuery(sql);
		return list;
	}
	public int updatecheck(String no)
	{
		int row = 0;
		String sql = "update t_student_info set stu_checked=1 where stu_no=?";
		row = super.executeUpdate(sql, no);
		return row;
	}
}
