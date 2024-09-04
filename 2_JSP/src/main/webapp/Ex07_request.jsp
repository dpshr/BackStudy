<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"></script>
</head>
<body>
<%
 request.setCharacterEncoding("UTF-8");
 String name = request.getParameter("name");
 int java = Integer.parseInt(request.getParameter("java"));
 int python = Integer.parseInt(request.getParameter("python"));
 int web = Integer.parseInt(request.getParameter("web"));
 int machine = Integer.parseInt(request.getParameter("machine"));
 int avg = (java+python+web+machine)/4;
 response.setContentType("text/html; charset=UTF-8");
 
 String score;
 if(avg==100) score="A+";
 else if(avg >=90) score="A";
 else if(avg >=80) score="B";
 else if(avg >=70) score="C";
 else score="D";
 %>

<fieldset>
<legend>학점 확인 프로그램</legend>
 <table>
 <tr>
 <td align="left">이름</td>
 <td><%=name %></td>
 </tr>
 <tr >
 <td align="left">Java 점수</td>
 <td><%=java %></td>
 </tr>
 <tr>
 <td align="left">Python 점수</td>
 <td><%=python %></td>
 </tr>
 <tr>
 <td align="left">Web 점수</td>
 <td><%=web %></td>
 </tr>
 <tr>
 <td align="left">Machine Learning 점수</td>
 <td><%=machine %></td>
 </tr>
 <tr>
 <td align="left">평균</td>
 <td><%=avg %></td>
 </tr>
 <tr>
 <td align="left">학점</td>
 <td>
<%= score %>
  </td>
 </tr>
 </table>
</fieldset>
</body>
</html>