package com.smhrd.controllerClass;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.frontcontroller.Command;

public class LogoutCon implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 로그인 : session에 사용자 정보 유지
				// 로그아웃 : session에 저장된 사용자 정보 제거
				
				HttpSession session = request.getSession();
				
				session.removeAttribute("user_info");
				// session.invalidate(); 세션 종료
		return "Main.jsp";
	}

}
