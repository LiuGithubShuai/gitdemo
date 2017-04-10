<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="/static/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-5">
			
			<% 
				String bookname = request.getAttribute("bookname") == null ? "" : (String) request.getAttribute("bookname"); 
				String author = request.getAttribute("author") == null ? "" : (String) request.getAttribute("author"); 
				String totalnum = request.getAttribute("totalnum") == null ? "" :(String) request.getAttribute("totalnum"); 
				String nownum = request.getAttribute("nownum") == null ? "" :(String) request.getAttribute("nownum"); 
				String isbn = request.getAttribute("isbn") == null ? "" :(String) request.getAttribute("isbn"); 
			
				String message = (String) request.getAttribute("message");
				if(message != null) { %>
				
					<div class="alert alert-danger"><%= message %></div>
					
			<%} %>
			
			
				<form action="/add" id="addForm" method="post">
					<legend>添加书籍</legend>
					<div class="form-group">
						<label>书籍名称</label>
						<input type="text" name="bookname" value="<%= bookname %>" />
					</div>
					<div class="form-group">
						<label>作者</label>
						<input type="text" name="author" value="<%= author %>" />
					</div>
					<div class="form-group">
						<label>总数量</label>
						<input type="text" name="totalnum" value="<%= totalnum %>" />
					</div>
					<div class="form-group">
						<label>现有数量</label>
						<input type="text" name="nownum" value="<%= nownum %>" />
					</div>
					<div class="form-group">
						<label>书籍ISBN号</label>
						<input type="text" name="isbn" value="<%= isbn %>" />
					</div>
					<button id="addBtn" class="btn btn-success">保存</button>					
				</form>
			</div>
		</div>
	</div>
</body>
</html>