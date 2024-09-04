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
String id = request.getParameter("id");
String pw = request.getParameter("pw");

if(id.equals("smart")&&pw.equals("123")){
	request.setAttribute("id", id); // request영역에 값 저장
	RequestDispatcher rd = request.getRequestDispatcher("Ex11_LoginSuccess.jsp");
	// RequsetDispatcher : 클라이언트로부터 최초에 들어온 요청을 원하는 자원으로 넘기능 등의 메서드를 가지고 있다.
	rd.forward(request, response);
	// forward : 다음페이지로 request와 response를 넘기는 역할.
}else{
	response.sendRedirect("Ex11_LoginFail.jsp");
}
%>



</body>
</html>