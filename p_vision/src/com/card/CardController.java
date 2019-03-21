package com.card;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Controller;

public class CardController implements Controller {
	CardLogic cLogic = new CardLogic();
	String work = "";
	public CardController(String work) {
		this.work = work;
	}

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = "";
		String mem_id = (String)req.getParameter("mem_id");
		if("cardList".equals(work)) {//카드리스트
			List<Map<String,Object>> cardList = null;
			cardList = cLogic.cardList(mem_id);
			req.setAttribute("cardList", cardList);
			path = "forward:/card/cardList.jsp";
		}
		else if("cardUseList".equals(work)) {//카드 사용내역
			List<Map<String,Object>> cardUseList = null;
			cardUseList = cLogic.cardUseList();
			req.setAttribute("cardUseList", cardUseList);
			path = "forward:/card/cardUseList.jsp";
		}
		else if("cardAdd".equals(work)) {//카드추가
			List<Map<String,Object>> cardAdd = null;
			cardAdd = cLogic.cardAdd();
			req.setAttribute("cardAdd", cardAdd);
			path = "forward:/card/cardAdd.jsp";
		}
		return path;
	}
		

}



















