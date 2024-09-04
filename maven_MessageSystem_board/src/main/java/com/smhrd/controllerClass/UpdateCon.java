package com.smhrd.controllerClass;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.frontcontroller.Command;
import com.smhrd.model.MemberDAO;
import com.smhrd.model.MemberDTO;

public class UpdateCon implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


	      // 데이터 가져오기
	      String email = request.getParameter("email");
	      String pw = request.getParameter("pw");
	      String tel = request.getParameter("tel");
	      String address = request.getParameter("address");
	      
	      System.out.println("email : "+email);
	      System.out.println("pw : "+pw);
	      System.out.println("tel : "+tel);
	      System.out.println("address : "+address);
	      
	      // DTO로 묶기
	      MemberDTO dto = new MemberDTO(email, pw, tel, address);
	      
	      // update메소드 호출
	      int row = new MemberDAO().update(dto);
	      
	      // 실행결과 확인
	      
	      if(row>0) {
	    	  System.out.println("회원정보수정 성공");
	    	  
	    	  // session에 저장된 user_info 업데이트 
	    	  request.getSession().setAttribute("user_info", dto);
	      }else {
	    	  System.out.println("회원정보수정 실패");
	      } 
		return "Main.jsp";
	}

}
