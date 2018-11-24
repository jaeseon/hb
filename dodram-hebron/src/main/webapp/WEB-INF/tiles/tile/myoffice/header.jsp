<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%
	Date now = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy. M. dd. aaa h:mm:ss");
%>

<div class="header-wrap">
	<div class="header">
		<div class="nav">
			<ul>
				<li>
					<a href="/myOffice">메인</a>
				</li><!-- 
				-->	<li>
					<a>관리자<span class="caret"></span></a>
					<ul class="sub-menu">
						<li><a href="/myOffice/intro">회사소개 수정</a></li>
						<li><a href="#">로그인 기록보기</a></li>
						<li><a href="#">관리자 계정관리</a></li>
					</ul>
				</li><!--
				--><li>
					<a>회원관리<span class="caret"></span></a>
					<ul class="sub-menu">
						<li><a href="#">회원관리</a></li>
						<li><a href="#">등급관리</a></li>
					</ul>
				</li><!--
				--><li>
					<a>공지사항<span class="caret"></span></a>
					<ul class="sub-menu">
						<li><a href="#">공지사항 관리</a></li>
					</ul>
				</li><!--
				--><li>
					<a>게시판<span class="caret"></span></a>
					<ul class="sub-menu">
						<li><a href="/myOffice/board/QA">문의하기 관리</a></li>
						
						<li><a href="#">메일 관리</a></li>
					</ul>
				</li>
			</ul>
			
			<div class="nav-info">
				Login: <span>-명</span>
				<span class="server-time">Server: <%= sdf.format(now) %></span>
			</div>
			
			<div class="nav-logout">
				<a href="/admin_logout">Logout</a>
			</div>
		</div>
	</div>
</div>
