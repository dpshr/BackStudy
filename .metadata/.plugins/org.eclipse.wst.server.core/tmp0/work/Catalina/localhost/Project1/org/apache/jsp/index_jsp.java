/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-06-05 05:28:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<!--\n");
      out.write("	Arcana by HTML5 UP\n");
      out.write("	html5up.net | @ajlkn\n");
      out.write("	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("	<head>\n");
      out.write("		<title>농부 초기자본계산사이트</title>\n");
      out.write("		<meta charset=\"utf-8\" />\n");
      out.write("		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n");
      out.write("		<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("		<style type=\"text/css\">\n");
      out.write("		button#sign{\n");
      out.write("		margin-left:1000px;\n");
      out.write("		margin-bottom: 20px;\n");
      out.write("		}button#login{\n");
      out.write("		margin-left:10px;\n");
      out.write("		}\n");
      out.write("		h1{\n");
      out.write("			font-size: 30px;\n");
      out.write("			color: black;\n");
      out.write("		}\n");
      out.write("		a#logo{\n");
      out.write("			color: black;\n");
      out.write("		}\n");
      out.write("		a#join{\n");
      out.write("		color: black;\n");
      out.write("		}\n");
      out.write("		a#login{\n");
      out.write("		color: black;\n");
      out.write("		}\n");
      out.write("		a#mypage{\n");
      out.write("		color: black;\n");
      out.write("		}\n");
      out.write("		</style>\n");
      out.write("	</head>\n");
      out.write("	<body class=\"is-preload\">\n");
      out.write("		<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("			<!-- Header -->\n");
      out.write("				<div id=\"header\">\n");
      out.write("						\n");
      out.write("					<!-- Logo -->\n");
      out.write("						<h1><a href=\"exmain.jsp\" id=\"logo\"> <Strong>농부 초기자본계산 사이트</Strong></a></h1>\n");
      out.write("						<button id=\"sign\"><a href=\"Join.jsp\" id=\"join\">회원가입</a></button>\n");
      out.write("						<button id=\"login\"><a href=\"loginForm.html\" id=\"login\">로그인</a></button>\n");
      out.write("						<button id=\"mypage\"><a href=\"right-sidebar.html\" id=\"mypage\">마이페이지</a></button>\n");
      out.write("					<!-- Nav -->\n");
      out.write("						<nav id=\"nav\">\n");
      out.write("							<ul>\n");
      out.write("								<li class=\"current\"><a href=\"exmain.jsp\">Home</a></li>\n");
      out.write("								<li><a href=\"left-sidebar.html\">계산기</a></li>\n");
      out.write("								<li><a href=\"two-sidebar.html\">게시판</a></li>\n");
      out.write("								<li><a href=\"no-sidebar.html\">공지사항</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</nav>\n");
      out.write("\n");
      out.write("				</div>\n");
      out.write("\n");
      out.write("			<!-- Banner -->\n");
      out.write("				<section id=\"banner\">\n");
      out.write("					<header>\n");
      out.write("						<h2>Arcana: <em>A responsive site template freebie by <a href=\"http://html5up.net\">HTML5 UP</a></em></h2>\n");
      out.write("						<a href=\"#\" class=\"button\">Learn More</a>\n");
      out.write("					</header>\n");
      out.write("				</section>\n");
      out.write("\n");
      out.write("			\n");
      out.write("		<!-- Scripts -->\n");
      out.write("			<script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("			<script src=\"assets/js/jquery.dropotron.min.js\"></script>\n");
      out.write("			<script src=\"assets/js/browser.min.js\"></script>\n");
      out.write("			<script src=\"assets/js/breakpoints.min.js\"></script>\n");
      out.write("			<script src=\"assets/js/util.js\"></script>\n");
      out.write("			<script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("	</body>\n");
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