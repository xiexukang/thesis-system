package com.neu.liu.util;

import org.apache.catalina.filters.SetCharacterEncodingFilter;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class EmailUtil {
	public static boolean sendemail(String id,String to)
	{
		boolean bool = false;
		HtmlEmail email = new HtmlEmail();
		//设置编码格式
		email.setCharset("UTF-8");
		//设置发件人的邮箱服务器
		email.setHostName("smtp.163.com");
		//登录邮箱才可以发送
		email.setAuthentication("1062852837", "liushuo19970725");
		try {
			email.setFrom("1062852837@163.com","刘烁");
			email.addTo(to);
			//设置标题
			email.setSubject("密码找回");
			email.setHtmlMsg("<a href='http://localhost:8080/thesis-system/Essay/admin/setpwd.jsp?id="+id+"'>重新设置密码</a>");
			email.send();
			bool = true;
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}
}
