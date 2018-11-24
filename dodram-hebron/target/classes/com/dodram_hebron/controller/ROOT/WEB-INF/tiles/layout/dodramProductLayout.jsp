<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
<head>
	<tiles:insertAttribute name="meta" />
</head>
<body>
	<tiles:insertAttribute name="header"/>
	<div class="section">
		<div class="article">
			<tiles:insertAttribute name="nav-product"/>
			<tiles:insertAttribute name="contents"/>
		</div>
	</div>
	<tiles:insertAttribute name="footer"/>
</body>
</html>