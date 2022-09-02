<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact List - Spring Boot Web Application Example</title>
<style>
    .myd{
        color: red;
        }
    .embox{
        color: blue;
    }   
</style>
</head>
<body>
<div align="center">
<div class="myd">
<h1 align="center">My Employee Details</h1>
</div>
<br />
<table border="1" cellpadding="10" style="width:60%; height:50%; text-align: center">
<tr>
<th><div class="embox">EM ID</th>
<th><div class="embox">EM Name</th>
<th><div class="embox">EM Age</th>
</tr>
</div>
<c:forEach var="student" items="${stulist}">
<tr>
<td>${student.emid}</td>
<td>${student.emname}</td>
<td>${student.emage}</td>
</tr>
</c:forEach>
</div> 
</table>
</body>
</html>