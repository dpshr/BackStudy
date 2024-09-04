package com.smhrd.controllerClass;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.frontcontroller.Command;
import com.smhrd.model.MemberDAO;

public class DeleteCon implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("[deleteCon]");
		
		
	    String email = request.getParameter("name");
	  	   
	    int row = new MemberDAO().delete(email);
	    if(row>0) {
	    	  System.out.println("회원정보삭제 성공");
	    	 
	      }else {
	    	  System.out.println("회원정보삭제 실패");
	      } 
		return "ShowMember.jsp";
	}

}
