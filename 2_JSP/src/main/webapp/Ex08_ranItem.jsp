<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
 fieldset{
 	display: inline;
 }
 #center{
 	text-align: center;
 }
</style>
</head>
<body>
<form action="./Ex08_ranResult.jsp" method = "post">
<fieldset>
<legend>랜덤 당첨 작성</legend>
<table>
<tr>
<td>주제:</td>
<td><input type="text" name="subject"></td>
</tr>
<%
int data = Integer.parseInt(request.getParameter("number"));
%>

<% for(int i = 0; i<data;i++){ %>
	<tr>
	<td>아이템<%=i+1%>:</td>
	<td><input type="text" name="item"></td>
	</tr>
<%
} %>
<tr>
<td colspan="2" id="center"><button type="submit">생성하기</button></td>
</tr>
</table>

</fieldset>

</form>


</body>
</html>