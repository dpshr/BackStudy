/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-06-13 08:36:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.MemberDTO;
import model.MemberDAO;

public final class CalResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/smhrd1/Desktop/BackStudy/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Project1/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1308849601000L));
    _jspx_dependants.put("jar:file:/C:/Users/smhrd1/Desktop/BackStudy/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Project1/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("model.MemberDAO");
    _jspx_imports_classes.add("model.MemberDTO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody;

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
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("<title>농초계-마이페이지</title>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("button#logout {\r\n");
      out.write("	margin-left: 10px;\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("	background-color: #9acd32;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("	font-size: 30px;\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write("a#mypage {\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a#logout {\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write("button#mypage {\r\n");
      out.write("	margin-left: 1000px;\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".title {\r\n");
      out.write("	font-size: 72px;\r\n");
      out.write("	background: linear-gradient(to bottom, green, yellow);\r\n");
      out.write("	-webkit-background-clip: text;\r\n");
      out.write("	-webkit-text-fill-color: transparent;\r\n");
      out.write("}\r\n");
      out.write("#calmove{\r\n");
      out.write("margin: 0px !important;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"is-preload\">\r\n");
      out.write("	");

	ArrayList<Integer>sum = (ArrayList)session.getAttribute("sum");
	MemberDTO user_info = (MemberDTO) session.getAttribute("user_info");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div id=\"page-wrapper\"></div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Header -->\r\n");
      out.write("	<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Logo -->\r\n");
      out.write("		<h1>\r\n");
      out.write("			<a href=\"Main.jsp\" class=\"title\"> <Strong>농부樂</Strong></a>\r\n");
      out.write("		</h1>\r\n");
      out.write("		<button id=\"mypage\">\r\n");
      out.write("			<a href=\"Mypage.jsp\" id=\"mypage\">마이페이지</a>\r\n");
      out.write("		</button>\r\n");
      out.write("		<button id=\"logout\">\r\n");
      out.write("			<a href=\"LogoutCon.do\" id=\"logout\">로그아웃</a>\r\n");
      out.write("		</button>\r\n");
      out.write("\r\n");
      out.write("		<!-- Nav -->\r\n");
      out.write("		<nav id=\"nav\">\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li><a href=\"Main.jsp\">Home</a></li>\r\n");
      out.write("				<li class=\"current\"><a href=\"Calculator.jsp\">계산기</a></li>\r\n");
      out.write("				<li><a href=\"BoardMain.jsp\">게시판</a></li>\r\n");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("		</nav>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Main -->\r\n");
      out.write("	<section class=\"wrapper style1\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row gtr-200\">\r\n");
      out.write("				<div class=\"col-4 col-12-narrower\">\r\n");
      out.write("					<div id=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("						<!-- Sidebar -->\r\n");
      out.write("\r\n");
      out.write("						<section></section>\r\n");
      out.write("\r\n");
      out.write("						<section>\r\n");
      out.write("\r\n");
      out.write("							<footer> </footer>\r\n");
      out.write("						</section>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-8  col-12-narrower imp-narrower\">\r\n");
      out.write("					<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("						<!-- Content -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<table>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td><h2>계산 결과</h2></td>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</table>\r\n");
      out.write("\r\n");
      out.write("						<table>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td colspan=\"2\" style=\"font-size: 30px;\"><strong>");
      out.print(user_info.getName());
      out.write("</strong>님의 예상 초기 자본결과 입니다.\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td colspan=\"2\"><br>\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td colspan=\"2\">\r\n");
      out.write("								<strong>종자</strong> ");
      if (_jspx_meth_fmt_005fformatNumber_005f0(_jspx_page_context))
        return;
      out.write("원\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td colspan=\"2\"><br>\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td colspan=\"2\">\r\n");
      out.write("								<strong>토지</strong> : ");
      if (_jspx_meth_fmt_005fformatNumber_005f1(_jspx_page_context))
        return;
      out.write("원\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td colspan=\"2\"><br>\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td colspan=\"2\">\r\n");
      out.write("								<strong>농약&비료</strong> : ");
      if (_jspx_meth_fmt_005fformatNumber_005f2(_jspx_page_context))
        return;
      out.write("원\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td colspan=\"2\"><br>\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td colspan=\"2\">\r\n");
      out.write("								<strong>농기계</strong> : ");
      if (_jspx_meth_fmt_005fformatNumber_005f3(_jspx_page_context))
        return;
      out.write("원\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td colspan=\"2\"><br>\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td colspan=\"2\">\r\n");
      out.write("								<strong>총 합계</strong> : ");
      if (_jspx_meth_fmt_005fformatNumber_005f4(_jspx_page_context))
        return;
      out.write("원\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr id=\"tr1\">\r\n");
      out.write("								<td>&nbsp;</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td><a href=\"Main.jsp\"><button>메인</button></a></td>\r\n");
      out.write("								<td><a href=\"Calculator.jsp\" id=\"calmove\"><button>계산화면</button></a></td>\r\n");
      out.write("							</tr>\r\n");
      out.write("\r\n");
      out.write("						</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("	<!-- Scripts -->\r\n");
      out.write("	<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/jquery.dropotron.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/browser.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/util.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
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

  private boolean _jspx_meth_fmt_005fformatNumber_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    boolean _jspx_th_fmt_005fformatNumber_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatNumber_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatNumber_005f0.setParent(null);
      // /CalResult.jsp(132,28) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sum.get(0)}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /CalResult.jsp(132,28) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f0.setPattern("#,###");
      int _jspx_eval_fmt_005fformatNumber_005f0 = _jspx_th_fmt_005fformatNumber_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatNumber_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f0);
      _jspx_th_fmt_005fformatNumber_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatNumber_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatNumber_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatNumber_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    boolean _jspx_th_fmt_005fformatNumber_005f1_reused = false;
    try {
      _jspx_th_fmt_005fformatNumber_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatNumber_005f1.setParent(null);
      // /CalResult.jsp(141,30) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sum.get(1)}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /CalResult.jsp(141,30) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f1.setPattern("#,###");
      int _jspx_eval_fmt_005fformatNumber_005f1 = _jspx_th_fmt_005fformatNumber_005f1.doStartTag();
      if (_jspx_th_fmt_005fformatNumber_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f1);
      _jspx_th_fmt_005fformatNumber_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatNumber_005f1, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatNumber_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatNumber_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    boolean _jspx_th_fmt_005fformatNumber_005f2_reused = false;
    try {
      _jspx_th_fmt_005fformatNumber_005f2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatNumber_005f2.setParent(null);
      // /CalResult.jsp(150,33) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sum.get(2)}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /CalResult.jsp(150,33) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f2.setPattern("#,###");
      int _jspx_eval_fmt_005fformatNumber_005f2 = _jspx_th_fmt_005fformatNumber_005f2.doStartTag();
      if (_jspx_th_fmt_005fformatNumber_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f2);
      _jspx_th_fmt_005fformatNumber_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatNumber_005f2, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatNumber_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatNumber_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    boolean _jspx_th_fmt_005fformatNumber_005f3_reused = false;
    try {
      _jspx_th_fmt_005fformatNumber_005f3.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatNumber_005f3.setParent(null);
      // /CalResult.jsp(159,31) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sum.get(3)}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /CalResult.jsp(159,31) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f3.setPattern("#,###");
      int _jspx_eval_fmt_005fformatNumber_005f3 = _jspx_th_fmt_005fformatNumber_005f3.doStartTag();
      if (_jspx_th_fmt_005fformatNumber_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f3);
      _jspx_th_fmt_005fformatNumber_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatNumber_005f3, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatNumber_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatNumber_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    boolean _jspx_th_fmt_005fformatNumber_005f4_reused = false;
    try {
      _jspx_th_fmt_005fformatNumber_005f4.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatNumber_005f4.setParent(null);
      // /CalResult.jsp(168,32) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sum.get(4)}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /CalResult.jsp(168,32) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f4.setPattern("#,###");
      int _jspx_eval_fmt_005fformatNumber_005f4 = _jspx_th_fmt_005fformatNumber_005f4.doStartTag();
      if (_jspx_th_fmt_005fformatNumber_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f4);
      _jspx_th_fmt_005fformatNumber_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatNumber_005f4, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatNumber_005f4_reused);
    }
    return false;
  }
}