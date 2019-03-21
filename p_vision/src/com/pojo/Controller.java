package com.pojo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	//return "redirect:XXX.jsp", "forward:XXX.do"
	//ActionForward af = null;
	//String str = "";//피할 수 있다.
	//String str = null;//NullPointerException
	//int result = 0;//-1,0,1로 체크가능
	public Object execute(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException;
	/*public ActionForward execute(HttpServletRequest req);*/
}
