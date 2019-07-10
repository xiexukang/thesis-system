package com.neu.zhang.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neu.zhang.dao.Select_course_info;


/**
 * Servlet implementation class TeaToStuRequest
 */
@WebServlet("/TeaToStuRequest")
public class TeaToStuRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeaToStuRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Select_course_info dao = new Select_course_info();
		HttpSession session=request.getSession();
		Map<String, String> tea=(Map<String, String>) session.getAttribute("login_tea");
		String tea_name=tea.get("tea_name");
		List<Map<String,String>> list = dao.stu_findAll(tea_name);
		session.setAttribute("stu_request", list);
		response.sendRedirect("/thesis-system/Essay/teacher/stu_request.jsp");
	}

}
