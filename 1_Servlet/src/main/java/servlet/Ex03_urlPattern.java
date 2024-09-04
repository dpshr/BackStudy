package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03_urlPattern")
public class Ex03_urlPattern extends HttpServlet {
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	// ServletPath : urlmapping 값
	System.out.println("ServletPath : "+ request.getServletPath());
	
	
	// ContextPath(Root) : Server가 프로젝트를 호출하는 이름
	System.out.println("ContextPath: "+request.getContextPath());
	
	System.out.println("requestURL : "+request.getRequestURL());
	System.out.println("requestURI : "+request.getRequestURI());
}

}
