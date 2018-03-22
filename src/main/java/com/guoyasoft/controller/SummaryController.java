package com.guoyasoft.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guoyasoft.beans.GyDailySummary;
import com.guoyasoft.service.SummarySvc;
import com.guoyasoft.tools.FileUpload;

public class SummaryController extends HttpServlet {

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
		SummarySvc svc = new SummarySvc();
		try {

			if ("uploadSumarizePic".equals(method)) {
				System.out.println("开始接收文件：");
				HashMap<String, String> map = FileUpload.fileupload(req, resp);
				String imgPath = map.get("imgPath");
				String sno = map.get("sno");
				String summaryDate = map.get("summaryDate");
				System.out
						.println("sno=" + sno + ",summaryDate=" + summaryDate);

				System.out.println("图片保存相对路径" + imgPath);
				int count = svc.insertSummary(sno, imgPath, summaryDate);
				if (count > 0) {
					result = "操作成功";
				} else {
					result = "操作失败";
				}
				GyDailySummary bean = new GyDailySummary();
				bean.setSummaryDate(summaryDate);
				result = svc.querySummaryInfo(bean);
			} else if ("querySumarise".equals(method)) {
				String sno = req.getParameter("sno");
				String sname = req.getParameter("sname");
				String summaryDate = req.getParameter("summaryDate");
				String groupId = req.getParameter("groupId");
				String tutor = req.getParameter("tutor");
				String outstanding = req.getParameter("outstanding");
				GyDailySummary bean = new GyDailySummary();
				bean.setSno(sno);
				bean.setSname(sname);
				bean.setGroupId(groupId);
				bean.setSummaryDate(summaryDate);
				bean.setTutor(tutor);
				bean.setOutstanding(outstanding);
				result = svc.querySummaryInfo(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.getWriter().write(result);

	}

}
