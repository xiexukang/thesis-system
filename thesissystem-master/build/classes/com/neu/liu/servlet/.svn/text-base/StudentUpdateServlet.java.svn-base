package com.neu.liu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.liu.dao.StudentInfoDao;

/**
 * Servlet implementation class StudentUpdateServlet
 */
@WebServlet("/StudentUpdateServlet")
public class StudentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentUpdateServlet() {
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
		String no = request.getParameter("stu_no");
		String name = request.getParameter("stu_name");
		String pwd = request.getParameter("stu_pwd");
		String time = request.getParameter("stu_time");
		String check = request.getParameter("stu_check");
		
		StudentInfoDao dao = new StudentInfoDao();
		 int row = 0;
		 row =dao.update(no, name, pwd, time, check);
		 
		 if(row>0)
		 {
			 response.sendRedirect("success.jsp");
			 
		 }
		 else{
			 response.sendRedirect("fail.jsp");
		 }
		
	}

}
