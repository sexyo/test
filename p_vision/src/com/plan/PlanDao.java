package com.plan;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.util.MyBatisCommonFactory;

public class PlanDao {
	Logger logger = Logger.getLogger(PlanDao.class);
	SqlSessionFactory sqlSessionFactory = null;
	SqlSession sqlSession =null;
	public PlanDao() {
		sqlSessionFactory = MyBatisCommonFactory.getSqlSessionFactory(); 
		sqlSession = sqlSessionFactory.openSession();
	}
	public String spendingMonth() {
		logger.info("시벌왜안나와");
		String spendingMonth = "";
		spendingMonth = sqlSession.selectOne("spendingMonth");
		
		logger.info(spendingMonth);
		
		return spendingMonth;
	}

	public List<Map<String, Object>> payMethod() {
		//insert here!!!!
		List<Map<String,Object>> payMethod = new ArrayList<Map<String,Object>>();
		return payMethod;
	}

	public List<Map<String, Object>> spendingStore() {
		//insert here!!!!
		List<Map<String,Object>> spendingStore = new ArrayList<Map<String,Object>>();
		return spendingStore;
	}

	public List<Map<String, Object>> total_Month() {
		//insert here!!!!
		List<Map<String,Object>> total_Month = new ArrayList<Map<String,Object>>();
		return total_Month;
	}

	public List<Map<String, Object>> total_Week() {
		//insert here!!!!
		List<Map<String,Object>> total_Week = new ArrayList<Map<String,Object>>();
		return total_Week;
	}

	public List<Map<String, Object>> total_Day() {
		//insert here!!!!
		List<Map<String,Object>> total_Day = new ArrayList<Map<String,Object>>();
		return total_Day;
	}

	public List<Map<String, Object>> spendingList() {
		//insert here!!!!
		List<Map<String,Object>> spendingList = new ArrayList<Map<String,Object>>();
		return spendingList;
	}

	public List<Map<String, Object>> total_Budget() {
		//insert here!!!!
		List<Map<String,Object>> total_Budget = new ArrayList<Map<String,Object>>();
		return total_Budget;
	}

	public List<Map<String, Object>> card_Budget() {
		//insert here!!!!
		List<Map<String,Object>> card_Budget = new ArrayList<Map<String,Object>>();
		return card_Budget;
	}

	public List<Map<String, Object>> otherUsersSpending() {
		//insert here!!!!
		List<Map<String,Object>> otherUsersSpending = new ArrayList<Map<String,Object>>();
		return otherUsersSpending;
	}
	public List<Map<String, Object>> spendingCategory() {
		// TODO Auto-generated method stub
		return null;
	}
}
