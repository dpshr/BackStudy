package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex08_GetPost")
public class Ex08_GetPost extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청(request)데이터 인코딩
		//GET/POST한글 인코딩 방식
		//1. POST: 패킷의 Body에 실어져서 전송됨.
		//			-> 패킷이 넘어올 때마다 (요청이 들어올 때마다)인코딩 방식을 지정.
		
		//1
		request.setCharacterEncoding("UTF-8");
		
		 String name = request.getParameter("name");
		 response.setContentType("text/html; charset=UTF-8");
		 
		 PrintWriter out = response.getWriter();
		 
		 out.print(name);
		//2.GET : URL에 데이터가 실어져서 전송되므로 URI인코딩이 필요하다.
		// -> Severs -> server.xml -> connector 태그에 URIEncoding="UTF-8"지정.
		
	}

}
