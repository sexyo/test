package com.rewards;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Controller;

public class RewardsController implements Controller {
	RewardsLogic reLogic = new RewardsLogic();
	String work = "";
	public RewardsController(String work) {
		this.work = work;
	}

	@Override
	public Object execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = "";
		
		 if("reward_Main".equals(work)){//리워즈 메인화면
			List<Map<String,Object>> reward_Main = null;
			reward_Main =reLogic.reward_Main();
			req.setAttribute("reward_Main", reward_Main);
			path = "forward:/rewards/reward_Main.jsp";
		}
		else if("myPoint".equals(work)) {//내포인트
			List<Map<String,Object>> myPoint = null;
			myPoint = reLogic.myPoint();
			req.setAttribute("myPoint",myPoint);
			path = "forward:/rewards/myPoint().jsp";
		}
		else if("exCoupon".equals(work)) {//쿠폰으로 교환하기
			List<Map<String,Object>> exCoupon = null;
			exCoupon = reLogic.exCoupon();
			req.setAttribute("exCoupon", exCoupon);
			path = path = "forward:/rewards/exCoupon.jsp";
		}
		else if("recentPoint".equals(work)){//최근포인트 사용내역
			List<Map<String,Object>> recentPoint = null;
			recentPoint = reLogic.recentPoint();
			req.setAttribute("recentPoint", recentPoint);
			path = "forward:/rewards/recentPoint.jsp";
		}
		else if("removePoint".equals(work)) {//포인트 소멸기능
			List<Map<String,Object>> removePoint = null;
			removePoint = reLogic.removePoint();
			req.setAttribute("removePoint", removePoint);
			path = "forward:/rewards/removePoint.jsp";
		}
		else if("myCoupon".equals(work)) {//내 쿠폰함
			List<Map<String,Object>> myCoupon = null;
			myCoupon = reLogic.myCoupon();
			req.setAttribute("myCoupon", myCoupon);
			path = "forward:/rewards/myCoupon.jsp";
		}
		else if("pointSave".equals(work)) {//포인트 적립하기
			List<Map<String,Object>> pointSave = null;
			pointSave = reLogic.pointSave();
			req.setAttribute("pointSave", pointSave);
			path = "forward:/rewards/pointSave.jsp";
		}
		return path;
	}

}
