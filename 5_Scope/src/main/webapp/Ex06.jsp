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
String num1 = request.getParameter("num1");
String num2 = request.getParameter("num2");

int sum = (Integer)request.getAttribute("sum");
%>
<%=num1 %>
<%=num2 %>
<%=sum%>
${sum}
</body>
</html>