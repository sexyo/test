<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.net.*, java.util.Date" %>
<%
// getCaptchaNkey에서 키값을 받아와 이미지를 생성(다운로드:필요없다) 
// 	캡챠이미지 정보는 네이버 서버에 있을 것이다. 네이버 서버에 가지고 있는 
	String clientId = "WyFjQxrAcfCPsae03xMy";//애플리케이션 클라이언트 아이디값";
	String clientSecret = "0fRbH5vf_b";//애플리케이션 클라이언트 시크릿값";
	String key = null;
	try {
/* 키 발급 관련 코드 입양시작 */
		String code = "0"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
	    String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code;
	    URL url = new URL(apiURL);
	    HttpURLConnection con = (HttpURLConnection)url.openConnection();
	    con.setRequestMethod("GET");
	    con.setRequestProperty("X-Naver-Client-Id", clientId);
	    con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
	    int responseCode = con.getResponseCode();
	    BufferedReader br;
	    if(responseCode==200) { // 정상 호출
	        br = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    } else {  // 에러 발생
	        br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
	    }
            String inputLine;
            StringBuffer res = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                res.append(inputLine);
	    }
	    br.close();
	    key= res.toString();
	    key= key.substring(8,24);
	    
	    String imgURL = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
	    out.print(imgURL);
	} catch(Exception e){
		out.println(e);
	}
%>