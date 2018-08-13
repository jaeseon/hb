<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.dodram_hebron.vo.ContactBoardVO"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	// List<ContactBoardVO> contactBoardList = (ArrayList) request.getAttribute("ContactBoardList");
%>

<div class="container">
	<div class="big-box-container">
		<div class="big-box-title">문의하기</div>
		<div class="big-box-contents">
			<div class="contents-items">
				<form class="QA-form" action="" method="post">
					<select>
						<option>이름</option>
						<option>이메일</option>
					</select>
					<input type="text" name="search">
					<input type="button" value="검색하기">
				</form>
				
				<c:forEach items="${ ContactBoardList }" var="boardList">
					<div class="row-container">
						<div class="img-box">
							<img src="/resources/src/images/img-avatar.png">
						</div>
						<div class="info-box">
							<span>${ boardList.user_name }</span><br />
							<span>${ boardList.reg_date }</span><br />
							<p>
								${ boardList.user_ques }
							</p>
						</div>
						<div class="send-box">
							<form class="answer-form" action="" method="post">
								<textarea rows="6"></textarea><br />
								<input type="button" onclick="" value="답변하기">
							</form>
						</div>
						<div class="delete-btn">삭제</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>
</div>