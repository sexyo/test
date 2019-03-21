<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map, java.util.List" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ page import="com.google.gson.Gson" %>
<%
	List<Map<String, Object>> communityCard = (List<Map<String, Object>>)request.getAttribute("communityCard");
	if(communityCard!=null){
		Gson g = new Gson();
		String jsonFor = g.toJson(communityCard);
		out.print(jsonFor);
	}
%>