package com.neu.liu.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.mail.Email;

import com.neu.liu.dao.Admin_InfoDao;
import com.neu.liu.util.EmailUtil;

/**
 * Servlet implementation class FindPwdServlet
 */
@WebServlet("/FindPwdServlet")
public class FindPwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindPwdServlet() {
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
		
		String no = request.getParameter("user_no");
		String email = request.getParameter("user_email");
		Admin_InfoDao dao = new Admin_InfoDao();
		List<Map<String, String>> list = dao.checkemail(no, email);
		
		if(list!=null&&list.size()>0)
		{
			String id = list.get(0).get("man_pwd");
			System.out.println(id);
			request.setAttribute("password", id);
			request.getRequestDispatcher("/password.jsp").forward(request, response);
			//boolean flag = EmailUtil.sendemail(id,email);
			/*
			 * if(flag) { response.sendRedirect("/Essay_Student/success.jsp"); } else{
			 * response.sendRedirect("/Essay_Student/fail.jsp"); }
			 */
		}
		else{
			
			response.sendRedirect("/Essay_Student/fail.jsp");
		}
	}

}
