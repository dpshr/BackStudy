<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> showSession </h1>

<% 
//4. Session 조회
// session은 jsp의 내장 객체이기 때문에 선언하지 않고도 쓸수 있다
String name = (String)session.getAttribute("name");

%>

이름(표현식): <%= name %>
<hr>
<!-- 내장 객체에 있는 값을 출력하고자 할 때 EL표현 언어도 사용 가능! -->
이름(EL표현언어):${name}
<hr>
클래스이름: ${className}
<hr>
<a href="Ex05_deleteSession.jsp">session 삭제</a>

</body>
</html>