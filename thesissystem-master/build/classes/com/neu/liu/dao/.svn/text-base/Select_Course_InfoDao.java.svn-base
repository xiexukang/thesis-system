package com.neu.liu.dao;

import java.util.List;
import java.util.Map;

import com.neu.dao.BaseDao;

public class Select_Course_InfoDao extends BaseDao {
	
	public int insert(String stu_no,String stu_name,String tea_no,String tea_name,String essay,String check)
	{
		int str = 0;
		String sql = "insert into t_select_course_info(sc_stu_no,sc_stu_name,sc_tea_no,sc_tea_name,sc_essay_name,sc_checked) values(?,?,?,?,?,?)";
		str = super.executeUpdate(sql,stu_no,stu_name,tea_no,tea_name,essay,check);
		return str;
	}
	
	public List<Map<String, String>> select(String no)
	{
		List<Map<String, String>> list = null;
		String sql = "select * from t_select_course_info where sc_stu_no=?";
		list = super.executeQuery(sql,no);
		//sdsda
		return list;
	}
	public List<Map<String, String>> selectcheck(String no)
	{
		List<Map<String, String>> list = null;
		String sql = "select * from t_select_course_info where sc_stu_no=? and (sc_checked=1 or sc_checked=0)";
		list = super.executeQuery(sql,no);
		return list;
	}

}
