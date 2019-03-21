<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map, java.util.List" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ page import="com.google.gson.Gson" %>
<%
	List<Map<String, Object>> allCards = (List<Map<String, Object>>)request.getAttribute("allCards");
	if(allCards!=null){
		Gson g = new Gson();
		String jsonFor = g.toJson(allCards);
		out.print(jsonFor);
	}
%>