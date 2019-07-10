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

import com.neu.liu.dao.Essay_InfoDao;

/**
 * Servlet implementation class TeaToEssay
 */
@WebServlet("/TeaToEssay")
public class TeaToEssay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeaToEssay() {
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
		Essay_InfoDao essay=new Essay_InfoDao();

		HttpSession session = request.getSession();
		Map<String, String> tea=(Map<String, String>) session.getAttribute("login_tea");
		String tea_name=tea.get("tea_name");
		List<Map<String,String>> list = essay.select(tea_name);
	    session.setAttribute("essay", list);
	    response.sendRedirect("/thesis-system/Essay/teacher/essay.jsp");
		
	}

}
