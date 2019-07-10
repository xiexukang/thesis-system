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
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
		String account = request.getParameter("account");
		String pwd = request.getParameter("pwd");
		String type = request.getParameter("user_leixing");
		
		if(type.equals("管理员"))
		{
			Admin_InfoDao dao_admin = new Admin_InfoDao();
			List<Map<String, String>> list_admin = dao_admin.checkLogin(account, pwd);
					if(list_admin!=null&&list_admin.size()>0)
					{
						//获取存放数据的区域
						HttpSession session = request.getSession();
						//把从数据库查到的数据存放到session
						//但是我们知道，按照账号和密码查询最多能查到一条数据
						session.setAttribute("login_admin",list_admin.get(0));
						response.sendRedirect("/Essay_Student/Essay/admin/main.html");
					}
		            else{
		            	response.sendRedirect("fail.jsp");
		            }
		}
		else if(type.equals("教师"))
		{
			Teacher_InfoDao dao_tea = new Teacher_InfoDao();
			List<Map<String, String>> list_tea = dao_tea.checkLogin(account, pwd);
			if(list_tea!=null&&list_tea.size()>0)
			{
				//获取存放数据的区域
				HttpSession session = request.getSession();
				//把从数据库查到的数据存放到session
				//但是我们知道，按照账号和密码查询最多能查到一条数据
				session.setAttribute("login_tea",list_tea.get(0));
				response.sendRedirect("/Essay_Student/Essay/teacher/main.html");
			}
            else{
            	response.sendRedirect("fail.jsp");
            }
		}
		else if(type.equals("学生"))
		{
			StudentInfoDao dao_stu = new StudentInfoDao();
			List<Map<String, String>> list_stu = dao_stu.checkLogin(account, pwd);
			if(list_stu!=null&&list_stu.size()>0)
			{
				//获取存放数据的区域
				HttpSession session = request.getSession();
				//把从数据库查到的数据存放到session
				//但是我们知道，按照账号和密码查询最多能查到一条数据
				session.setAttribute("login_stu",list_stu.get(0));
				response.sendRedirect("/Essay_Student/Essay/student/main.html");
			}
            else{
            	response.sendRedirect("fail.jsp");
            }
		}

}

}
