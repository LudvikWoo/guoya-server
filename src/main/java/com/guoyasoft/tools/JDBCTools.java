package com.guoyasoft.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class JDBCTools {
	// oracle数据库驱动
	/*
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@47.98.226.232:3308/guoya_test";
	*/
	// mysql数据库驱动
	// 第1步：选择驱动，有mysql的，有orace，类似不同版本的浏览器
	private static String driver = "com.mysql.jdbc.Driver";
	// 第2步：提供链接地址，哪台主机，哪个应用port，哪个实例（类似tomcat的应用名）
	private static String url = "jdbc:mysql://pro.guoyasoft.com:3306/guoya_official_dev?useUnicode=true&characterEncoding=utf8";
	// 第3步：登录，用户名、密码
	private static String username = "root";
	// 第4步：建立链接，固定写法
	private static String password = "pro_root";

	public static Connection conn;
	public static PreparedStatement ps;
	public static ResultSet rs;
	public static Statement st;

	public static Connection getConnection() {


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

	public static int update(String sql) {
		System.out.println(sql);
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
