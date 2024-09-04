package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 3. URL Mapping : Servlet을 대체하는 문자열 
// 하위 디렉토리가 많아질 때  url이 길어지고 , 경로가 노출되어 보안상의 문제로 인하여
// 직접 경로를 쓰지 않고 문자열로 대체
// 없으면 실행 불가(404 오류), 중복되어도 실행 불가(Failed to start)
@WebServlet("/Ex01_requestResponse")
		// servlet은 HttpServlet 클래스를 상속 받음
public class Ex01_requestResponse extends HttpServlet {
		// service메소드 : Java의 main 메소드와 같은 역할 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. request 객체 : 사용자가 요청을 했을 때, 요청에 대한 모든 정보를 담고 있는 객체
		// ex) 요청이 들어온 ip 주소, 요청을 할 때 넘겨준 데이터(치킨등 검색어, id, pw등)
		
		// cmd -> ipconfig -> IPv4 :192.168.0.24
		// http://localhost:8081/1_Servlet/Ex01_requestResponse
		// http://192.168.0.24:8081/1_Servlet/Ex01_requestResponse
		// 실습1. 내 servlet에 요청이 들어온 ip주소 확인하기 
		String client_ip = request.getRemoteHost();
		System.out.println(client_ip);
		
		// 2. response객체 : 사용자에게 응답할 때 사용하는 객체 
		// ex) 페이지에 대한 설정, html 문서 , 페이지 이동.. 
		
		// 응답할 html문서에 대한 설정 (항상 첫번째로 설정을해줘야한다)
		response.setContentType("text/html; charset=UTF-8");
		
		// 웹에 출력 
		PrintWriter out = response.getWriter();
		
		out.print("<h1>윤에녹의 페이지입니다.</h1>");
		// 이미지 출력하기 
		// Servlet이 실행되는 위치: src/main/webapp
		out.print("<img src = './img/손흥민14.jpg'> ");
	}

}
