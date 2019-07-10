package com.neu.li.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.neu.liu.dao.Select_Course_InfoDao;
import com.neu.liu.dao.StudentInfoDao;

/**
 * Servlet implementation class MyEssayServlet
 */
@WebServlet("/MyEssayServlet")
public class MyEssayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyEssayServlet() {
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
		HttpSession session = request.getSession();
		Map<String, String> map = (Map<String, String>) session.getAttribute("login_stu");
		String no = map.get("stu_no");
		
		Select_Course_InfoDao dao =new Select_Course_InfoDao();
		List<Map<String, String>> list = dao.select(no);
		
		StudentInfoDao dao1 = new StudentInfoDao();
		List<Map<String, String>> list1 = dao1.selectno(no);
		session.setAttribute("Mystudent", list1.get(0));
		session.setAttribute("MyEssay", list);
		
		response.sendRedirect("/Essay_Student/Essay/student/Myessay.jsp");
	}

}
