<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String rosterCode = (String) session.getAttribute("Roster_Code");
	
	if (rosterCode == null || rosterCode.equals("")) {
		response.sendRedirect("/myOffice");
			
		return;
	}
%>