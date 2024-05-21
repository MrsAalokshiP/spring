<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
 <%@include file="sidebar.jsp"%>
<%@include file="header.jsp"%>
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

<h3 class="text-center my-3">Add Category Here</h3>

<form action="add_category_servlet" method="post">

<div class="form-group">
<lable for="name">Category Name:</lable>
<input type="text" class="form-control" id="name" placeholder="enter name" name="cat_name">
</div><br>

<br>

<div class="container text-center">
<button class="btn btn-outline-success">Add Category</button>
<button class="btn btn-outline-warning">Reset</button>
</div>


</form>
</div>
</div>

</div>

</div>

  

</body>
</html>