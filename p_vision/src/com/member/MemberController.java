package com.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Controller;

public class MemberController implements Controller {
	String work = "";
	MemberLogic mLogic = new MemberLogic();
	public MemberController(String work) {
		this.work = work;
	}

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = "";
		if("check_email".equals(work)) {//이메일 중복확인
			String check_email = req.getParameter("check_email");
			check_email = mLogic.check_email(check_email);
			req.setAttribute("check_email", check_email);
			path = "forward:/member/check_email.jsp";
		}
		else if("cert_email".equals(work)) {//이메일 인증
			String cert_email = req.getParameter("cert_email");
			cert_email = mLogic.cert_email(cert_email);
			req.setAttribute("cert_email", cert_email);
			path = "forward:/member/cert_email.jsp";
		}
		else if("find_id".equals(work)) {//아이디 찾기
			String find_id = req.getParameter("find_id");
			find_id = mLogic.find_id(find_id);
			req.setAttribute("find_id", find_id);
			path = "forward:/member/find_id.jsp";
		}
		else if("find_pw".equals(work)) {//비밀번호 재설정
			String find_pw = req.getParameter("find_pw");
			find_pw = mLogic.find_pw(find_pw);
			req.setAttribute("find_pw", find_pw);
			path = "forward:/member/find_pw.jsp";
		}
		else if("register".equals(work)) {//회원가입
			String register = req.getParameter("register");
			register = mLogic.register(register);
			req.setAttribute("register", register);
			path = "forward:/member/register.jsp";
		}
		return path;
	}
}
