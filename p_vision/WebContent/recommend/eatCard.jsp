<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map, java.util.List" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ page import="com.google.gson.Gson" %>
<%
	List<Map<String, Object>> eatCard = (List<Map<String, Object>>)request.getAttribute("eatCard");
	if(eatCard!=null){
		Gson g = new Gson();
		String jsonFor = g.toJson(eatCard);
		out.print(jsonFor);
	}
%>