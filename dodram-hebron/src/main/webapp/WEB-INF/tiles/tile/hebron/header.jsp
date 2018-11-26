<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%= request.getContextPath() %>"></c:set>

<!-- HEADER START -->
<div class="wrap">
	<div class="header-wrap">
		<div class="nav-bg"></div>
		<div class="header-details-1-wrap">
			<div class="header-details-1-container">
				<span>Korea Best Electronic Technology</span>
				<div class="customer">
					<a href="/">메인</a>
					<span style="padding: 0 20px;">|</span>
					<a href="/hebron/question">고객센터</a>
				</div>
			</div>
		</div>
		<div class="header-details-2-wrap">
			<div class="header-details-2-container">
				<a href="/hebron"><img src="/resources/src/images/logo-hebron.jpeg"></a>
				<div class="header-menu">
					<ul>
						<li><a href="/hebron">HOME</a></li>
						<li><a href="/hebron/introduction">회사소개</a>
							<ul class="nav_depth">
								<li><a href="/hebron/introduction">회사소개</a></li>
								<li><a href="/hebron/introduction/organization">조직 및 현황</a></li>
							</ul>
						</li>
						<li><a href="/hebron/f_process">공정과정</a>
							<ul class="nav_depth">
								<li><a href="/hebron/f_process">판금공정</a></li>
								<li><a href="/hebron/s_process">도장공정</a></li>
							</ul>
						</li>
						<li><a href="/hebron/v_product">생산제품</a>
							<ul class="nav_depth">
								<li><a href="/hebron/v_product">생산설비</a></li>
								<li><a href="/hebron/f_product">전기, 계장</a></li>
								<li><a href="/hebron/s_product">전자, 통신</a></li>
								<li><a href="/hebron/t_product">오븐</a></li>
								<li><a href="/hebron/o_product">장비</a></li>
							</ul>
						</li>
						<li><a href="/hebron/hardware">기계설비</a></li>
						<li><a href="/hebron/visit">찾아오시는 길</a></li>
						<li><a href="/hebron/question">제품&견적 문의</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- HEADER END -->