package com.neu.liu.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neu.liu.dao.Admin_InfoDao;
import com.neu.liu.dao.StudentInfoDao;
import com.neu.liu.dao.Teacher_InfoDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/registServlet")
public class registServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String number= request.getParameter("num");
		String account = request.getParameter("account1");
		String pwd = request.getParameter("pwd1");
		String type = request.getParameter("user_leixing");
		
		 if(type.equals("教师"))
		{
			Teacher_InfoDao dao_tea = new Teacher_InfoDao();
			int a = dao_tea.insert(number, account, pwd);
			System.out.println(a);
			if(a!=0)
			{
				
				response.sendRedirect("success.jsp");
			}
            else{
            	response.sendRedirect("fail.jsp");
            }
		}
		else if(type.equals("学生"))
		{
			StudentInfoDao dao_stu = new StudentInfoDao();
			int a = dao_stu.insert1(number,account, pwd);
			if(	a>0)
			{
				//获取存放数据的区域
				HttpSession session = request.getSession();
				//把从数据库查到的数据存放到session
				//但是我们知道，按照账号和密码查询最多能查到一条数据
				response.sendRedirect("success.jsp");
			}
            else{
            	response.sendRedirect("fail.jsp");
            }
		}

}

}
