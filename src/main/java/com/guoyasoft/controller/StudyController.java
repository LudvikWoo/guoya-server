package com.guoyasoft.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guoyasoft.service.ExerciseSvc;

public class StudyController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 这句话的意思，是让浏览器用utf8来解析返回的数据
		resp.setHeader("Content-type", "application/json;charset=UTF-8");
		// 这句话的意思，是告诉servlet用UTF-8转码，而不是用默认的ISO8859
		resp.setCharacterEncoding("UTF-8");
		resp.setHeader("Access-Control-Allow-Origin", "*"); 
		String result = "无效操作类型！";

		String method = req.getParameter("method");
		System.out.println("method="+method);
		ExerciseSvc svc=new ExerciseSvc();
		if ("getUrls".equals(method)) {
			result=svc.getUrls();
		}else if("updateUrl".equals(method)){
			String sno=req.getParameter("sno");
			String url=req.getParameter("url");
			int count=svc.updateUrl(sno,url);
			if(count>0){
				result="sno="+sno+"的学生信息更新成功！";
			}else{
				result="{responseCode:0000,responseDesc:sno="+sno+"的学生信息更新失败！";
			}
		}else if("insertExercise".equals(method)){
			String sname=req.getParameter("sname");
			String sno=req.getParameter("sno");
			String groupId=req.getParameter("groupId");
			String url=req.getParameter("url");
			String img=req.getParameter("img");
			int count=svc.insertExercise(sname,sno,groupId,url,img);
			if(count>0){
				result="新增成功！sno="+sno+",sname="+sname;
			}else{
				result="新增失败!";
			}
		}else if("updateStatus".equals(method)){
			String sno=req.getParameter("sno");
			String status=req.getParameter("status");
			int count=svc.updateStatus(sno,status);
			if(count>0){
				result="更新成功！";
			}else{
				result="更新失败!";
			}
		}else if("updateAllStatus".equals(method)){
			int count=svc.updateAllStatus();
			if(count>0){
				result="更新成功！";
			}else{
				result="更新失败!";
			}
		}else if("deleteStudy".equals(method)){
			String sno=req.getParameter("sno");
			int count=svc.deleteStudy(sno);
			if(count>0){
				result="更新成功！";
			}else{
				result="更新失败!";
			}
		}
		System.out.println(result);
		
		
		resp.getWriter().write(result);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	

}
