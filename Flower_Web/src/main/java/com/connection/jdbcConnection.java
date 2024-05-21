package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcConnection {
   public static Connection con;
   public static Connection getConnection(){
	  try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123456");
		  
		  
	  }catch (Exception e) {
		System.out.println(e);
	}
	return con;
	   
   }
}
