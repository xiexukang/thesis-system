package com.neu.zhang.dao;
import java.util.List;
import java.util.Map;
import com.neu.dao.BaseDao;

public class view_essay_info extends BaseDao{
	public  List<Map<String,String>> view_all_stu (String tname)
	{
		List<Map<String,String>> list=null;
		String sql="select * "
				+ " from view_essay_info where sc_tea_name=?";
		list=super.executeQuery(sql ,tname);
		return list;
	}
}
