package com.pojo;

import org.apache.log4j.Logger;

import com.card.CardController;
import com.member.MemberController;
import com.membership.MembershipController;
import com.plan.PlannerController;
import com.recommend.RecommendController;
import com.rewards.RewardsController;

public class ControllerMapper {
	static Logger logger = Logger.getLogger(ControllerMapper.class);
	//command => /ioc/getBookList.do?command=sel
	public static Controller getController(String command) { 
		//선언부에서 초기화를 null로 하는 이유는 어떤 컨트롤러 클래스를 생성할 지
		//결정이 아직 안됐으니까...
		//쿼리스트링에 담아야 하는 정보는 몇가지 일까요
		//XXX.do?command=category/work/curd
		Controller controller = null;
		String commands[]= command.split("/");
		for(String str:commands) {
			logger.info("commands:"+str);
		}
		if(commands.length==2) {
			String category = commands[0];
			String work = commands[1];
			if("member".equals(category)){
				controller = new MemberController(work);
			}
			else if("card".equals(category)){ controller = new CardController(work); 
			}
			 
			
			else if("plan".equals(category)) {
				controller = new PlannerController(work);
			}
			else if("rewards".equals(category)) {
				controller = new RewardsController(work);
			}
			else if("membership".equals(category)) {
				controller = new MembershipController(work);
			}
			else if("recommend".equals(category)) {
				controller = new RecommendController(work); 
			}
			
				
		}
		return controller;
	}
}