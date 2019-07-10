package com.neu.zhang.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.zhang.dao.Select_course_info;

/**
 * Servlet implementation class Del_SelectCourseServlet
 */
@WebServlet("/Del_SelectCourseServlet")
public class Del_SelectCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Del_SelectCourseServlet() {
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
		String sname=request.getParameter("del_name");
		System.out.println(sname);
		Select_course_info dao=new Select_course_info();
		int row=0;
		row=dao.dele(sname);
		if(row>0)
		{
			response.sendRedirect("success.jsp");
		}else
		{
			response.sendRedirect("fail.jsp");
		}
		
		
	}

}
