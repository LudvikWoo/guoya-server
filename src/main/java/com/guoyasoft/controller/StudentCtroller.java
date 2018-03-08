package com.guoyasoft.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guoyasoft.beans.Student;
import com.guoyasoft.service.StudentService;

public class StudentCtroller extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		
		String[] skills=req.getParameterValues("skills");
		System.out.println(skills[0]+","+skills[1]);
		Student s=new Student();
		s.setSname(req.getParameter("name"));
		s.setSage(Integer.parseInt(req.getParameter("age")));
		
		System.out.println(s.getSname()+" "+s.getSage());
		
		StudentService svc=new StudentService();
		boolean result=svc.insert(s);
		if(result==true){
			resp.getWriter().write("新增成功");
		}else{
			resp.getWriter().write("新增失败");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
