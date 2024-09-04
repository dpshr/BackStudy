<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 지시자(Directive): JSP의 설정 정보 및 다른문서를 포함하는 기능 -->
<!-- 지시자의 종류 : page, include, taglib -->
<!-- contentType : 응답데이터의 형식과 인코딩방식을 브라우저한테 알려줌. -->
<!-- pageEncoding : JSP페이지에 대한 인코딩을 지정 -->
<!-- import : Java에서 사용하던 기능들을 import할때 사용(Scanner, Random) -->
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 스크립트릿(Scriptlet): JSP페이지 내부에 Java소스코드를 넣기 위함 -->
	<!-- Java에서 작성하는 코드 그대로 작성함.(세미콜론도 작성 필수) -->
	<%
		int age = 30;//스크립트릿에 작성한 변수/상수는 Service메서드 아래에 작성된다. 
		int age2 = 60;
		int sum = age+age2;
	%>
	
	<%= sum %> <!-- 표현식(Expression): 화면에 출력하기 위해서 사용(세미콜론 x) -->
	<%= sum+100 %>
	<%= Math.sqrt(sum) %>
	
	<!-- 선언문: JSP페이지 내부에 자바 메서드나 전역변수를 선언하기 위해서 사용 -->
	<%!
	//메서드
	public void print(){
		System.out.print("안녕하세요");
	}
	//전역변수
	int kg =100;
	%>
	
	<!-- JSTL(JavaServer Page Standard Tag Library) -->
	<!-- 코딩 자체를 태그형식으로 만들어줌.(디자이너에 적합) -->
	<c:forEach var="i" begin="1" end="10">
		${i} 
	</c:forEach>
	
</body>
</html>