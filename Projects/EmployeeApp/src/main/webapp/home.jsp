<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome ${user }</h3>
	<h3>${errorSelect }</h3>
	<div>
		<a href="register.jsp"><button>Register Employee</button></a>
		<a href="update.jsp"><button>Update Employee</button></a>
		<a href="select.jsp"><button>Select Employee by ID</button></a>
		<a href="select-all"><button>View all employees</button></a>
		<a href="delete.jsp"><button>Delete Employee</button></a>
		<a href="logout"><button>Logout</button></a>
		
	</div>
</body>
</html>