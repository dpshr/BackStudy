<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>makeCookie</h1>
	<ol>
		Cookie : Client의 정보를 유지하기 위한 방법
		<li>저장위치 : Client의 PC에 저장</li>
		<li>보안 : 취약</li>
		<li>자원 : Client의 자원을 사용하기 때문에 Server에 영향X</li>
		<li>용량 : 4KB X 300개 = 1.2MB</li>
		<li>저장형식 : 텍스트 형태로만 저장 가능 (Key=Value)</li>
	</ol>

	<%
	// 1. 쿠기 객체 생성
	// new Cookie("쿠키이름", "쿠키값")
	// 한글데이터는 인코딩 필요
	Cookie cookie = new Cookie("name", URLEncoder.encode("윤에녹", "UTF-8"));

	// 2. 쿠키의 기한을 설정
	// 양수 : 초 단위로, 해당시간만큼 쿠키를 유지
	// 음수 : 브라우저 종료 시 쿠키가 삭제 
	// 0 : 삭제

	cookie.setMaxAge(60 * 60);

	// 3. 쿠키를 전송
	// 쿠키는 응답할 때 ClientPC로 저장되므로, response객체를 사용
	response.addCookie(cookie);
	%>
</body>
</html>