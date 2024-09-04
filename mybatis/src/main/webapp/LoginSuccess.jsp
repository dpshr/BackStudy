<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% //1. 로그인성공시 쿼리스트링 방식으로 보낸 name값 가져오기 
//String name = request.getParameter("name"); 

//2. session에 저장해놓은 name값 가져오기
String name =(String)session.getAttribute("name");
%>
<h2><%=name %>님 환영합니다.</h2>
<h2>${name}님 환영합니다.</h2>
</body>
</html>