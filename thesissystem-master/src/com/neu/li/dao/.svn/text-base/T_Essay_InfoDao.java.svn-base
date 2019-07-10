package com.neu.li.dao;

import com.neu.dao.BaseDao;

public class T_Essay_InfoDao extends BaseDao {
	
	public int insert (String name1,String name2,String no,String route,String date){
		int row=0;
			String sql="insert into t_essay_info(essay_name,e_stu_name,e_stu_no,essay_route,essay_date)"
					+ " values(?,?,?,?,?)";
			row=super.executeUpdate(sql,name1,name2,no,route,date);
		return row;
	}
	public int UpdateCheck(String sname)
	{
		int row=0;
		  String sql="update t_essay_info set essay_checked='1' where e_stu_name=?";
		  row=super.executeUpdate(sql, sname);
		return row;
	}
	public int insertessay(String no,String name,String essayname,String content)
	{
		int str = 0;
		String sql = "insert into t_essay_info(e_stu_no,e_stu_name,essay_name,essay_date,essay_content) values(?,?,?, CURRENT_TIMESTAMP(),?)";
		str = super.executeUpdate(sql, no,name,essayname,content);
		return str;
	}
}
