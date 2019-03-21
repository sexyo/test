package com.card;

import java.util.List;
import java.util.Map;

public class CardLogic {
	CardDao cDao = new CardDao();
	public List<Map<String, Object>> cardList(String mem_id) {//카드리스트
		List<Map<String,Object>> cardList = null;
		cardList = cDao.cardList(mem_id);
		return cardList;
	}
	public List<Map<String, Object>> cardUseList() {//카드사용내역
		List<Map<String,Object>> cardUseList = null;
		cardUseList = cDao.cardUseList();
		return cardUseList;
	}
	public List<Map<String, Object>> cardAdd() {//카드추가
		List<Map<String,Object>> cardAdd = null;
		cardAdd = cDao.cardAdd();
		return cardAdd;
	}
	

}
