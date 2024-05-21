<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="row mt-5">
<div class="col-md-4 offset-md-4">
<div class="card">
<div class="card-body px-5">

<h3 class="text-center my-3">Log-In Here</h3>

<form action="user_log_servlet" method="post">


<div class="form-group">
<label for="name">User Name</label>
<input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
</div>

<div class="form-group">
<label for="name">Password</label>
<input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
</div>


<div class="contaoner text-center">
<button class="btn btn-outline-warning">Log-In</button><br>
If you are not login<a href="user_reg.jsp">Register here..</a>

</form>
</div>


</div>
</div>
</div>
</div>


</body>
</html>