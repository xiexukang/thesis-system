package com.neu.zhang.dao;


import com.neu.dao.BaseDao;
import java.util.List;
import java.util.Map;



public class Select_course_info extends BaseDao {
	
	public int save(String sname,String sno,String tname,String tno,String ename){
		int row=0;
		String sql="insert into t_select_course_info(sc_stu_name,sc_stu_no,sc_tea_name,sc_tea_no,sc_essay_name)"
				+ " values(?,?,?,?,?)";
		row=super.executeUpdate(sql,sname,sno,tname,tno,ename);
		return row;
	}
	public int dele(String sname){
		int row=0;
		String sql="delete from t_select_course_info where sc_stu_name=?";
		row=super.executeUpdate(sql, sname);
		return row;
	}
	public int updatechecked(String sname,String check){
		int row=0;
		String sql="update t_select_course_info set sc_checked=? where sc_stu_name=? and sc_checked='0'";
		row=super.executeUpdate(sql,check,sname);
		return row;
	}
	
	public List<Map<String, String>> findE_flag(String ename)
	{
		List<Map<String,String>> list=null;
		String sql="select * from t_select_course_info where sc_essay_name=?";
		list=super.executeQuery(sql,ename);
		return list;
		
	}
	
	public List<Map<String, String>> stu_findAll(String tname)
	{
		List<Map<String,String>> list=null;
		String sql="select sc_stu_no,sc_stu_name,sc_essay_name from t_select_course_info where sc_tea_name=? and sc_checked='0'";
		list=super.executeQuery(sql,tname);
		return list;
		
	}


}