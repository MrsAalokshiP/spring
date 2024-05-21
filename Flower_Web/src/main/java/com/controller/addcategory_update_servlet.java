package com.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.jdbcConnection;
import com.entity.category;
import com.model.pro_module;

/**
 * Servlet implementation class addcategory_update_servlet
 */
@WebServlet("/addcategory_update_servlet")
public class addcategory_update_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addcategory_update_servlet() {
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
		
		Integer cat_id=Integer.parseInt(request.getParameter("cat_id"));
		System.out.println(cat_id);
		
		String cat_name=request.getParameter("cat_name");
		System.out.println(cat_name);
		
		
		
		category c=new category();
		c.setCat_id(cat_id);
		c.setCat_name(cat_name);
		
		
		try {
			pro_module p=new pro_module(jdbcConnection.getConnection());
			boolean b=p.update(c);
			if(b) {
				System.out.println("updated Successfuly!!!");
				response.sendRedirect("category_table.jsp");
			}
			else {
				System.out.println("Error");
			}
			
		} catch (Exception e) {
			e.printStackTrace();		
			}
		
	}

}