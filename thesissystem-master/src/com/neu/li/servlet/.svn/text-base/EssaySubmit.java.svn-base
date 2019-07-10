package com.neu.li.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.neu.li.dao.T_Essay_InfoDao;
import com.neu.liu.dao.StudentInfoDao;

/**
 * Servlet implementation class EssaySubmit
 */
@WebServlet("/EssaySubmit")
public class EssaySubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EssaySubmit() {
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
		String area = request.getParameter("area");
		String Essayname = request.getParameter("essayname");
		
		HttpSession session = request.getSession();
		Map<String, String> map = (Map<String, String>) session.getAttribute("login_stu");
		
		String no = map.get("stu_no");
		String name = map.get("stu_name");
		
		T_Essay_InfoDao dao =new T_Essay_InfoDao();
		
		int row = dao.insertessay(no, name, Essayname, area);
		
		StudentInfoDao dao1 = new StudentInfoDao();
		int row1 = dao1.updatecheck(no);
		if(row>0&&row1>0)
		{
			response.sendRedirect("success.jsp");
		}
		else{
			response.sendRedirect("fail.jsp");
		}
	}

}
