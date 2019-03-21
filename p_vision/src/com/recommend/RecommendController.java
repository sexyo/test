package com.recommend;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.plan.PlanLogic;
import com.pojo.Controller;

public class RecommendController implements Controller {
	RecommendLogic rLogic = new RecommendLogic();
	String work = "";

	public RecommendController(String work) {
		this.work = work;
	}

	@Override
	public Object execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 String path = "";
		 if("cardRecommand".equals(work)){
			 List<Map<String,Object>> cardRecommand = null;
			 cardRecommand =rLogic.cardRecommand();
			req.setAttribute("cardRecommand", cardRecommand);
			path = "forward:/recommend/cardRecommand.jsp";
		 }
		 else if("allCards".equals(work)) {
			 List<Map<String,Object>> allCards = null;
			 String id= (String)req.getParameter("id");
			 allCards = rLogic.allCards(id);
			 req.setAttribute("allCards", allCards);
			 path = "forward:/recommend/allCards.jsp";
		 }
		 else if("eatCard".equals(work)) {
			 List<Map<String,Object>> eatCard = null;
			 eatCard = rLogic.eatCard();
			 req.setAttribute("eatCard", eatCard);
			 path = "forward:/recommend/eatCard.jsp";
		 }
		 else if("communityCard".equals(work)) {
			 List<Map<String,Object>> communityCard = null;
			 communityCard = rLogic.communityCard();
			 req.setAttribute("communityCard", communityCard);
			 path = "forward:/recommend/communityCard.jsp";
		 }
		 else if("tripCard".equals(work)) {
			 List<Map<String,Object>> tripCard = null;
			 tripCard = rLogic.tripCard();
			 req.setAttribute("tripCard", tripCard);
			 path = "forward:/recommend/tripCard.jsp";
		 }
		 else if("convenCard".equals(work)) {
			 List<Map<String,Object>> convenCard = null;
			 convenCard = rLogic.convenCard();
			 req.setAttribute("convenCard", convenCard);
			 path = "forward:/recommend/convenCard.jsp";
		 }
		 else if("oilCard".equals(work)) {
			 List<Map<String,Object>> oilCard = null;
			 oilCard = rLogic.oilCard();
			 req.setAttribute("oilCard", oilCard);
			 path = "forward:/recommend/oilCard.jsp";
		 }
		 else if("myRecommendCard".equals(work)) {
			 List<Map<String,Object>> myRecommendCard = null;
			 myRecommendCard = rLogic.myRecommendCard();
			 req.setAttribute("myRecommendCard", myRecommendCard);
			 path = "forward:/recommend/myRecommendCard.jsp";
		 }
		 
		return path;
	}

}
