package com.recommend;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.plan.PlanDao;
import com.pojo.ControllerMapper;

public class RecommendLogic {
	Logger logger = Logger.getLogger(RecommendLogic.class);
	RecommendDao rDao = new RecommendDao();
	public List<Map<String, Object>> cardRecommand() {
		List<Map<String,Object>> cardRecommand = null;
		cardRecommand = rDao.cardRecommand();
		return cardRecommand;
	}
	public List<Map<String, Object>> allCards(String id) {
		logger.info("Logic allCards호출");
		List<Map<String,Object>> allCards = null;
		allCards = rDao.allCards(id);
		return allCards;
	}
	public List<Map<String, Object>> eatCard() {
		List<Map<String,Object>> eatCard = null;
		eatCard = rDao.eatCard();
		return eatCard;
	}
	public List<Map<String, Object>> communityCard() {
		List<Map<String,Object>> communityCard = null;
		communityCard = rDao.communityCard();
		return communityCard;
	}
	public List<Map<String, Object>> tripCard() {
		List<Map<String,Object>> tripCard = null;
		tripCard = rDao.tripCard();
		return tripCard;
	}
	public List<Map<String, Object>> convenCard() {
		List<Map<String,Object>> convenCard = null;
		convenCard = rDao.convenCard();
		return convenCard;
	}
	public List<Map<String, Object>> oilCard() {
		List<Map<String,Object>> oilCard = null;
		oilCard = rDao.oilCard();
		return oilCard;
	}
	public List<Map<String, Object>> myRecommendCard() {
		List<Map<String,Object>> myRecommendCard = null;
		myRecommendCard = rDao.myRecommendCard();
		logger.info("Logic에서 Dao호출성공");
		
		return myRecommendCard;
	}

}
