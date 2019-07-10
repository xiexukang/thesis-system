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

import com.neu.liu.dao.StudentInfoDao;
import com.neu.liu.dao.Teacher_InfoDao;

/**
 * Servlet implementation class StuSelectServlet
 */
@WebServlet("/StuSelectServlet")
public class StuSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StuSelectServlet() {
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
		StudentInfoDao dao = new StudentInfoDao();
		List<Map<String, String>> list = dao.findall();
		HttpSession session = request.getSession();
		session.setAttribute("stus", list);
		response.sendRedirect("/Essay_Student/Essay/admin/stus.jsp");
		
	}

}
