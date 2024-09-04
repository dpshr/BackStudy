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
	int floor = Integer.parseInt(request.getParameter("floor"));
	int room = Integer.parseInt(request.getParameter("room"));
	%>
	<table border="1">
		<%
		for (int i = 1; i <= floor; i++) {
		%><tr>
			<%
			for (int j = 1; j <= room; j++) {
			%>
			<td><%=i%>0<%=j%>호</td>
			<%
			}
			%>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>