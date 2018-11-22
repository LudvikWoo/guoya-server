package com.guoyasoft.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.guoyasoft.bean.api.test.addCustomer.request.Request;
import com.guoyasoft.bean.api.test.addCustomer.response.Response;
import com.guoyasoft.tools.IOTools;
import com.guoyasoft.tools.MyStringTools;

@Controller
@RequestMapping("customer")
public class CustomerController {
	@RequestMapping("addCustomer.action")
	@ResponseBody
	public String addCustomer(HttpServletRequest request) {
		System.out.println("-------------开始接收请求报文----------------------------");
		Response resp = new Response();
		String requestStr = IOTools.readRequestContent(request);
		if (MyStringTools.isBlank(requestStr)) {
			StringReader reader = new StringReader(requestStr);
			try {
				Request req = Request.unmarshal(reader);
				resp.setRespCode("0000");
				resp.setRespDesc("成功");
				resp.setCustomerId("2342321");
			} catch (Exception e) {
				e.printStackTrace();
				resp.setRespCode("0002");
				resp.setRespDesc("数据校验错误");
				resp.setCustomerId("");
			}
		} else {
			resp.setRespCode("0003");
			resp.setRespDesc("报文格式校验未通过");
			resp.setCustomerId("");
		}

		String result = resp.toXMLString();
		System.out.println("响应报文为：" + result);
		return result;
	}

	@RequestMapping("updateCustomer.action")
	@ResponseBody
	public String updateCustomer(HttpServletRequest request) {
		System.out.println("-------------开始接收请求报文----------------------------");
		StringBuilder sb = new StringBuilder();
		com.guoyasoft.bean.api.test.updateCustomer.response.Response resp = new com.guoyasoft.bean.api.test.updateCustomer.response.Response();
		String requestStr = IOTools.readRequestContent(request);

		System.out.println("请求报文：" + requestStr);
		if (MyStringTools.isBlank(requestStr)) {
			StringReader reader = new StringReader(requestStr);
			try {
				com.guoyasoft.bean.api.test.updateCustomer.request.Request req = com.guoyasoft.bean.api.test.updateCustomer.request.Request
						.unmarshal(reader);
				resp.setRespCode("0000");
				resp.setRespDesc("成功");
			} catch (Exception e) {
				e.printStackTrace();
				resp.setRespCode("0003");
				resp.setRespDesc("数据校验错误");
			}
		} else {
			resp.setRespCode("0002");
			resp.setRespDesc("数据接收异常");
		}

		String result = resp.toXMLString();
		System.out.println("响应报文为：" + result);
		return result;
	}
}
