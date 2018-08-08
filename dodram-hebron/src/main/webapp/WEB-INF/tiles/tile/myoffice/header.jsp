<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String adminLogin = (String) session.getAttribute("admin-login");
	
	if (adminLogin == null || adminLogin.equals("")) {
		response.sendRedirect("/myOffice");
			
		return;
	}
%>

<div class="header">
	<div class="nav">
		<ul>
			<li>
				<a href="#">관리자<span class="caret"></span></a>
				<ul>
					<li>로그인기록보기</li>
					<li>관리자계정관리</li>
					
				</ul>
			</li><!--
			--><li><a href="#">회원관리<span class="caret"></span></a></li><!--
			--><li><a href="#">공지사항<span class="caret"></span></a></li><!--
			--><li><a href="#">게시판<span class="caret"></span></a></li>
		</ul>
	</div>
</div>