<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h3 style="color:green">${successMsg }</h3>
		<h3 style="color:red">${errorMsg }</h3>
<form action="update-user">
	<input type="text" name="id" placeholder="enter id here">
	<input type="text" name="sal" placeholder="enter updated salary here">
	<input type="submit" value="Update">
</form>
</body>
</html>