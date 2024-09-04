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
<% 
request.setCharacterEncoding("UTF-8");
String sub = request.getParameter("subject");
String[]item = request.getParameterValues("item");
Random rd = new Random();
int num = rd.nextInt(item.length);
%>
<fieldset>
<legend>랜덤 당첨 결과</legend>

<table>
<tr>
<td>주제:</td>
<td><%= sub%><br></td>
</tr>
<tr>
<td colspan="2" id="center" >결과:<%= item[num] %></td>
</tr>
</table>

</fieldset>
</body>
</html>