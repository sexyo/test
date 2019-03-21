package com.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.rewards.RewardsDao;
import com.util.MyBatisCommonFactory;

public class AccountDao {
	Logger logger = Logger.getLogger(AccountDao.class);
	SqlSessionFactory sqlSessionFactory = null;
	SqlSession sqlSession = null;
	
	public AccountDao() {
		sqlSessionFactory = MyBatisCommonFactory.getSqlSessionFactory();
		sqlSession = sqlSessionFactory.openSession();
	}
	public List<Map<String, Object>> accountList() {
		List<Map<String,Object>> accountList = new ArrayList<Map<String,Object>>();
		// TODO Auto-generated method stub
		return accountList;
	}

	public List<Map<String, Object>> accountAdd() {
		List<Map<String,Object>> accountAdd = new ArrayList<Map<String,Object>>();
		// TODO Auto-generated method stub
		return accountAdd;
	}


}
