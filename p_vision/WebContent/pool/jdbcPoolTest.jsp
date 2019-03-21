<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.sql.*, javax.naming.*, java.sql.*"%>
<%
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/dbPool");
		String sql = "SELECT deptno, dname FROM dept";
		con = ds.getConnection();
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()){
			out.print("부서번호 :"+rs.getInt("deptno")+",부서이름 :"+rs.getString("dname"));
		}
	}catch(Exception e){
		e.printStackTrace();
	}
%>