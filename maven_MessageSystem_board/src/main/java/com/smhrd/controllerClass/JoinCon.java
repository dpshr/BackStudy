package com.smhrd.controllerClass;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.frontcontroller.Command;
import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberDTO;

public class JoinCon implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("[JoinCon]");
		
		
		
		// 2. 회원가입 데이터 꺼내오기
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		
		System.out.println("email : "+email);
		System.out.println("pw : "+pw);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);
		
		// 3. DTO로 묶기
		MemberDTO dto = new MemberDTO(email, pw, tel, address);
		
		// 4. DB에 회원정보를 입력할 메소드 호출
		int row = new MemberDAO().join(dto);
		
		// 5. 실행한 결과에 따라 페이지 이동
		String moveURL;
		if(row >0) {
			System.out.println("회원가입 성공");
			moveURL = "forward:/JoinSuccess.jsp";
			
			// request객체에 email 저장
			request.setAttribute("email", email);
		}else {
			System.out.println("회원가입 실패");
			moveURL = "Main.jsp";
		}
		return moveURL;
	}

}
