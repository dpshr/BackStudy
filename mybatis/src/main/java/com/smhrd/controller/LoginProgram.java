package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.smhrd.model.*;

@WebServlet("/LoginProgram")
public class LoginProgram extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		MemberDTO dto = new MemberDTO(id,pw);
		String name = new MemberDAO().login(dto);
		String moveURL;
		if(name!= null) {
			// 쿼리스트링방식을 통해서 name 값 전송
			//moveURL = "./LoginSuccess.jsp?name="+URLEncoder.encode(name,"UTF-8");
			
			//2. session을 통해서 name값 유지 
			moveURL = "./LoginSuccess.jsp";
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
		}else {
			moveURL = "./LoginFail.jsp";
		}
		
		response.sendRedirect(moveURL);
		
		
	
	}

}
