package com.rewards;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.card.CardDao;
import com.util.MyBatisCommonFactory;

public class RewardsDao {
	Logger logger = Logger.getLogger(RewardsDao.class);
	SqlSessionFactory sqlSessionFactory = null;
	SqlSession sqlSession = null;
	public RewardsDao() {
		sqlSessionFactory = MyBatisCommonFactory.getSqlSessionFactory();
		sqlSession = sqlSessionFactory.openSession();
	}

	public List<Map<String, Object>> reward_Main() {
		//insert here
		List<Map<String,Object>> reward_Main = new ArrayList<Map<String,Object>>();
		return reward_Main;
	}

	public List<Map<String, Object>> myPoint() {
		//insert here
		List<Map<String,Object>> myPoint = new ArrayList<Map<String,Object>>();
		return myPoint;
	}

	public List<Map<String, Object>> exCoupon() {
		//insert here
		List<Map<String,Object>> exCoupon = new ArrayList<Map<String,Object>>();
		return exCoupon;
	}

	public List<Map<String, Object>> recentPoint() {
		//insert here
		List<Map<String,Object>> recentPoint = new ArrayList<Map<String,Object>>();
		return recentPoint;
	}

	public List<Map<String, Object>> removePoint() {
		//insert here
		List<Map<String,Object>> removePoint = new ArrayList<Map<String,Object>>();
		return removePoint;
	}

	public List<Map<String, Object>> myCoupon() {
		//insert here
		List<Map<String,Object>> myCoupon = new ArrayList<Map<String,Object>>();
		return myCoupon;
	}

	public List<Map<String, Object>> pointSave() {
		//insert here
		List<Map<String,Object>> pointSave = new ArrayList<Map<String,Object>>();
		return pointSave;
	}

	
}
