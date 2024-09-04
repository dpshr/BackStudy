<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String name =(String)session.getAttribute("name"); %>
<table border="1">
<tr>
<td colspan="2" align="center"><%= name%>님 환영합니다.</td>
</tr>
<tr>
<td colspan="2" align="center"><a href="Logout"><button>로그아웃</button></a></td>
</tr>
</table>
</body>
</html>