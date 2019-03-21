package com.membership;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Controller;

public class MembershipController implements Controller {
	MembershipLogic msLogic = new MembershipLogic();
	String work = "";
	public MembershipController(String work) {
		this.work = work;
	}

	@Override
	public Object execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = "";
		
		 if("mshipList".equals(work)){//멤버쉽리스트
			List<Map<String,Object>> mshipList = null;
			mshipList =msLogic.mshipList();
			req.setAttribute("mshipList", mshipList);
			path = "forward:/membership/mshipList.jsp";
		}
		else if("mshipHistory".equals(work)) {//멤버쉽적립내역
			List<Map<String,Object>> mshipHistory = null;
			mshipHistory = msLogic.mshipHistory();
			req.setAttribute("mshipHistory",mshipHistory);
			path = "forward:/membership/mshipHistory.jsp";
		}
		else if("mshipAdd".equals(work)) {//멤버쉽추가
			List<Map<String,Object>> mshipAdd = null;
			mshipAdd = msLogic.mshipAdd();
			req.setAttribute("mshipAdd", mshipAdd);
			path = path = "forward:/membership/mshipAdd.jsp";
		}
		else if("mshipBenefit".equals(work)){//멤버쉽혜택확인
			List<Map<String,Object>> mshipBenefit = null;
			mshipBenefit = msLogic.mshipBenefit();
			req.setAttribute("mshipBenefit", mshipBenefit);
			path = "forward:/membership/mshipBenefit.jsp";
		}
		return path;
	}

}
