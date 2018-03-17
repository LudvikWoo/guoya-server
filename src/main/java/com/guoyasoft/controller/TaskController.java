package com.guoyasoft.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guoyasoft.service.TaskSvc;
import com.guoyasoft.tools.FileUpload;

public class TaskController extends HttpServlet {

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
		TaskSvc svc = new TaskSvc();
		if ("getTaskInfo".equals(method)) {
			result = svc.getTaskList();
		} else if ("updateTaskItemStatus".equals(method)) {
			String itemId = req.getParameter("itemId");
			String status = req.getParameter("itemStatus");
			int count = svc.updateTaskItem(itemId, status);
			if (count > 0) {
				result = itemId + "更新成功";
			} else {
				result = itemId + "更新失败";
			}
		} else if ("addTask".equals(method)) {
			String taskDate = req.getParameter("taskDate");
			String taskName = req.getParameter("taskName");
			int count = svc.addTask(taskDate, taskName);
			if (count > 0) {
				result = "操作成功";
			} else {
				result = "操作失败";
			}
		} else if ("addTaskItem".equals(method)) {
			String taskId = req.getParameter("taskId");
			String itemName = req.getParameter("itemName");
			String itemDesc = req.getParameter("itemDesc");

			int count = svc.addTaskItem(taskId, itemName, itemDesc);
			if (count > 0) {
				result = "操作成功";
			} else {
				result = "操作失败";
			}
		} else if ("deleteTaskItem".equals(method)) {
			String itemId = req.getParameter("itemId");
			int count = svc.deleteTaskItem(itemId);
			if (count > 0) {
				result = "操作成功";
			} else {
				result = "操作失败";
			}
		} else if ("deleteTask".equals(method)) {
			String taskId = req.getParameter("taskId");
			int count = svc.deleteTask(taskId);
			if (count > 0) {
				result = "操作成功";
			} else {
				result = "操作失败";
			}
		}

		System.out.println(result);

		resp.getWriter().write(result);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 这句话的意思，是让浏览器用utf8来解析返回的数据
		resp.setHeader("Content-type", "multipart/form-data;charset=UTF-8");
		// 这句话的意思，是告诉servlet用UTF-8转码，而不是用默认的ISO8859
		resp.setCharacterEncoding("UTF-8");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		String result = "无效操作类型！";
		String method = req.getParameter("method");
		System.out.println("method=" + method);
		
	}

}
