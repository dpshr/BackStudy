package com.smhrd.frontcontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.controllerClass.BoardService;
import com.smhrd.controllerClass.DeleteCon;
import com.smhrd.controllerClass.IdCheckCon;
import com.smhrd.controllerClass.JoinCon;
import com.smhrd.controllerClass.LoginCon;
import com.smhrd.controllerClass.LogoutCon;
import com.smhrd.controllerClass.UpdateCon;

// 어떤 요청이든지 .do라는 확장자를 가지고 있으면 FrontController에서 요청을 받겠다.
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	HashMap<String, Command> list;
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("[FrontController]");

		// FrontController : 은행의 경비원 같은 역할
		// -> 모든 요청을 FrontController 에서 관리하여 개발과 유지보수의 효율성을 극대화
		// 1. 모든 요청을 받기 위해 urlmapping값을 *.do로 변경
		
		// 2. 어떤 요청이 들어왔는지 확인
	
		String servletPath = request.getServletPath();
		System.out.println(servletPath);
		
		// 3. post방식 디코딩
		request.setCharacterEncoding("UTF-8");
		// 4. 요청들어온 값으로 Controller 실행
		
		Command con = list.get(servletPath);
		String moveURL= con.execute(request, response);
		
		//5. 페이지 이동
		if(moveURL.contains("forward:/")) {
			moveURL = moveURL.substring("forward:/".length());
			RequestDispatcher rd = request.getRequestDispatcher(moveURL);
			rd.forward(request, response);
		}else if(moveURL.contains("rest:/")) {
			PrintWriter out = response.getWriter();
			out.print(moveURL.substring("rest:/".length()));
		}
		else {
			response.sendRedirect(moveURL);
		}
	}
	@Override
	public void init()throws ServletException{
		// init 메소드 : 서블릿 요청 시 최초 1번만 호출되는 메소드
		// 			 : 서블릿을 실행할 때 초기화 하는 용도
		// 어떤 요청이 들어왔을 때 어떤 Controller를 호출해야하는지 초기화 하는 용도 
		// HashMap(해시맵) : Key와 Value형태로 데이터를 저장 
		
		list = new HashMap<String,Command>();
		list.put("/LoginCon.do", new LoginCon());
		list.put("/JoinCon.do", new JoinCon());
		list.put("/LogoutCon.do", new LogoutCon());
		list.put("/UpdateCon.do", new UpdateCon());
		list.put("/BoardServiceCon.do", new BoardService());
		list.put("/IdCheckCon.do", new IdCheckCon());
		list.put("/DeleteCon.do", new DeleteCon());
		
		
	}
}
