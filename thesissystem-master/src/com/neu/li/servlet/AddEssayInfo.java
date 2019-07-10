package com.neu.li.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.li.dao.T_Essay_InfoDao;

/**
 * Servlet implementation class AddEssayInfo
 */
@WebServlet("/AddEssayInfo")
public class AddEssayInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEssayInfo() {
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
		String name1=request.getParameter("essay_name");
		String name2=request.getParameter("e_stu_name");
		String no=request.getParameter("e_stu_no");
		String route=request.getParameter("essay_route");
		String date=request.getParameter("essay_date");
		T_Essay_InfoDao F=new T_Essay_InfoDao();
		int row=F.insert(name1, name2, no, route, date);
		if(row>0)
		{
			response.sendRedirect("success.jsp");
		}else{
			response.sendRedirect("fail.jsp");
		}
		
	}

}
