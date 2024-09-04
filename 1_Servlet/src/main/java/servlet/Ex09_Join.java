package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex09_Join")
public class Ex09_Join extends HttpServlet {	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String job = request.getParameter("job");
	String gender = request.getParameter("gender");
	String[]hobby = request.getParameterValues("hobby");
	
	System.out.println(job+" "+gender);
	for(String x:hobby) {
		System.out.println(x);
	}
	}

}
