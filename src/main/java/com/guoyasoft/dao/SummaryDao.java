package com.guoyasoft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.guoyasoft.tools.JDBCTools;

public class SummaryDao {

	public String querySummaryInfo(String sql) {
		System.out.println(sql);
		StringBuilder json = new StringBuilder();
		String result = "";
		json.append("{");
		json.append("\"summaries\": {");
		json.append("\"summaryDate\": {");
		json.append("\"date\": \"待定\",");
		json.append("\"student\": [");
		
		// 第1步：建立数据库链接
		Connection conn = JDBCTools.getConnection();
		// 第2步：写SQL魔板
		// 第3步：按照真实数据生成执行SQL
		PreparedStatement pstmt;
		ResultSet set;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			// 执行拼装好的sql,如果是更新，则返回更新条数
			set = pstmt.executeQuery();
			StringBuilder sb=new StringBuilder();
			while (set.next()) {
				sb.append("{");
				sb.append("\"sno\": \""+set.getString("SNO")+"\",");
				sb.append("\"sname\": \""+set.getString("SNAME")+"\",");
				sb.append("\"imgPath\": \""+set.getString("IMG_PATH")+"\" ");
				sb.append("},");
			}
			String content=sb.toString();
			if(content.endsWith(",")){
				content=content.substring(0,content.lastIndexOf(","));
			}
			System.out.println("content"+content);
			json.append(content);
			json.append("]");
			json.append("}");
			json.append("}");
			json.append("}");
			
			System.out.println(json.toString());
			// 关闭链接
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return json.toString();
	}

}
