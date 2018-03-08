package com.guoyasoft.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudyController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		 //这句话的意思，是让浏览器用utf8来解析返回的数据  
		resp.setHeader("Content-type", "text/html;charset=UTF-8");  
		//这句话的意思，是告诉servlet用UTF-8转码，而不是用默认的ISO8859  
		resp.setCharacterEncoding("UTF-8"); 
		String result="操作成功！";
		
		String url=req.getParameter("url");
		System.out.println("url="+url);
		
		String method=req.getParameter("method");
		if("getUrls".equals(method)){
			result="{\"study\":{\"student\":[{\"group\":\"1\",\"sno\":\"s001\",\"sname\":\"陈超\",\"url\":\"http://127.0.0.1:8083/guoya-client/basicClass/首页.html\",\"status\":\"pass\"},{\"group\":\"1\",\"sno\":\"s001\",\"sname\":\"陈超\",\"url\":\"http://127.0.0.1:8083/guoya-client/basicClass/首页.html\",\"status\":\"pass\"},{\"group\":\"1\",\"sno\":\"s001\",\"sname\":\"陈超\",\"url\":\"http://127.0.0.1:8083/guoya-client/basicClass/首页.html\",\"status\":\"pass\"},{\"group\":\"1\",\"sno\":\"s001\",\"sname\":\"陈超\",\"url\":\"http://127.0.0.1:8083/guoya-client/basicClass/首页.html\",\"status\":\"pass\"}]}}";
		}
		resp.getWriter().write(result);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
