<%@page import="com.connection.jdbcConnection"%>
<%@page import="com.model.pro_module"%>
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
</head>
<body>

<div class="container mt-3">
<table class="table table-striped table-info" style="width:70%" align="right">
<tr class="table table-success">
  <th>Category_Id</th>
  <th>Category_Name</th>
  <th>Section</th>
</tr>


<% 
try{
	pro_module pm=new pro_module(jdbcConnection.getConnection());
    List<category> L1=pm.AllRecord();
 
 for(category c:L1)
 {
%>
<tr>
<td><%=c.getCat_id() %></td>
<td><%=c.getCat_name()%></td>




<td><button type="button"><a href="addcategory_delete_servlet?cat_id=<%=c.getCat_id()%>">Delete</a>
<button type="button"><a href="add_category_update.jsp?cat_id=<%=c.getCat_id()%>">Update</a></button></td>     

</tr>
<% 
  }
  }catch(Exception e)
{
	e.printStackTrace();
}
%>


</table>
</div>

</body>
</html>