<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="container">
<%
	Date now = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일 E요일");
%>
	<h3><%= sdf.format(now) %></h3>
	<div class="big-box-wrap">
		<div class="big-box-container">
			<div class="big-box-title">금일 회원가입</div>
			<div class="small-box-contents">
				<div class="contents-items">
					데이터가 없습니다.
				</div>
			</div>
		</div>
		<div class="big-box-container">
			<div class="big-box-title">금일 문의내용</div>
			<div class="small-box-contents">
				<div class="contents-items QA-items">
					데이터가 없습니다.
				</div>
			</div>
		</div>
	</div>
	<div class="big-box-wrap">
		<div class="big-box-container">
			<div class="big-box-title">업데이트 리포트</div>
				<div class="small-box-contents">
				<div class="contents-items">
					<c:forEach items="${ updateReportList }" var="updateList">
						<div>[${ updateList.type}] ${ updateList.title } / <fmt:formatDate value="${ updateList.update_date }" pattern="MM-dd" /></div><br/>
					</c:forEach>
				</div>
			</div>
		</div>
		<div class="big-box-container">
			<div class="big-box-title">금일 방문자 통계</div>
				<div class="small-box-contents">
				<div class="contents-items">
					도드람 접속 인원 :
					<br />헤브론테크 접속 인원 : 
					<br/>인기 페이지 : 
				</div>
			</div>
		</div>
	</div>
</div>

