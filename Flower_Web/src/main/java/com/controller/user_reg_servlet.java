package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.jdbcConnection;
import com.entity.user_reg;
import com.model.pro_module;

/**
 * Servlet implementation class user_reg_servlet
 */
@WebServlet("/user_reg_servlet")
public class user_reg_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public user_reg_servlet() {
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
		
		String name=request.getParameter("name");
		System.out.println(name);
		
		String email=request.getParameter("email");
		System.out.println(email);
		
		String password=request.getParameter("password");
		System.out.println(password);
		
		String address=request.getParameter("address");
		System.out.println(address);

		String ph_no=request.getParameter("ph_no");
		System.out.println(ph_no);
		 
		user_reg u= new user_reg();
        u.setName(name);
        u.setEmail(email);
        u.setPassword(password);
        u.setAddress(address);
        u.setPh_no(ph_no);
		try {
			
		pro_module pm=new pro_module(jdbcConnection.getConnection());
	    boolean b=pm.insert(u);
	    if(b) {
	    	System.out.println("Inserted Sucessfully...");
	    	response.sendRedirect("user_reg.jsp");
	    }
	   
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
