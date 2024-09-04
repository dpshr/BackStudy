package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Ex03_makeSession")
public class Ex03_makeSession extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Session : Client의 정보를 유지하기 위한 방법
		//1. 저장위치 : ServerPC에 저장
		//2. 보안 : 강력
		//3. 자원 : Server의 자원을 사용하기 때문에 남발 X(비용 증가)
		//4. 용량 : Server가 허용하는 한 제한 X
		//5. 저장형식 : Object -> 모든 객체를 저장할 수 있음
		
		//1. Session 객체 생성 
		HttpSession session = request.getSession();
		//2. Session에 저장
		session.setAttribute("name","윤에녹");
		session.setAttribute("className","DCX빅데이터");
		//3. Session의 유효기간 설정(초단위)
		session.setMaxInactiveInterval(60*60);
		
		response.getWriter().print("<h1>makeSession</h1>");
	}

}
