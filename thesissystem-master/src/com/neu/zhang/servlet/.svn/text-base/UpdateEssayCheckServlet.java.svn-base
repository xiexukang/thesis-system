package com.neu.zhang.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.liu.dao.Essay_InfoDao;
import com.neu.liu.dao.StudentInfoDao;

/**
 * Servlet implementation class UpdateEssayCheckServlet
 */
@WebServlet("/UpdateEssayCheckServlet")
public class UpdateEssayCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEssayCheckServlet() {
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
		request.setCharacterEncoding("UTF-8");
		String check=request.getParameter("checked");
		String sno=request.getParameter("e_stu_no");
		StudentInfoDao dao = new StudentInfoDao();
		Essay_InfoDao del = new Essay_InfoDao();
		int row=0,fuck=0;
		row = dao.updateCheck(check, sno);
		if(check.equals("-1"))
		{
			fuck=del.deleteFuck(sno);
		}else{
			fuck=1;
		}
		if(row>0&&fuck>0)
		{
			response.sendRedirect("success.jsp");
		}else{
			response.sendRedirect("fail.jsp");
		}
		
		
	}

}
