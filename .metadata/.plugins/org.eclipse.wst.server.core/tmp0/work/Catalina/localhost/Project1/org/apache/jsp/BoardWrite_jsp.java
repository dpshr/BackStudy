/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-06-14 01:33:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.MemberDTO;

public final class BoardWrite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(1);
    _jspx_imports_classes.add("model.MemberDTO");
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<!--\r\n");
      out.write("	Arcana by HTML5 UP\r\n");
      out.write("	html5up.net | @ajlkn\r\n");
      out.write("	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>농부 초기자본계산사이트</title>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	.title{\r\n");
      out.write(" 	font-size: 72px;\r\n");
      out.write("  	background: linear-gradient(to bottom, green, yellow);\r\n");
      out.write("  	-webkit-background-clip: text;\r\n");
      out.write(" 	-webkit-text-fill-color: transparent;\r\n");
      out.write("	}\r\n");
      out.write("	h1{\r\n");
      out.write("			font-size: 30px;\r\n");
      out.write("			color: black;\r\n");
      out.write("			\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"is-preload\">\r\n");

MemberDTO user_info = (MemberDTO) session.getAttribute("user_info");
if (user_info==null){
      out.write("\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		alert(\"로그인 하세요. \");\r\n");
      out.write("		location.href = \"./Login.jsp\";\r\n");
      out.write("	</script>\r\n");
}
      out.write("\r\n");
      out.write("	<div id=\"page-wrapper\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Header -->\r\n");
      out.write("		<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Logo -->\r\n");
      out.write("			<h1>\r\n");
      out.write("				<a href=\"Main.jsp\" class=\"title\"> <Strong>농부樂</Strong></a>\r\n");
      out.write("			</h1>\r\n");
      out.write("\r\n");
      out.write("			<!-- Nav -->\r\n");
      out.write("			<nav id=\"nav\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"Main.jsp\">Home</a></li>\r\n");
      out.write("					<li><a href=\"Calculator.jsp\">계산기</a></li>\r\n");
      out.write("					<li class=\"current\"><a href=\"BoardMain.jsp\">게시판</a></li>\r\n");
      out.write("					\r\n");
      out.write("				</ul>\r\n");
      out.write("			</nav>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- Main -->\r\n");
      out.write("		<section class=\"wrapper style1\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"row gtr-200\">\r\n");
      out.write("					<div class=\"col-3 col-12-narrower\">\r\n");
      out.write("						<div id=\"sidebar1\">\r\n");
      out.write("\r\n");
      out.write("							<!-- Sidebar 1 -->\r\n");
      out.write("\r\n");
      out.write("							\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-6 col-12-narrower imp-narrower\">\r\n");
      out.write("						<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("							<!-- Content -->\r\n");
      out.write("\r\n");
      out.write("							<article>\r\n");
      out.write("								<header>\r\n");
      out.write("									<h2>자유게시판</h2>\r\n");
      out.write("								</header>\r\n");
      out.write("\r\n");
      out.write("								<span class=\"image featured\"><img src=\"images/banner.jpg\"\r\n");
      out.write("									alt=\"\" /></span>\r\n");
      out.write("							\r\n");
      out.write("								<div id=\"board\">\r\n");
      out.write("									<form action=\"BoardService.do\" method=\"post\">\r\n");
      out.write("										\r\n");
      out.write("										<table>\r\n");
      out.write("											<tr>\r\n");
      out.write("												<td>제목</td>\r\n");
      out.write("												<td><input type=\"text\" name=\"title\"></td>\r\n");
      out.write("											</tr>\r\n");
      out.write("											<tr>\r\n");
      out.write("												<td>작성자</td>\r\n");
      out.write("												<td>\r\n");
      out.write("												<input type=\"hidden\" NAME=\"id\"\r\n");
      out.write("													value='");
      out.print(user_info.getId());
      out.write('\'');
      out.write('>');
      out.print(user_info.getId());
      out.write("\r\n");
      out.write("												</td>\r\n");
      out.write("											</tr>\r\n");
      out.write("											\r\n");
      out.write("											<tr>\r\n");
      out.write("												<td colspan=\"2\">내용</td>\r\n");
      out.write("											</tr>\r\n");
      out.write("											<tr><td colspan=\"2\">\r\n");
      out.write("												 <textarea rows=\"10\"\r\n");
      out.write("														name=\"content\" style=\"resize: none;\"></textarea></td>\r\n");
      out.write("											</tr>\r\n");
      out.write("											<tr>\r\n");
      out.write("												<td colspan=\"2\"><input type=\"reset\" value=\"초기화\">\r\n");
      out.write("													<input type=\"submit\" value=\"작성하기\"></td>\r\n");
      out.write("											</tr>\r\n");
      out.write("										</table>\r\n");
      out.write("									</form>\r\n");
      out.write("								</div>\r\n");
      out.write("							</article>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-3 col-12-narrower\">\r\n");
      out.write("						<div id=\"sidebar2\">\r\n");
      out.write("\r\n");
      out.write("							<!-- Sidebar 2 -->\r\n");
      out.write("\r\n");
      out.write("							\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- Scripts -->\r\n");
      out.write("		<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("		<script src=\"assets/js/jquery.dropotron.min.js\"></script>\r\n");
      out.write("		<script src=\"assets/js/browser.min.js\"></script>\r\n");
      out.write("		<script src=\"assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("		<script src=\"assets/js/util.js\"></script>\r\n");
      out.write("		<script src=\"assets/js/main.js\"></script>\r\n");
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
