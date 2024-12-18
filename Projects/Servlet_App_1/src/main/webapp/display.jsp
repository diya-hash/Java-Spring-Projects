<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<div class="container">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Employee ID</th>
        <th>Employee Name</th>
        <th>Employee Salary</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${emp.id }</td>
        <td>${emp.name }</td>
        <td>${emp.sal }</td>
      </tr>
    </tbody>
  </table>
</div>
</body>
</html>