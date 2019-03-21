package com.membership;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.member.MemberDao;
import com.util.MyBatisCommonFactory;

public class MembershipDao {
	Logger logger = Logger.getLogger(MembershipDao.class);
	SqlSessionFactory sqlSessionFactory = null;
	SqlSession sqlSession = null;
	
	public MembershipDao() {
		sqlSessionFactory = MyBatisCommonFactory.getSqlSessionFactory();
		sqlSession = sqlSessionFactory.openSession();
	}
	public List<Map<String, Object>> mshipList() {
		//insert here!!!!
		
		List<Map<String,Object>> spendingMonthList = new ArrayList<Map<String,Object>>();
		return spendingMonthList;
	}
	public List<Map<String, Object>> mshipHistory() {
		//insert here!!!!
		
		List<Map<String,Object>> mshipHistory = new ArrayList<Map<String,Object>>();
		return mshipHistory;
	}
	public List<Map<String, Object>> mshipAdd() {
		//insert here!!!!
		
		List<Map<String,Object>> mshipAdd = new ArrayList<Map<String,Object>>();
		return mshipAdd;
	}
	public List<Map<String, Object>> mshipBenefit() {
		//insert here!!!!
		
		List<Map<String,Object>> mshipBenefit = new ArrayList<Map<String,Object>>();
		return mshipBenefit;
	}


}
