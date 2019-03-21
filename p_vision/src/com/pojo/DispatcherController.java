package com.pojo;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class DispatcherController extends HttpServlet {
	Logger logger = Logger.getLogger(DispatcherController.class);
	public void doService(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		String requestURI = req.getRequestURI();// /dev_jsp/book/getBookList.do
		String contextPath = req.getContextPath();// dev_jsp
		String command = requestURI.substring(contextPath.length()+1);
		logger.info("command:"+command);//redirect:ch9/member/login.mvc 	or forward:ch9/member/login.mvc
		Controller controller = null;
		try {
			controller = ControllerMapper.getController(command);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(controller!=null) {
			String pageMove[] = null;
			try {
				String ret = (String)controller.execute(req, res);
				
				pageMove = ret.split(":");
				logger.info("pageMove:"+pageMove);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(pageMove!=null) {
				String path = pageMove[1];
				if("redirect".equals(pageMove[0])) {
					res.sendRedirect(path);
				}
				else if("forward".equals(pageMove[0])) {
					RequestDispatcher view = req.getRequestDispatcher(path);
					view.forward(req, res);
				}
				else {
					logger.info("에러");
				}
			}
		}
		/*
		 * List<Map<String,Object>> cMap =
		 * (List<Map<String,Object>>)controller.execute(req, res);
		 * req.setAttribute("cMap", cMap); RequestDispatcher view =
		 * req.getRequestDispatcher("cardList.jsp"); view.forward(req, res);
		 * logger.info("포워드완료");
		 */
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		doService(req, res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		doService(req, res);
	}
}
