package com.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.connection.jdbcConnection;
import com.entity.product;
import com.model.pro_module;


/**
 * Servlet implementation class add_product_servlet
 */
@WebServlet("/add_product_servlet")
@MultipartConfig
public class add_product_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_product_servlet() {
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
		
		String pname=request.getParameter("pname");
		System.out.println(pname);
		
		String pdescription=request.getParameter("pdescription");
		System.out.println(pdescription);
		
		String pprice=request.getParameter("pprice");
		System.out.println(pprice);
		
		String pquantity=request.getParameter("pquantity");
		System.out.println(pquantity);
		
		String category=request.getParameter("category");
		System.out.println(category);
		
		
		InputStream inputStream=null;
		Part filepart=request.getPart("image");
		if(filepart!=null) {
			inputStream=filepart.getInputStream();
		}
		
		product pd=new product();
		pd.setP_name(pname);
		pd.setP_description(pdescription);
		pd.setP_price(pprice);
		pd.setP_quantity(pquantity);
		pd.setP_category(category);
		
		byte[] imageByte=new byte[inputStream.available()];
		inputStream.read(imageByte);
		pd.setP_picture(imageByte);
		
		try {
			pro_module pm=new pro_module(jdbcConnection.getConnection());
			boolean b=pm.insert(pd);
			if(b) {
				response.sendRedirect("add_product.jsp");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	     
	}

}