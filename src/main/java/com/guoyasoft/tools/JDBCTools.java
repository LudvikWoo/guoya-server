package com.guoyasoft.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTools {
	public static Connection getConnection() {
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
