package com.plan;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class PlanLogic {
	PlanDao pDao = new PlanDao();
	Logger logger = Logger.getLogger(PlanLogic.class);

	public String spendingMonth() {
		logger.info("나오냐");
		String spendingMonth = null;
		spendingMonth = pDao.spendingMonth();
		return spendingMonth;
	}

	public List<Map<String, Object>> spendingCategory() {
		List<Map<String,Object>> spendingCategory = null;
		spendingCategory = pDao.spendingCategory();
		return spendingCategory;
	}

	public List<Map<String, Object>> payMethod() {
		List<Map<String,Object>> payMethod = null;
		payMethod = pDao.payMethod();
		return payMethod;
	}

	public List<Map<String, Object>> spendingStore() {
		List<Map<String,Object>> spendingStore = null;
		spendingStore = pDao.spendingStore();
		return spendingStore;
	}

	public List<Map<String, Object>> total_Month() {
		List<Map<String,Object>> total_Month = null;
		total_Month = pDao.total_Month();
		return total_Month;
	}

	public List<Map<String, Object>> total_Week() {
		List<Map<String,Object>> total_Week = null;
		total_Week = pDao.total_Week();
		return total_Week;
	}

	public List<Map<String, Object>> total_Day() {
		List<Map<String,Object>> total_Day = null;
		total_Day = pDao.total_Day();
		return total_Day;
	}

	public List<Map<String, Object>> spendingList() {
		List<Map<String,Object>> spendingList = null;
		spendingList = pDao.spendingList();
		return spendingList;
	}

	public List<Map<String, Object>> total_Budget() {
		List<Map<String,Object>> total_Budget = null;
		total_Budget = pDao.total_Budget();
		return total_Budget;
	}

	public List<Map<String, Object>> card_Budget() {
		List<Map<String,Object>> card_Budget = null;
		card_Budget = pDao.card_Budget();
		return card_Budget;
	}

	public List<Map<String, Object>> otherUsersSpending() {
		List<Map<String,Object>> otherUsersSpending = null;
		otherUsersSpending = pDao.otherUsersSpending();
		return otherUsersSpending;
	}

}
