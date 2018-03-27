package com.guoyasoft.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.guoyasoft.beans.ExcerciseBean;
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
		System.out.println("method=" + method);
		ExerciseSvc svc = new ExerciseSvc();
		if ("getUrls".equals(method)) {
			result = svc.getUrls();
		}else if ("insertExercise".equals(method)) {
			String sname = req.getParameter("sname");
			String sno = req.getParameter("sno");
			String groupId = req.getParameter("groupId");
			String url = req.getParameter("url");
			String img = req.getParameter("img");
			int count = svc.insertExercise(sname, sno, groupId, url, img);
			if (count > 0) {
				result = "新增成功！sno=" + sno + ",sname=" + sname;
			} else {
				result = "新增失败!";
			}
		} else if ("updateStatus".equals(method)) {
			String sno = req.getParameter("sno");
			String status = req.getParameter("status");
			int count = svc.updateStatus(sno, status);
			if (count > 0) {
				result = "更新成功！";
			} else {
				result = "更新失败!";
			}
		} else if ("updateAllStatus".equals(method)) {
			int count = svc.updateAllStatus();
			if (count > 0) {
				result = "更新成功！";
			} else {
				result = "更新失败!";
			}
		} else if ("deleteStudy".equals(method)) {
			String sno = req.getParameter("sno");
			int count = svc.deleteStudy(sno);
			if (count > 0) {
				result = "更新成功！";
			} else {
				result = "更新失败!";
			}
		}
		System.out.println(result);

		resp.getWriter().write(result);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 这句话的意思，是让浏览器用utf8来解析返回的数据
		resp.setHeader("Content-type", "application/json;charset=UTF-8");
		// 这句话的意思，是告诉servlet用UTF-8转码，而不是用默认的ISO8859
		resp.setCharacterEncoding("UTF-8");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		String result = "无效操作类型！";

		StringBuilder sb = new StringBuilder();
		try {
			InputStream is = req.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is,
					"UTF-8"));
			String tmp = "";
			while ((tmp = br.readLine()) != null) {
				sb.append(tmp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-------------开始接收请求报文----------------------------");
		String postStr = sb.toString();
		System.out.println(postStr);

		// 解析器
		JsonParser parser = new JsonParser();
		// 解析方法：入参=json串，出参JsonObject对象
		// 实现底层核心：HashMap，字段不固定，而且是键值对
		JsonObject classObj = (JsonObject) parser.parse(postStr);
		JsonObject requestJson= classObj.get("request").getAsJsonObject();
		String method = requestJson.get("method").getAsString();
		JsonObject student =requestJson.get("student").getAsJsonObject();
		
		Gson gs = new Gson();  
		ExcerciseBean bean = gs.fromJson(student, ExcerciseBean.class);//把JSON字符串转为对象  
		System.out.println(bean.getSno());
		ExerciseSvc svc = new ExerciseSvc();
		if ("updateStudent".equals(method)) {
			int count = svc.updateExercise(bean);
			if (count > 0) {
				result = "更新成功！";
			} else {
				result = "更新失败!";
			}
		} 
		System.out.println(result);

		resp.getWriter().write(result);
	}

}
