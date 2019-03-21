package com.rewards;

import java.util.List;
import java.util.Map;

public class RewardsLogic {
	RewardsDao reDao = new RewardsDao();

	
	public List<Map<String, Object>> reward_Main() {
		List<Map<String,Object>> reward_Main = null;
		reward_Main = reDao.reward_Main();
		return reward_Main;
	}
	public List<Map<String, Object>> myPoint() {
		List<Map<String,Object>> myPoint = null;
		myPoint = reDao.myPoint();
		return myPoint;
	}
	public List<Map<String, Object>> exCoupon() {
		List<Map<String,Object>> exCoupon = null;
		exCoupon = reDao.exCoupon();
		return exCoupon;
	}
	public List<Map<String, Object>> recentPoint() {
		List<Map<String,Object>> recentPoint = null;
		recentPoint = reDao.recentPoint();
		return recentPoint;
	}
	public List<Map<String, Object>> removePoint() {
		List<Map<String,Object>> removePoint = null;
		removePoint = reDao.removePoint();
		return removePoint;
	}
	public List<Map<String, Object>> myCoupon() {
		List<Map<String,Object>> myCoupon = null;
		myCoupon = reDao.myCoupon();
		return myCoupon;
	}
	public List<Map<String, Object>> pointSave() {
		List<Map<String,Object>> pointSave = null;
		pointSave = reDao.pointSave();
		return pointSave;
	}

	

}
