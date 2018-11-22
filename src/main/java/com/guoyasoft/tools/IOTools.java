package com.guoyasoft.tools;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

public class IOTools {
	public static String readRequestContent(HttpServletRequest request) {
		StringBuilder sb = new StringBuilder();
		try {
			InputStream is = request.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is,
					"UTF-8"));
			String tmp = "";
			while ((tmp = br.readLine()) != null) {
				sb.append(tmp);
			}
			String requestStr = sb.toString();
			System.out.println("请求报文：" + requestStr);
			return requestStr;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
