<%@page import="com.connection.jdbcConnection"%>
<%@page import="com.model.pro_module"%>
<%@page import="com.entity.category"%>

<%@include file="sidebar.jsp"%>
<%@include file="header.jsp"%>
<%@page import="java.util.*" %>
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

<div class="row mt-1">
<div class="col-md-4 offset-md-4">
<div class="card">
<div class="card-body px-5">

<h3 class="text-center my-3">Add Product Here</h3>

<form action="add_product_servlet" method="post" enctype="multipart/form-data">

<div class="form-group">
<lable for="pname">Product Name:</lable>
<input type="text" class="form-control" id="pname" placeholder="enter product name" name="pname">
</div>

<div class="form-group">
<lable for="pdescription">Product Description:</lable>
<textarea class="form-control" id="pdiscription" placeholder="enter product description" name="pdescription"></textarea>
</div>

<div class="form-group">
<lable for="pprice">Product Price</lable>
<input type="number" class="form-control" id="pprice" placeholder="enter product price" name="pprice">
</div>



<div class="form-group">
<lable for="pquantity">Product Quantity</lable>
<input type="number" class="form-control" id="pquantity" placeholder="enter product quantity" name="pquantity">
</div>



<div class="form-group">
<lable for="pquantity">Add Category</lable>
<select name="category" class="form-control" id="category" placeholder="add category" name="category">
</select>
</div>

<div class="form-group">
 <label for="useremail">select picture of product:</label>
 <input type="file" placeholder="chose image" id="image" name="image" accept="image/*">
</div>




<div class="container text-center">
<button class="btn btn-outline-success">Add Product</button>
<button class="btn btn-outline-warning">Reset</button>
</div>






</form>
</div>
</div>

</div>

</div>


</body>
</html>