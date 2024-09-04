<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions"%>
<!-- taglib 지시자 : 태그 라이브러리를 사용하기 위한 지시자 -->
<!-- JSTL : Jsp에서 사용 가능한 표준 태그 라이브러리 
		  : 5가지의 커스텀태그(core,function,sql,xml,fmt)
		  : core -> 변수선언, if/for 등과 같은 제어 기능이 있는 태그
		  : function : 문자열을 처리하는 함수가 들어있는 기능 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 1. 변수선언 -->

<% int a = 0; %>
<c:set var = "b" value = "1"></c:set>
<c:set var = "b" value = "1"/>

<!-- 2. 출력 -->
a: <%= a %> <br> <hr>
b: <c:out value="b"></c:out><hr>
<!-- EL 표현언어 -->
b: <c:out value="${b}"></c:out>
<hr>

<!--  3. if 문 -->
<%-- if(조건식){
		실행문장
} --%>
<c:if test="${a%2==0}">
	<c:out value="a는 짝수"></c:out>
</c:if>
<c:if test="${a%2==1}">
	<c:out value="a는 홀수"></c:out>
</c:if>

<hr>
<!-- 4. switch문 -->
<c:choose>
	<c:when test="${b%2==0}">
			<c:out value="b는 짝수"></c:out>
	</c:when>
	<c:otherwise>
			<c:out value="b는 홀수"></c:out>
	</c:otherwise>
</c:choose>

<!--  5. for문 -->
<hr> 스크립트릿 for문
<% for(int i = 0 ; i<=5;i++){
	out.print(i);
}
%>
<hr>

<c:forEach var="i" begin="0" end="5" step="1">
	<c:out value="${i}"></c:out>
</c:forEach>

<!-- 6. functions 태그로 배열 만들기 -->
<hr>
<c:set var = "team" value ="${fn:split('진동준-오창민-윤에녹','-')}"></c:set>

<%-- 
	for(자료형 변수명 : 반복가능한 변수)
	for(String member : team)
 --%>
<c:forEach items="${team}" var="member">
	<c:out value="${member}"></c:out> <br>
</c:forEach>
<hr>

<c:out value="${team[0]}"></c:out>


<!-- 7. functions 태그로 길이 가져오기 -->

<hr>

<c:out value="${fn:length(team)}"></c:out>
<c:out value="${fn:length('오창민')}"></c:out>

</body>
</html>