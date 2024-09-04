<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Scope 내장객체의 영역</h1>

	<ol>
		<li>pageContext: 하나의 <mark>jsp페이지</mark>에 대해서 정보를 유지</li>
		<li>request: 하나의 <mark>요청</mark>에 대해서 정보를 유지</li>
		<li>session: 하나의 <mark>브라우저</mark>에 대해서 정보를 유지</li>
		<li>application: 하나의 <mark>웹어플리케이션(server)</mark>에 대해서 정보를 유지</li>
	</ol>
	
	<%
		//저장 : 객체. setAttribute("이름",값:Object)
		pageContext.setAttribute("pageContextOk", "pageContextOk");
		request.setAttribute("requestOk", "requestOk");
		session.setAttribute("sessionOk", "sessionOk");
		application.setAttribute("applicationOk", "applicationOk");
		
		// 조회 : 객체 . getAttribute("이름")
		String pageOk= (String)pageContext.getAttribute("pageContextOk");	
		String requestOk= (String)request.getAttribute("requestOk");
		String sessionOk= (String)session.getAttribute("sessionOk");
		String applicationOk= (String)application.getAttribute("applicationOk");
		
		// forward 방식으로 request 정보 유지하기
		// RequestDispatcher : requset 객체를 이동할 페이지로 넘겨주는 역할을 하는 객체
		RequestDispatcher rd = request.getRequestDispatcher("./Ex02_scope.jsp");
		rd.forward(request, response);
	%>
	<h1>Ex01_scope</h1>
	pageContext : <%= pageOk %>, ${pageContextOk}<br>
	request : <%= requestOk %>, ${requestOk}<br>
	session : <%= sessionOk %>, ${sessionOk}<br>
	application : <%= applicationOk %>, ${applicationOk}<br>

</body>
</html>