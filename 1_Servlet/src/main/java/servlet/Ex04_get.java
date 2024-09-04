package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex04_get")
public class Ex04_get extends HttpServlet {
	
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Ex04_get: 데이터를 받을 곳");
	
	// 데이터 꺼내오기
	// request : 요청과 관련된 모든 정보를 담고 있는 객체 
	// request.getParameter("form태그 내에 작성한 name 값")
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	// console창에 출력하기
	System.out.println("id: "+ id);
	System.out.println("pw: "+ pw);
}

}
