package com.guoyasoft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.guoyasoft.beans.Student;
import com.guoyasoft.tools.JDBCTools;

public class StudyDao {
	public String selectExercise(String sql) {
		StringBuilder json=new StringBuilder();
		String result="";
		json.append("{\"study\":{\"student\":[");
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
			while(set.next()){
				String temp="{\"group\":\""+set.getString("GROUPID")+"\",\"sno\":\""+set.getString("SNO")+"\",\"sname\":\""+set.getString("SNAME")+"\",\"url\":\""+set.getString("URL")+"\",\"status\":\""+set.getInt("STATUS")+"\"},";
				json.append(temp);
			}
			result=json.toString().substring(0,json.toString().length()-1)+"]}}";
			// 关闭链接
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int updateUrl(String sql) {
		int result=0;
		// 第1步：建立数据库链接
		Connection conn = JDBCTools.getConnection();
		// 第2步：写SQL魔板
		// 第3步：按照真实数据生成执行SQL
		Statement st;
		ResultSet set;
		try {
			st=conn.createStatement();
			// 执行拼装好的sql,如果是更新，则返回更新条数
			result = st.executeUpdate(sql);
			// 关闭链接
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int insertExercise(String sql) {
		int result=0;
		// 第1步：建立数据库链接
		Connection conn = JDBCTools.getConnection();
		// 第2步：写SQL魔板
		// 第3步：按照真实数据生成执行SQL
		Statement st;
		ResultSet set;
		try {
			st=conn.createStatement();
			// 执行拼装好的sql,如果是更新，则返回更新条数
			result = st.executeUpdate(sql);
			// 关闭链接
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
