<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>title</title>
</head>
<body>
	<table>
		<tr>
			<th>아이디</th>
			<th>이름</th>
		</tr>
		<c:forEach items="${ memberList }" var="member">
			<tr>
				<td>${ member.id }</td>
				<td>${ member.name }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>