/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-06-11 10:20:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("<style>\r\n");
      out.write("table {\r\n");
      out.write("	width: 280px;\r\n");
      out.write("	height: 550px;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".email {\r\n");
      out.write("	width: 127px;\r\n");
      out.write("	height: 32px;\r\n");
      out.write("	font-size: 15px;\r\n");
      out.write("	border: 0;\r\n");
      out.write("	border-color: lightgray;\r\n");
      out.write("	border-radius: 15px;\r\n");
      out.write("	outline: none;\r\n");
      out.write("	padding-left: 10px;\r\n");
      out.write("	background-color: rgb(233, 233, 233);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text {\r\n");
      out.write("	width: 250px;\r\n");
      out.write("	height: 32px;\r\n");
      out.write("	font-size: 15px;\r\n");
      out.write("	border: 0;\r\n");
      out.write("	border-radius: 15px;\r\n");
      out.write("	outline: none;\r\n");
      out.write("	padding-left: 10px;\r\n");
      out.write("	background-color: rgb(233, 233, 233);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("select {\r\n");
      out.write("	width: 100px;\r\n");
      out.write("	height: 32px;\r\n");
      out.write("	font-size: 15px;\r\n");
      out.write("	border: 1;\r\n");
      out.write("	border-color: lightgray;\r\n");
      out.write("	border-radius: 15px;\r\n");
      out.write("	outline: none;\r\n");
      out.write("	padding-left: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn {\r\n");
      out.write("	width: 262px;\r\n");
      out.write("	height: 32px;\r\n");
      out.write("	font-size: 15px;\r\n");
      out.write("	border: 0;\r\n");
      out.write("	border-radius: 15px;\r\n");
      out.write("	outline: none;\r\n");
      out.write("	padding-left: 10px;\r\n");
      out.write("	background-color: rgb(164, 199, 255);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn:active {\r\n");
      out.write("	width: 262px;\r\n");
      out.write("	height: 32px;\r\n");
      out.write("	font-size: 15px;\r\n");
      out.write("	border: 0;\r\n");
      out.write("	border-radius: 15px;\r\n");
      out.write("	outline: none;\r\n");
      out.write("	padding-left: 10px;\r\n");
      out.write("	background-color: rgb(61, 135, 255);\r\n");
      out.write("}\r\n");
      out.write("tr#tr1{\r\n");
      out.write("	height: 5px;\r\n");
      out.write("	!important;\r\n");
      out.write("}\r\n");
      out.write("button{\r\n");
      out.write("	background-color: #9acd32;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<form action=\"JoinCon.do\" method=\"post\">\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><h2>회원가입</h2></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>아이디</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input type=\"text\" class=\"text\" name=\"id\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr id=\"tr1\"> <td>&nbsp</td> </tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td> <button type=\"button\" id=\"idcheck\">아이디중복확인</button><br>\r\n");
      out.write("				<span id=\"idC\"> </span> </td>\r\n");
      out.write("				\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr> <td>&nbsp</td> </tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>비밀번호</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input type=\"password\" class=\"text\" name=\"pw\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr id=\"tr1\"> <td>&nbsp</td> </tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>비밀번호 확인</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input type=\"password\" class=\"text\" name=\"pw1\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr id=\"tr1\"> <td>&nbsp</td> </tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>닉네임</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input type=\"text\" class=\"text\" name=\"name\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr id=\"tr1\"> <td>&nbsp</td> </tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>생년월일</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input type=\"date\" class=\"text\" name=\"birthday\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr id=\"tr1\"> <td>&nbsp</td> </tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>성별</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><select name=\"gender\" class=\"text\">\r\n");
      out.write("						<option value=\"\">성별 선택</option>\r\n");
      out.write("						<option value=\"m\">남자</option>\r\n");
      out.write("						<option value=\"f\">여자</option></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr id=\"tr1\"> <td>&nbsp</td> </tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>이메일</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input type=\"text\" class=\"email\" name=\"email\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr id=\"tr1\"> <td>&nbsp</td> </tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input type=\"submit\" value=\"가입하기\" class=\"btn\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
      out.write("	 <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("	\r\n");
      out.write("	$('#idcheck').on('click',function(){\r\n");
      out.write("		var id = $('input[name=id]').eq('0').val();\r\n");
      out.write("		console.log(id);\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url : \"idcheckCon.do\",\r\n");
      out.write("			type : 'get',\r\n");
      out.write("			data : { /*보낼 데이터*/\r\n");
      out.write("				id : id\r\n");
      out.write("			},\r\n");
      out.write("			dataType : \"text\",/* 실행 결과의 데이터 타입 */\r\n");
      out.write("			success : function(result){\r\n");
      out.write("				console.log(result)\r\n");
      out.write("				$('#idC').html(result);\r\n");
      out.write("			},\r\n");
      out.write("			error : function(e){\r\n");
      out.write("				console.log(e)\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("		});\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
