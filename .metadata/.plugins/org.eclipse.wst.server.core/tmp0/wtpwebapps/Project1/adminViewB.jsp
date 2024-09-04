<%@page import="model.BoardDAO"%>
<%@page import="model.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.MemberDTO"%>
<%@ page import="model.MemberDAO"%>
<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<!--
	Arcana by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>
<title>농초계-관리자 페이지</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<style type="text/css">
button#logout {
	margin-left: 1000px;
	margin-bottom: 20px;
	background-color: #9acd32;
}

h1 {
	font-size: 30px;
	color: black;
}

a#logo {
	color: black;
	padding-bottom: 15px;
}

a#logout {
	color: black;
}
.title{
 	font-size: 72px;
  	background: linear-gradient(to bottom, green, yellow);
  	-webkit-background-clip: text;
 	-webkit-text-fill-color: transparent;
}
</style>
</head>
<body class="is-preload">
	<%
	MemberDTO user_info = (MemberDTO) session.getAttribute("user_info");
	
	%>
<c:set var="memList" value="${MemberDAO.selectMember()}">
 </c:set>

	<div id="page-wrapper"></div>

	<!-- Header -->
	<div id="header">

		<!-- Logo -->
		<h1>
			<a href="Main.jsp" class="title"> <Strong>농부樂</Strong></a>
		</h1>

		<button id="logout">
			<a href="LogoutCon.do" id="logout">로그아웃</a>
		</button>
		
		<!-- Nav -->
		<nav id="nav">
			<ul>
				<li><a href="Main.jsp">Home</a></li>
				<li><a href="Calculator.html">계산기</a></li>
				<li><a href="BoardMain.jsp">게시판</a></li>
				
			</ul>
		</nav>

	</div>

	<!-- Main -->
	<section class="wrapper style1">
		<div class="container">
			<div class="row gtr-200">
				<div class="col-4 col-12-narrower">
					<div id="sidebar">

						<!-- Sidebar -->

						<section></section>

						<section>
							<h3>마이페이지</h3>
							<ul class="links">
								<li><a href="adminpage.jsp">회원 정보 조회</a></li>

								<li><a href="adminViewB.jsp">게시물 조회</a></li>
								<li><a href="adminViewC.jsp">댓글조회</a></li>
								<li><a href="#">공지사항 작성하기</a></li>
							</ul>
							<footer> </footer>
						</section>

					</div>
				</div>
				<div class="col-8  col-12-narrower imp-narrower">
					<div id="content">

						<!-- Content -->

						<article>
							<header>
								<h2>게시물 전체 조회/삭제</h2>
							</header>

							<% ArrayList<BoardVO> boards= new BoardDAO().allBoard();
									pageContext.setAttribute("boards",boards);
									%>
							<table>
										<tr>
											<td>게시물 번호</td>
											<td>제목</td>
											<td>작성자</td>
											<td>시간</td>
											<td>삭제<td>
										</tr>
										<!--varStatus: 상태변수 -->	
										<c:forEach var="b" items="${boards}" varStatus="s">
											<tr>
												<td>${s.count}</td>
												<td><a href="BoardDetail.jsp?num=${b.b_idx}">${b.title}</a></td>
												<td>${b.id}</td>
												<td>${b.b_date}</td>
												<td> <a href="adminBoardDel.do?num=${b.b_idx}">삭제</a></td>
											</tr>
										</c:forEach>

									</table>

							

						</article>

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