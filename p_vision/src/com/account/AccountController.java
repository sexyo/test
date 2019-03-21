package com.account;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Controller;

public class AccountController implements Controller {
	AccountLogic aLogic = new AccountLogic();
	String work = "";
	public AccountController(String work) {
		this.work = work;
	}

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = "";
		if("accountList".equals(work)) {//계좌리스트
			List<Map<String,Object>> accountList = null;
			accountList = aLogic.accountList();
			req.setAttribute("accountList", accountList);
			path = "forward:/account/accountList.jsp";
		}
		else if("accountAdd".equals(work)) {//계좌추가
			List<Map<String,Object>> accountAdd = null;
			accountAdd = aLogic.accountAdd();
			req.setAttribute("accountAdd", accountAdd);
			path = "forward:/account/accountAdd.jsp";
		}
		return path;
	}
		

}



















