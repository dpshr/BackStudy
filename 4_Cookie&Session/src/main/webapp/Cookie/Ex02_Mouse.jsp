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
<h2>마우스 상세 페이지</h2><br>
<h3>모델명: 로지텍 마우스<br>
가격 : 100000원 <br>
</h3>
<a href="Ex01_List.jsp">제품 목록 페이지로 돌아가기</a>

<% 
	// 이미 쿠키가 있는지 없는지 확인, 이미 있는 쿠키라면 삭제
	Cookie[]cookies = request.getCookies();
	for(Cookie c : cookies){
		if(c.getName().equals("item1")){
			c.setMaxAge(0);
			response.addCookie(c);
		}
	}
	
	// 상품정보가 담긴 쿠키 생성
	Cookie cookie = new Cookie("item1", URLEncoder.encode("마우스", "UTF-8"));
	// 쿠키 전송
	response.addCookie(cookie);
%>
</body>
</html>