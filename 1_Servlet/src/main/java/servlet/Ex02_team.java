package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02_team")
public class Ex02_team extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String client_ip = request.getRemoteHost();
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String team1 = "192.168.0.23";
		String team2 = "192.168.0.24";
		String team3 = "192.168.0.21";
		String team4 = "0:0:0:0:0:0:0:1";
		if(client_ip.equals(team1)||
		client_ip.equals(team2)||
		client_ip.equals(team3)||
		client_ip.equals(team4)){
			out.print("<h1>환영합니다!</h1>");
			out.print("<img src = './img/2.png'> ");
		}
		else {
			out.print("<h1>잘못들어왔습니다.</h1>");
			out.print("<img src = './img/1.png'> ");
		}
	}

}
