package com.neu.liu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.liu.dao.Admin_InfoDao;

/**
 * Servlet implementation class SetPwdServlet
 */
@WebServlet("/SetPwdServlet")
public class SetPwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetPwdServlet() {
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
		
		String id = request.getParameter("mgr_id");
		String pwd = request.getParameter("user_pwd");
		
		Admin_InfoDao dao = new Admin_InfoDao();
		
		int row = dao.updatepwd(id, pwd);
		
		if(row>0)
		{
			response.sendRedirect("/Essay_Student/Essay/admin/login_1.html");
		}
		else{
			response.sendRedirect("fail.jsp");
		}
	}

}
