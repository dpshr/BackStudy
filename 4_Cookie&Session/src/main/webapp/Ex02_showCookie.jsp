<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>showCookie</h1>

	<%
	// 4. 쿠키조회
	// Server가 따로 요청하지 않아도 request 객체에 담겨서 옴
	Cookie[]cookies = request.getCookies();
	for(Cookie c : cookies){
		out.print("쿠키 이름: "+ c.getName()+"<br>");
		String value = URLDecoder.decode(c.getValue(),"UTF-8");
		out.print("쿠키 값 : "+ value+ "<hr>");
	}
	%>
</body>
</html>