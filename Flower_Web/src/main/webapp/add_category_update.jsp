<%@page import="com.model.pro_module"%>
<%@page import="com.connection.jdbcConnection"%>
<%@include file="sidebar.jsp"%>
<%@include file="header.jsp"%>
<%@page import="com.entity.category"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<style>
 .card{
  box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
 }
 
  .form-group {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
    }
 </style>
</head>
<body>

 <div class="row mt-5">
<div class="col-md-4 offset-md-4">
<div class="card">
<div class="card-body px-5">

<h3 class="text-center my-3">Update Category Here</h3>

 <%
    try{
    	int cat_id=Integer.parseInt(request.getParameter("cat_id"));
    	pro_module p=new pro_module(jdbcConnection.getConnection());
  
    	category c=p.checkid1(cat_id);
    
    %>
    

<form action="addproduct_update_servlet" method="post">

 <input type="hidden" placeholder="enter id"  name="cat_id" value="<%=c.getCat_id()%>">

<div class="form-group">
<lable for="name">Update Category Name:</lable>
<input type="text" class="form-control" id="name" placeholder="enter name" name="cat_name" value="<%=c.getCat_name()%>">
</div><br>

<div class="container text-center">
<button class="btn btn-outline-success">Update</button>
<button class="btn btn-outline-warning">Reset</button>
</div>


</form>
<%
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }
    %>
</div>
</div>

</div>

</div>

  

</body>
</html>