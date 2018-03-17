package com.guoyasoft.service;

import com.guoyasoft.dao.TaskDao;
import com.guoyasoft.tools.JDBCTools;

public class TaskSvc {

	public String getTaskList() {
		String sql = "select b.itemid,                                  "
				+ "       b.priority,                                "
				+ "       b.itemname,                                "
				+ "       b.itemdesc,                                "
				+ "       b.itemstatus,                              "
				+ "       a.taskid,                                  "
				+ "       a.taskname,                                "
				+ "       to_char(a.exec_date, 'yyyy-mm-dd')exec_date"
				+ "  from gy_task a, gy_task_item b                  "
				+ " where a.taskid = b.taskid(+)                      "
				+ " order by a.taskid,b.priority                     ";
		System.out.println(sql);

		TaskDao dao = new TaskDao();
		String result = dao.getTaskList(sql);
		return result;
	}

	public int updateTaskItem(String itemId, String status) {
		String sql = " update gy_task_item t set t.itemstatus='" + status
				+ "' where t.itemid='" + itemId + "'";
		System.out.println(sql);

		TaskDao dao = new TaskDao();
		int result = dao.updateTaskItem(sql);
		return result;
	}

	public int addTask(String taskDate, String taskName) {
		String sql = "   insert into gy_task                                                  "
				+ "     (UPDATE_TIME, TASKID, TASKNAME, CREATETIME, DEMO_URL, EXEC_DATE)   "
				+ "   values                                                               "
				+ "     (sysdate,                                                          "
				+ "      (select max(taskID) + 1 from gy_task),                            "
				+ "      \'"
				+ taskName
				+ "\',                           "
				+ "      sysdate,                                                          "
				+ "      \'\',                                                             "
				+ "      to_date(\'"
				+ taskDate
				+ "\', \'yyyy-mm-dd\'))                          ";
		System.out.println(sql);
		TaskDao dao = new TaskDao();
		int result = dao.updateTaskItem(sql);
		return result;
	}

	public int addTaskItem(String taskId, String itemName, String itemDesc) {
		String sql = " insert into gy_task_item                                                   "
				+ "   (ITEMID, ITEMNAME, TASKID, ITEMDESC, ITEMSTATUS, PRIORITY)               "
				+ " values                                                                     "
				+ "   ((select max(t.ITEMID) + 1 from gy_task_item t),                         "
				+ "    \'"
				+ itemName
				+ "\',                                                          "
				+ "    \'"
				+ taskId
				+ "\',                                                             "
				+ "    \'"
				+ itemDesc
				+ "',   "
				+ "    \'0\',                                                                  "
				+ "    (select max(nvl(t.priority,0)) + 1 from gy_task_item t where t.taskid = \'"
				+ taskId + "\'))";
		System.out.println(sql);
		TaskDao dao = new TaskDao();
		int result = dao.updateTaskItem(sql);
		return result;
	}

	public int deleteTaskItem(String itemId) {
		String sql = " delete gy_task_item t where t.itemid=" + itemId;
		System.out.println(sql);
		TaskDao dao = new TaskDao();
		int result = dao.updateTaskItem(sql);
		return result;
	}

	public int deleteTask(String taskId) {
		// 删除任务表
		String sql = " delete gy_task t where t.taskid=" + taskId;
		System.out.println(sql);
		TaskDao dao = new TaskDao();
		int result = dao.updateTaskItem(sql);

		// 删除任务明细表
		sql = "delete gy_task_item t where t.taskid=" + taskId;
		System.out.println(sql);
		result += dao.updateTaskItem(sql);
		return result;
	}


}
