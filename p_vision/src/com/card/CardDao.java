package com.card;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.recommend.RecommendDao;
import com.util.MyBatisCommonFactory;
import com.vo.CardVO;
import com.vo.RecommendVO;

public class CardDao {
	Logger logger = Logger.getLogger(CardDao.class);
	SqlSessionFactory sqlSessionFactory = null;
	SqlSession sqlSession = null;
	
	public CardDao() {
		sqlSessionFactory = MyBatisCommonFactory.getSqlSessionFactory();
		sqlSession = sqlSessionFactory.openSession();
	}
	public List<Map<String, Object>> cardList(String mem_id) {
		List<Map<String, Object>> cardList = new ArrayList<Map<String, Object>>();
		logger.info("cardList 호출성공");
		//insert here!!!!
			CardVO cVO = new CardVO();
			cardList = sqlSession.selectList("cardList", mem_id);
			logger.info(cardList.size());
		return cardList;
	}

	public List<Map<String, Object>> cardUseList() {
		List<Map<String,Object>> cardUseList = new ArrayList<Map<String,Object>>();
		//insert here
		
		return cardUseList;
	}

	public List<Map<String, Object>> cardAdd() {
		List<Map<String,Object>> cardAdd = new ArrayList<Map<String,Object>>();
		//insert here
		
		return cardAdd;
	}


}
