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
import com.neu.liu.dao.Teacher_InfoDao;

/**
 * Servlet implementation class EssaySelectServlet
 */
@WebServlet("/EssaySelectServlet")
public class EssaySelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EssaySelectServlet() {
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
		String name = request.getParameter("tea1");
		String essay = request.getParameter("essay");
		HttpSession session = request.getSession();
		Map<String, String> map = (Map<String, String>) session.getAttribute("login_stu");
		
		String stu_no = map.get("stu_no");
		String stu_name = map.get("stu_name");
		String stu_check=map.get("stu_checked");
		
		Teacher_InfoDao dao = new Teacher_InfoDao();
		List<Map<String, String>> list = dao.findteano(name);
		String tea_no = list.get(0).get("tea_no");
		
		Select_Course_InfoDao dao2 = new Select_Course_InfoDao();
		List<Map<String, String>> list1 = dao2.selectcheck(stu_no);
		System.out.println(list1+" "+list1.size());
		if(list1!=null&&list1.size()>0)
		{
			response.sendRedirect("fail.jsp");
		}
		else{
			Select_Course_InfoDao dao1 = new Select_Course_InfoDao();
			int row = dao1.insert(stu_no, stu_name, tea_no, name, essay, stu_check);
		
		   if(row>0)
		  {
			   response.sendRedirect("success.jsp");
		  }
		   else{
			   response.sendRedirect("fail.jsp");
		   }
		}
		
		
		
	}

}
