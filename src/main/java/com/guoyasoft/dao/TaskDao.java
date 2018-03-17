package com.guoyasoft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.guoyasoft.tools.JDBCTools;

public class TaskDao {

	public String getTaskList(String sql) {
		StringBuilder json=new StringBuilder();
		String result="";
		json.append("{\"tasks\": {");
		json.append("\"task\": [ ");
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
			String tasks="";
			String taskId="";
			String taskInfo="";
			String items=" ";
			while(set.next()){				//再拼接task和item
				if(!taskId.equals(set.getString("TASKID"))&&!"".equals(taskId)){
					taskInfo+=items.substring(1)+"]}}";
				}
				//先取task的值，如果值不同，就先存储，再重置
				if(!taskId.equals(set.getString("TASKID"))){
					//先归档
					tasks+=taskInfo;
					//再初始化
					taskId=set.getString("TASKID");
					taskInfo=",{ \"taskId\": \""+set.getString("TASKID")+"\",  \"taskName\": \""+set.getString("TASKNAME")+"\",     \"taskDate\": \""+set.getString("EXEC_DATE")+"\",\"items\": { \"item\": [";
					items="";
				}
				//再取item的值
				items+=",{\"itemId\": \""+set.getString("ITEMID")+"\", \"itemName\":\""+set.getString("ITEMNAME")+"\",  \"itemDesc\": \""+set.getString("ITEMDESC")+"\", \"itemStatus\": \""+set.getString("ITEMSTATUS")+"\"}";
			}
			//最后一轮的结果直接加上
			taskInfo+=items.substring(1)+"]}}";
			tasks+=taskInfo;
			//将任务加入到json串，去掉第一个逗号
			json.append(tasks.substring(1));
			result=json.toString()+"]}}";
			// 关闭链接
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int updateTaskItem(String sql) {
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
