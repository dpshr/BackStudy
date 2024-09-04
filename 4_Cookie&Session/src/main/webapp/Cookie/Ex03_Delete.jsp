<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//1. 쿠키 제거 
Cookie[] cookies = request.getCookies();
for (Cookie c : cookies) {
	if (c.getName().contains("item")) {
		c.setMaxAge(0);
		response.addCookie(c);
		}
	}
//2. 업데이트 된 쿠키는 재전송

//3. 쿠키 제거 후 List.jsp로 이동
response.sendRedirect("Ex01_List.jsp");
%>
</body>
</html>