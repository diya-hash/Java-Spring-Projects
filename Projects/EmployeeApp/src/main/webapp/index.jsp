<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h3 style="color:red">${errorMsg}</h3>
		<h3 style="color:green">${msg}</h3>
	<div>	
		<form action="login_username" method="post">
			<h3>Welcome to your Employee Application</h3>
			<input type="text" name="username" placeholder="enter username" >
			<input type="text" name="password" placeholder="enter password">
			<input type="submit" value="Login">
		</form>
		</div>
		<div>	
		<form action="login_email" method="post">
			<input type="text" name="email" placeholder="enter email" >
			<input type="submit" value="Login">
		</form>
		</div>
	<div><p>Do not have an account? Sign up</p>
		<a href="signup.jsp"><button>Sign Up</button></a>
	</div>


</body>
</html>