package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String Mem_id = "smart";
		String Mem_pw = "1234";
		String moveURL;
		if(id.equals(Mem_id)&&pw.equals(Mem_pw)) {
			moveURL = "main.jsp";
			HttpSession session = request.getSession();
			session.setAttribute("id", Mem_id);
		}else {
			moveURL = "loginForm";
		}
		
		response.sendRedirect(moveURL);
	}

}
