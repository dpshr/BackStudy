<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>판매 목록</h2>
	<ul>
		<li><a href="Ex02_Mouse.jsp">마우스</a></li>
		<li><a href="Ex02_Computer.jsp">컴퓨터</a></li>
		<li><a href="Ex02_Phone.jsp">핸드폰</a></li>
	</ul>
	<hr>
	<h2>최근 본 상품</h2>
	<%
	// 쿠키 조회(만약 쿠키의 이름에 item을 포함하고 있다면 쿠키의 값을 출력)
	Cookie[] cookies = request.getCookies();
	
	for (Cookie c : cookies) {
		if (c.getName().contains("item")) {
			String stuff = URLDecoder.decode(c.getValue(), "UTF-8");
	%>
	<%=stuff%><br>
	<%
	}
	}
	%>
	<hr>
	<a href = "Ex03_Delete.jsp">최근 본 상품 삭제</a>
</body>
</html>