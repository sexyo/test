package com.recommend;

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

import com.membership.MembershipDao;
import com.util.MyBatisCommonFactory;
import com.vo.RecommendVO;

public class RecommendDao {
	Logger logger = Logger.getLogger(RecommendDao.class);
	SqlSessionFactory sqlSessionFactory = null;
	SqlSession sqlSession = null;
	
	public RecommendDao() {
		sqlSessionFactory = MyBatisCommonFactory.getSqlSessionFactory();
		sqlSession = sqlSessionFactory.openSession();
	}
	public List<Map<String, Object>> cardRecommand() {
		List<Map<String,Object>> cardRecommandList = new ArrayList<Map<String,Object>>();
		//insert here!!!!
		return cardRecommandList;
	}

	public List<Map<String, Object>> allCards(String id) {
		List<Map<String,Object>> allCards = new ArrayList<Map<String,Object>>();
		logger.info("allCards 호출성공");
		//insert here!!!!
		try {
			RecommendVO rVO = new RecommendVO();
			String resource = "com/mybatis/MapperConfig.xml";
			Reader reader = null; 
			reader = Resources.getResourceAsReader(resource); 
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader); //
			sqlSession = sqlSessionFactory.openSession();
			allCards = sqlSession.selectList("allCards");
			logger.info(allCards.size());
			for(int i=0;i<allCards.size();i++) {
			logger.info(allCards.get(i).get("BRAND_NAME"));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return allCards;
	}

	public List<Map<String, Object>> eatCard() {
		List<Map<String,Object>> eatCard = new ArrayList<Map<String,Object>>();
		logger.info("eatCard 호출성공");
		//insert here!!!!
		try {
			RecommendVO rVO = new RecommendVO();
			String resource = "com/mybatis/MapperConfig.xml";
			Reader reader = null; 
			reader = Resources.getResourceAsReader(resource); 
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader); //
			sqlSession = sqlSessionFactory.openSession();
			eatCard = sqlSession.selectList("eatCard");
			logger.info(eatCard.size());
			for(int i=0;i<eatCard.size();i++) {
			logger.info(eatCard.get(i).get("BRAND_NAME"));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return eatCard;
	}

	public List<Map<String, Object>> communityCard() {
		List<Map<String,Object>> communityCard = new ArrayList<Map<String,Object>>();
		logger.info("communityCard 호출성공");
		//insert here!!!!
		try {
			RecommendVO rVO = new RecommendVO();
			String resource = "com/mybatis/MapperConfig.xml";
			Reader reader = null; 
			reader = Resources.getResourceAsReader(resource); 
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader); //
			sqlSession = sqlSessionFactory.openSession();
			communityCard = sqlSession.selectList("communityCard");
			logger.info(communityCard.size());
			for(int i=0;i<communityCard.size();i++) {
			logger.info(communityCard.get(i).get("BRAND_NAME"));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return communityCard;
	}

	public List<Map<String, Object>> tripCard() {
		List<Map<String,Object>> tripCard = new ArrayList<Map<String,Object>>();
		logger.info("tripCard 호출성공");
		//insert here!!!!
		try {
			RecommendVO rVO = new RecommendVO();
			String resource = "com/mybatis/MapperConfig.xml";
			Reader reader = null; 
			reader = Resources.getResourceAsReader(resource); 
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader); //
			sqlSession = sqlSessionFactory.openSession();
			tripCard = sqlSession.selectList("tripCard");
			logger.info(tripCard.size());
			for(int i=0;i<tripCard.size();i++) {
			logger.info(tripCard.get(i).get("BRAND_NAME"));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return tripCard;
	}

	public List<Map<String, Object>> convenCard() {
		List<Map<String,Object>> convenCard = new ArrayList<Map<String,Object>>();
		logger.info("eatCard 호출성공");
		//insert here!!!!
		try {
			RecommendVO rVO = new RecommendVO();
			String resource = "com/mybatis/MapperConfig.xml";
			Reader reader = null; 
			reader = Resources.getResourceAsReader(resource); 
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader); //
			sqlSession = sqlSessionFactory.openSession();
			convenCard = sqlSession.selectList("convenCard");
			logger.info(convenCard.size());
			for(int i=0;i<convenCard.size();i++) {
			logger.info(convenCard.get(i).get("BRAND_NAME"));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return convenCard;
	}

	public List<Map<String, Object>> oilCard() {
		List<Map<String,Object>> oilCard = new ArrayList<Map<String,Object>>();
		logger.info("eatCard 호출성공");
		//insert here!!!!
		try {
			RecommendVO rVO = new RecommendVO();
			String resource = "com/mybatis/MapperConfig.xml";
			Reader reader = null; 
			reader = Resources.getResourceAsReader(resource); 
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader); //
			sqlSession = sqlSessionFactory.openSession();
			oilCard = sqlSession.selectList("oilCard");
			logger.info(oilCard.size());
			for(int i=0;i<oilCard.size();i++) {
			logger.info(oilCard.get(i).get("BRAND_NAME"));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return oilCard;
	}

	public List<Map<String, Object>> myRecommendCard() {
		logger.info("myRecommendCard 호출성공");
		List<Map<String,Object>> myRecommendCard = new ArrayList<Map<String,Object>>();
		logger.info(myRecommendCard.size());
		//insert here!!!!
		try {
			String resource = "com/mybatis/MapperConfig.xml";
			Reader reader = null; 
			reader = Resources.getResourceAsReader(resource); 
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader); //
			Map<String,Object> pMap = new HashMap<String,Object>();
			sqlSession = sqlSessionFactory.openSession();
			sqlSession.selectOne("myRecommendCard",pMap);
			sqlSession.commit();
			myRecommendCard = (List<Map<String,Object>>)pMap.get("P_MEM_NAME");
		} catch (Exception e) {
			logger.info("Exception : "+e.toString());
		}
		myRecommendCard = sqlSession.selectList("myRecommendCard");
		logger.info(myRecommendCard.size());
		//logger.info(myRecommandCard.get(0).get("mem_id"));
		return myRecommendCard;
	}
	
}
