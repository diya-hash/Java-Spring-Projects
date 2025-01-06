<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h3 style="color:red">${errorMsg }</h3>
	<form action="select-user">
		<input type="text" name="id" placeholder="enter id here">
		<input type="submit" value="select record">
	</form>
</body>
</html>