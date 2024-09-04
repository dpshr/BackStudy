<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> forward vs sendRedirect</h1>
<hr>
<h3>forward</h3>
<ul>
	<li>요청이 1번</li>
	<li>요청이 들어오면 이동해야할 페이지로 서버 내부에서 이동</li>
	<li>요청이 1번이라서, 처음 요청했던 주소와 데이터가 유지</li>
	<li>요청이 1번이라서, 네트워크 트래픽 발생x , 실행속도가 빠름</li>
	<li>request객체를 사용하기 때문에 Object타입으로 모든 객체를 저장 가능</li>
	<li>단, 같은 서버 내에서만 이동 가능</li>
</ul>
<%
	RequestDispatcher rd = request.getRequestDispatcher("http://www.naver.com");
	rd.forward(request, response);
%>
<hr>
<h3>sendRedirect</h3>

<ul>
	<li>요청이 2번, 서로 다른 요청 객체</li>
	<li>요청이 들어오면 이동해야할 페이지를 응답해주고 다시 요청할 수 있도록 함</li>
	<li>요청이 2번이라서, 처음 요청했던 주소와 정보가 유지 X</li>
	<li>요청이 2번이라서, 상대적으로 네트워크 트래픽 발생O, 실행속도가 느림</li>
	<li>요청이 2번이라서, 상대적으로 네트워크 트래픽 발생O, 실행속도가 느림</li>	
	<li>쿼리스트링방식을 활용하기 때문에 Text형태의 데이터만 전송</li>
	<li>다른 서버도 요청 가능</li>
		
</ul>

</body>
</html>