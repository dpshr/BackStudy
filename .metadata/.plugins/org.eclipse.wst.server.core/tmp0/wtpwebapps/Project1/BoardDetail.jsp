<%@page import="model.LikeDTO"%>
<%@page import="model.LikeDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.CommentDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.MemberDTO"%>
<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@page import="model.BoardDAO"%>
<%@page import="model.BoardVO"%>
<%@page import="model.CommentVO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<!--
	Arcana by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>
<title>농부 초기자본계산사이트</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<style type="text/css">
img.contentimg {
	width: 50%;
	height: 50%;
}

.title {
	font-size: 72px;
	background: linear-gradient(to bottom, green, yellow);
	-webkit-background-clip: text;
	-webkit-text-fill-color: transparent;
}
h1 {
	font-size: 30px;
	color: black;
}
</style>
</head>
<body class="is-preload">
	<%
	MemberDTO user_info = (MemberDTO) session.getAttribute("user_info");
	
	%>
	<div id="page-wrapper">

		<!-- Header -->
		<div id="header">

			<!-- Logo -->
			<h1>
				<a href="Main.jsp" class="title"> <Strong>농부樂</Strong></a>
			</h1>

			<!-- Nav -->
			<nav id="nav">
				<ul>
					<li><a href="Main.jsp">Home</a></li>
					<li><a href="Calculator.jsp">계산기</a></li>
					<li class="current"><a href="BoardMain.jsp">게시판</a></li>
					
				</ul>
			</nav>

		</div>

		<!-- Main -->
		<section class="wrapper style1">
			<div class="container">
				<div class="row gtr-200">
					<div class="col-3 col-12-narrower">
						<div id="sidebar1">

							<!-- Sidebar 1 -->

							

						</div>
					</div>
					<div class="col-6 col-12-narrower imp-narrower">
						<div id="content">

							<!-- Content -->

							<article>
								<header>
									<h2>자유게시판</h2>
								</header>

								<span class="image featured"><img src="images/banner.jpg"
									alt="" /></span>

								<%
								int num = Integer.parseInt(request.getParameter("num"));
								BoardVO board = new BoardDAO().detailBoard(num);

								ArrayList<CommentVO> cvo = new CommentDAO().allcoment(board.getB_idx());
								pageContext.setAttribute("cvo", cvo);
								LikeDTO dto = new LikeDTO(board.getB_idx(),user_info.getId());
								LikeDTO dto1 = new LikeDTO(board.getB_idx());
								int like_cnt = new LikeDAO().like_count(dto1);
								%>
								<div id="board">
									<table>
										<tr>
											<td><strong>제목</strong></td>
											<td><%=board.getTitle()%></td>
										</tr>
										<tr>
											<td><strong>작성자</strong></td>
											<td><%=board.getId()%></td>
										</tr>
										
										<tr>
											<td colspan="2"><br></td>
										</tr>
										<hr>
										<tr>
											<td colspan="2">
												<fieldset><legend>Content</legend>
												<p style="font-size: 15px;"> <br> <%=board.getContent()%><br></p>
												</fieldset>
												
											</td>
										</tr>
									</table>
									<table>
										<tr>
											<td> <strong>작성자</strong> </td>
											<td><strong>댓글</strong></td>
											<td><strong>삭제</strong></td>
										</tr>
										<c:forEach var="b" items="${cvo}">
											<tr>
												<td>${b.mem_id }</td>
												<td>${b.comment_content }</td>
												<td><a
													href="CommentDel.do?com_id=${b.comment_id }&mem_id=<%=user_info.getId()%>">삭제</a></td>
											</tr>
										</c:forEach>
									</table>
									
									
									<button>
									<a href="LikeCon.do?b_idx=<%=board.getB_idx()%>&mem_id=<%= user_info.getId()%>">좋아요</a>
									<p><%=like_cnt %></p></button>
											
									<%
									if (user_info != null) {
									%>
									<form action="CommentWrite.do" method="post">
										<table>
											<tr>
												<td >댓글<input type="hidden" NAME="mem_id"
													value="<%=user_info.getId()%>"> <input
													type="hidden" NAME="b_idx" value="<%=board.getB_idx()%>">
												</td>
												<td><input type="text" maxlength='400' name="content" ></td>
												<td><input type="submit" value="작성하기" ></td>
											</tr>
										</table>
									</form>


									

									<%
									}else{
									%>
									<form action="" method="post">
										<table>
											<tr>
												<td>댓글
												</td>
												<td><input type="text" maxlength='400' name="content" placeholder="로그인하세요"></td>
												<td><input type="submit" value="작성하기"></td>
											</tr>
										</table>
									</form>
									
									<%
									}
									%>
									<button>
										<a href="BoardMain.jsp">뒤로가기</a>
									</button>

								</div>
							</article>

						</div>
					</div>
					<div class="col-3 col-12-narrower">
						<div id="sidebar2">

							<!-- Sidebar 2 -->

							

						</div>
					</div>
				</div>
			</div>
		</section>



		<!-- Scripts -->
		<script src="assets/js/jquery.min.js"></script>
		<script src="assets/js/jquery.dropotron.min.js"></script>
		<script src="assets/js/browser.min.js"></script>
		<script src="assets/js/breakpoints.min.js"></script>
		<script src="assets/js/util.js"></script>
		<script src="assets/js/main.js"></script>

</body>
</html>