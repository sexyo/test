<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function check_email(){
	location.href="./check_email?email=heehee"
		}
</script>
</head>
<body>
<input type="button" value="중복확인" onClick="check_email()">
<br>
</body>
</html>