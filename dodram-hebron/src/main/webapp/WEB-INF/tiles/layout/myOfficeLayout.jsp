<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
<head>
	<tiles:insertAttribute name="meta" />
</head>
<body>
	<%
		String adminLogin = (String) session.getAttribute("admin-login");
		
		if (adminLogin == null || adminLogin.equals("")) {
			response.sendRedirect("/myOffice");
			
			return;
		}
	%>
	<tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="contents"/>
</body>
</html>