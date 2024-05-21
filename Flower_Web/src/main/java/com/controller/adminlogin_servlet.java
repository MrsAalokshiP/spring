package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class adminlogin_servlet
 */
@WebServlet("/adminlogin_servlet")
public class adminlogin_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminlogin_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String username=request.getParameter("username");
		System.out.println(username);
		
		String password=request.getParameter("password");
		System.out.println(password);
		
		String username1="admin@gmail.com";
		String password1="123";
		
		if(username.equals(username1)&& password.equals(password1))
		{
			HttpSession session=request.getSession();
			session.setAttribute("username",username);
			response.sendRedirect("Dashboard.jsp");
		}
		else {
			request.setAttribute("message","Invalid userId or password");
			RequestDispatcher rd=request.getRequestDispatcher("Adminlogin.jsp");
			rd.forward(request, response);
	}
	}

}