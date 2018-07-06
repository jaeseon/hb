<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%= request.getContextPath() %>"></c:set>

<!-- HEADER START -->
<div class="header-wrap">
	<div class="nav-bg"></div>
	<div class="header-details-1-wrap">
		<div class="header-details-1-container">
			<span>Korea Best Electronic Technology</span>
			<div class="customer">
				<a href="#">고객센터</a>
			</div>
		</div>
	</div>
	<div class="header-details-2-wrap">
		<div class="header-details-2-container">
			<a href="${ contextPath }"><img src="/resources/src/images/logo-hebron.JPG"></a>
			<div class="header-menu">
				<ul>
					<li><a href="#">HOME</a></li>
					<li><a href="#">회사소개</a>
						<ul class="nav_depth">
							<li><a href="./company/index.html">회사소개</a></li>
							<li><a href="#">주요실적</a></li>
							<li><a href="#">사업분야</a></li>
							<li><a href="#">조직</a></li>
						</ul></li>
					<li><a href="#">제품소개</a>
						<ul class="nav_depth">
							<li><a href="#">핵심기술</a></li>
							<li><a href="#">생산제품</a></li>
							<li><a href="#">생산장비</a></li>
							<li><a href="#">생산시설</a></li>
							<li><a href="#">생산기계내역</a></li>
						</ul></li>
					<li><a href="#">회사문화</a>
						<ul class="nav_depth">
							<li><a href="#">경영철학</a></li>
							<li><a href="#">갤러리</a></li>
						</ul></li>
					<li><a href="#">찾아오시는 길</a></li>
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- HEADER END -->