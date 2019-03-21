<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>네이버가 제공하는 캡챠이미지 출력하기</title>
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript">
	var img2 = "http://192.168.0.211:9001/naver/captcha/1550024433157.jpg";
	function methodA(){
		$("#captchaIMG").attr("src",img2);
	}
	function getCaptcha(){
		$.ajax({
			type:"get"
			,url:"getCaptchaImage.jsp"
			,success:function(result){
				//alert(result);
				$("#captchaIMG").attr("src",result);
			}
		});
	}
</script>
</head>
<body>
<img id="captchaIMG" src="http://192.168.0.211:9001/naver/captcha/1550024505458.jpg" width="200px" height="90px">
<input type="button" value="새로고침" onClick="getCaptcha()">
</body>
</html>