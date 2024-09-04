<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>선호도 조사결과</h2>
	<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String[]fruit= request.getParameterValues("fruit");
	%>

	<table border="1">
		<tr>
			<td>이름</td>
			<td><%= name %></td>
		</tr>
		<tr>
			<td>좋아하는 과일</td>
			<td><%for(String x : fruit){%>
			<%= x %>
			<%} %>
			</td>
		</tr>
	</table>
</body>
</html>