<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "java.util.List, java.util.Map, com.google.gson.Gson" %>

 <%@ page %>
<%
		String spendingMonth = (String)request.getAttribute("spendingMonth");
		out.print(spendingMonth);

%>

