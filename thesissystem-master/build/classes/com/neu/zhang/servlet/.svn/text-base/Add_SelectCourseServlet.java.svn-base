package com.neu.zhang.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.zhang.dao.Select_course_info;

/**
 * Servlet implementation class Add_SelectCourseServlet
 */
@WebServlet("/Add_SelectCourseServlet")
public class Add_SelectCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add_SelectCourseServlet() {
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
		request.setCharacterEncoding("UTF-8");
		String sname=request.getParameter("sc_stu_name");
		String sno=request.getParameter("sc_stu_no");
		String tname=request.getParameter("sc_tea_name");
		String tno=request.getParameter("sc_tea_no");
		String ename=request.getParameter("sc_essay_name");
		
		Select_course_info dao=new Select_course_info();
		int row=0;
		row=dao.save(sname,sno,tname,tno,ename);
		if(row>0)
		{
			response.sendRedirect("success.jsp");
		}else
		{
			response.sendRedirect("fail.jsp");
		}
		
		
	}

}
