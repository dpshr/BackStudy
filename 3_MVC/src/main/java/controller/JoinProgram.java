package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.MemberDTO;

@WebServlet("/JoinProgram")
public class JoinProgram extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		Controller : View/Model 에서 전달받은 데이터 처리 및 가공 
//				   : VIew와 Model의 중간역할
		System.out.println("[JoinProgram]");
		
//		1. post방식 디코딩 
		request.setCharacterEncoding("UTF-8");
//		2. 데이터 가져오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name =request.getParameter("name");
		int age =Integer.parseInt(request.getParameter("age"));
		
		System.out.println("id:"+id);
		System.out.println("pw:"+pw);
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		
//		3. DTO로 묶어주기 
		MemberDTO dto = new MemberDTO(id,pw,name,age);
		
//		4. 데이터를 DB에 넣어줄 join 메소드 호출
		int row = new MemberDAO().join(dto);
		
//		5. 실행 결과에 따라서 페이지 이동
		String moveURL;
		if(row>0) {
			System.out.println("회원가입 성공");
			moveURL = "./Login.html";
		}else {
			System.out.println("회원가입 실패");
			moveURL = "./JoinFail.html";
		}
		
		response.sendRedirect(moveURL);
	}

}
