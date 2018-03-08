package com.guoyasoft.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.guoyasoft.beans.Student;

public class StudentDao {
	public int insert(Student student) {
		int result = 0;
		// 第1步：建立数据库链接
		Connection conn = getConnection();
		// 第2步：写SQL魔板
		String sql = "insert into gy_student (SNAME, SAGE)values (?, ?)";
		// 第3步：按照真实数据生成执行SQL
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, student.getSname());
			pstmt.setInt(2, student.getSage());
			// 执行拼装好的sql,如果是更新，则返回更新条数
			result = pstmt.executeUpdate();
			// 关闭链接
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			result = 0;
		}
		return result;
	}

	private Connection getConnection() {
		// 第1步：选择驱动，有mysql的，有orace，类似不同版本的浏览器
		String driver = "oracle.jdbc.driver.OracleDriver";
		// 第2步：提供链接地址，哪台主机，哪个应用port，哪个实例（类似tomcat的应用名）
		String url = "jdbc:oracle:thin:@120.132.0.117:1521:CCSDB1";// 127.0.0.1是本机地址，XE是精简版Oracle的默认数据库名
		// 第3步：登录，用户名、密码
		String username = "shuccs1o";
		String password = "shuccs1o";
		// 第4步：建立链接，固定写法
		Connection conn = null;
		try {
			Class.forName(driver); // classLoader,加载对应驱动
			conn = (Connection) DriverManager.getConnection(url, username,
					password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
