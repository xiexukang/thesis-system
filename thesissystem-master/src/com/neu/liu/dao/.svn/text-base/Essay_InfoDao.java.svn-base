package com.neu.liu.dao;

import java.util.List;
import java.util.Map;

import javax.el.ListELResolver;

import com.neu.dao.BaseDao;
import com.neu.zhang.dao.Select_course_info;

public class Essay_InfoDao extends BaseDao {
		
	public int insert(String name,String title,String content)
	{
		int str = 0;
		String sql = "insert into t_essay_name_info(en_tea_name,en_essay_name,en_essay_content) values(?,?,?)";
		str = super.executeUpdate(sql,name,title,content);
		return str;
	}
	public int update(String name,String title,String content)
	{
		int str = 0;
		String sql = "UPDATE t_essay_name_info SET en_essay_content = ? WHERE en_essay_name = ? and en_tea_name=?";
		str = super.executeUpdate(sql, content,title,name);
		return str;
	}
	public int delete(String title)
	{
		int str = 0;
		List<Map<String,String>> list=null;
		Select_course_info dao=new Select_course_info();
		list=dao.findE_flag(title);
		String sql = "delete from t_essay_name_info where en_essay_name = ?";
		
		if(list.size()>0&&list!=null)
		{
			return 0;
		}else{
			str=super.executeUpdate(sql, title);
			return str;
		}
	}
	public List<Map<String, String>> select(String name)
	{
		List<Map<String, String>> list = null;
		String sql = "select * from t_essay_name_info where en_tea_name=?";
		list = super.executeQuery(sql,name);
		return list;
	}
	
	public int deleteFuck(String sno)
	{
		int str = 0;
		String sql = "delete from t_essay_info where e_stu_no = ?";
		str=super.executeUpdate(sql, sno);
		return str;
		
	}
	
	
}
