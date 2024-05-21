package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.category;
import com.entity.product;
import com.entity.user_login;
import com.entity.user_reg;
import com.mysql.cj.protocol.Resultset;

public class pro_module {
Connection con;
	public pro_module(Connection con) 
	{
		super();
		this.con=con;
	}
	
	
	public boolean insert(user_reg u) throws SQLException {
		boolean f=false;
		String sql="insert into user_register(name,email,password,address,ph_no)values(?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,u.getName());
		ps.setString(2,u.getEmail());
		ps.setString(3,u.getPassword());
		ps.setString(4,u.getAddress());
		ps.setString(5,u.getPh_no());
		
		int i=ps.executeUpdate();
		if(i==1) {
			System.out.println("Sucess...");
			f=true;
		}
		return f;
	}


	public String check(String email, String password) throws SQLException {
		user_reg u=null;
		String s=null;
		PreparedStatement ps=con.prepareStatement("select * from user_register where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			u=new user_reg();
			u.setId(rs.getInt(1));
			u.setName(rs.getString(2));
			u.setEmail(rs.getString(3));
			u.setPassword(rs.getString(4));
			u.setAddress(rs.getString(5));
			u.setPh_no(rs.getString(6));
			
			if(email.equals(u.getEmail()) && password.equals(u.getPassword())) {
	            s=u.getName();
	            System.out.println(s);
	            break;
			}
		}
		
		return null;
	}


	public boolean insert1(category c) throws SQLException {
		boolean f= false;
		String sql=("insert into add_cate(cate_name)values(?)");
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, c.getCat_name());
		
		int i=ps.executeUpdate();
		if(i==1) {
			System.out.println("Inserted Succesfully...");
			f=true;
		}
		return f;
	}


	public boolean insert(product pd) throws SQLException {
		 boolean b=false;
		   String sql="insert into add_product(p_id,p_name,p_description,p_price,p_quantity,p_category,p_picture)values(?,?,?,?,?,?,?)";
		   PreparedStatement ps=con.prepareStatement(sql);
		   ps.setInt(1,pd.getP_id());
		   ps.setString(2,pd.getP_name());
		   ps.setString(3,pd.getP_description());
		   ps.setString(4,pd.getP_price());
		   ps.setString(5,pd.getP_quantity());
		   ps.setString(6,pd.getP_category());
		   ps.setBytes(7, pd.getP_picture());
		   
		   int i1=ps.executeUpdate();
		   if(i1==1)
		   {
			   System.out.println("inserted sucessfully!! ");
			   b=true;
		   }
		   
			return b;
		
	}
	
	public List<category> AllRecord() throws Exception
	{
		List<category>a1=new ArrayList<category>();
		category c=null;
		PreparedStatement ps=con.prepareStatement("Select * from add_cate");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			c=new category();
			c.setCat_id(rs.getInt(1));
			c.setCat_name(rs.getString(2));
			
			a1.add(c);
		
		}
		return a1;
	}
	
	public boolean update(category c) throws SQLException {
		boolean b=false;
		String sql=("update add_cate set cat_name=? where cat_id=?");
		PreparedStatement pt=con.prepareStatement(sql);
		pt.setString(1,c.getCat_name());
		pt.setInt(2,c.getCat_id());
		
		int k=pt.executeUpdate();
		if (k==1)
		{
			System.out.println("sucess");
			b=true;
			
		}
		return b;
		
	}
	
	public category checkid1(int cat_id) throws SQLException
	{
		category c=null;
		PreparedStatement ps=con.prepareStatement("select * from add_category where cat_id=?");
		ps.setInt(1,cat_id);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			c=new category();
			c.setCat_id(rs.getInt(1));
			c.setCat_name(rs.getString(2));
			
			
		}
		return c;
	}
	


	public boolean delete1(int cat_id1) {
	
		
		return false;
	}
	
	
}
