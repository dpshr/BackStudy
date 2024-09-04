package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet("/Ex07_makeTable")
public class Ex07_makeTable extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int room = Integer.parseInt(request.getParameter("room"));
		String color = request.getParameter("color");
		
		response.setContentType("text/html;");
		PrintWriter out = response.getWriter();
		out.print("<style>table{background-color :"+color+"}</style>");
		out.print("<table border =\"1\">");
		out.print("<tr>");
		for(int i = 1 ; i<=room;i++) {
			out.print("<td>"+i+"</td>");
		}
		out.print("</tr>");
		out.print("</table>");
		
	}

}
