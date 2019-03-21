package com.plan;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.pojo.Controller;

public class PlannerController implements Controller {
	Logger logger = Logger.getLogger(PlannerController.class);
	PlanLogic pLogic = new PlanLogic();
	String work = "";
	public PlannerController(String work) {
		this.work = work;
	}

	@Override
	public Object execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = "";
		
		 if("spendingMonth".equals(work)){//이번달 지출합계
			 String spendingMonth = "";
			 logger.info("ㅋㅋ");
			 spendingMonth =pLogic.spendingMonth();
			req.setAttribute("spendingMonth", spendingMonth);
			path = "forward:/plan/spendingMonth.jsp";
		}
		else if("spendingCategory".equals(work)) {//카테고리별 지출
			List<Map<String,Object>> spendingCategory = null;
			spendingCategory = pLogic.spendingCategory();
			req.setAttribute("spendingCategory",spendingCategory);
			path = "forward:/plan/spendingCategory.jsp";
		}
		else if("payMethod".equals(work)) {//결제수단별 지출 및 예산
			List<Map<String,Object>> payMethod = null;
			payMethod = pLogic.payMethod();
			req.setAttribute("payMethod", payMethod);
			path = path = "forward:/plan/payMethod.jsp";
		}
		else if("spendingStore".equals(work)){//매장별 지출
			List<Map<String,Object>> spendingStore = null;
			spendingStore = pLogic.spendingStore();
			req.setAttribute("spendingStore", spendingStore);
			path = "forward:/plan/spendingStore.jsp";
		}
		else if("total_Month".equals(work)) {//총지출내역(월)
			List<Map<String,Object>> total_Month = null;
			total_Month = pLogic.total_Month();
			req.setAttribute("total_Month", total_Month);
			path = "forward:/plan/total_Month.jsp";
		}
		else if("total_Week".equals(work)) {//총지출내역(주)
			List<Map<String,Object>> spendingMonth = null;
			spendingMonth = pLogic.total_Week();
			req.setAttribute("spendingMonth", spendingMonth);
			path = "forward:/plan/total_Week.jsp";
		}
		else if("total_Day".equals(work)) {//총지출내역(일-시간별)
			List<Map<String,Object>> total_Day = null;
			total_Day = pLogic.total_Day();
			req.setAttribute("total_Day", total_Day);
			path = "forward:/plan/total_Day.jsp";
		}
		else if("spendingList".equals(work)) {//지출내역
			List<Map<String,Object>> spendingList = null;
			spendingList = pLogic.spendingList();
			req.setAttribute("spendingList", spendingList);
			path = "forward:/plan/spendingList.jsp";
		}
		else if("total_Budget".equals(work)) {//총 예산설정
			List<Map<String,Object>> total_Budget = null;
			total_Budget = pLogic.total_Budget();
			req.setAttribute("total_Budget", total_Budget);
			path = "forward:/plan/total_Budget.jsp";
		}
		else if("plan_Budget".equals(work)) {//카드별 예산설정
			List<Map<String,Object>> plan_Budget = null;
			plan_Budget = pLogic.card_Budget();
			req.setAttribute("plan_Budget", plan_Budget);
			path = "forward:/plan/plan_Budget.jsp";
		}
		else if("otherUsersSpending".equals(work)) {//다른사용자지출(그룹별)
			List<Map<String,Object>> otherUsersSpending = null;
			otherUsersSpending = pLogic.otherUsersSpending();
			req.setAttribute("otherUsersSpending", otherUsersSpending);
			path = "forward:/plan/otherUsersSpending.jsp";
		}
		
		return path;
	}

}
