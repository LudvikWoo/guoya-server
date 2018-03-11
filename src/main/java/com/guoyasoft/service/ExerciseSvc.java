package com.guoyasoft.service;

import com.guoyasoft.dao.StudyDao;

public class ExerciseSvc {
	public String getUrls() {
		String result = "";
		// result =
		// "{\"study\":{\"student\":[{\"group\":\"1\",\"sno\":\"s001\",\"sname\":\"陈超超\",\"url\":\"http://127.0.0.1:8083/guoya-client/basicClass/首页.html\",\"status\":\"0\"},{\"group\":\"1\",\"sno\":\"s002\",\"sname\":\"陈超2\",\"url\":\"http://127.0.0.1:8083/guoya-client/basicClass/首页.html\",\"status\":\"1\"},{\"group\":\"1\",\"sno\":\"s003\",\"sname\":\"陈超3\",\"url\":\"http://127.0.0.1:8083/guoya-client/basicClass/首页.html\",\"status\":\"0\"},{\"group\":\"2\",\"sno\":\"s004\",\"sname\":\"陈超4\",\"url\":\"http://127.0.0.1:8083/guoya-client/basicClass/首页.html\",\"status\":\"1\"},{\"group\":\"2\",\"sno\":\"s005\",\"sname\":\"陈超5\",\"url\":\"http://127.0.0.1:8083/guoya-client/basicClass/首页.html\",\"status\":\"1\"},{\"group\":\"2\",\"sno\":\"s006\",\"sname\":\"陈超6\",\"url\":\"http://127.0.0.1:8083/guoya-client/basicClass/首页.html\",\"status\":\"1\"}]}}";
		String sql = "select t.sno,t.sname,t.groupid,t.url,t.status from  gy_Exercise t ";
		System.out.println(sql);
		StudyDao dao = new StudyDao();
		result = dao.selectExercise(sql);
		System.out.println(result);
		return result;
	}

	public int updateUrl(String sno, String url) {
		int result = 0;
		String sql = "update gy_exercise t set t.url='" + url
				+ "' where t.sno='" + sno + "' ";
		System.out.println(sql);
		StudyDao dao = new StudyDao();
		result = dao.updateUrl(sql);
		System.out.println(result);
		return result;
	}

	public int insertExercise(String sname, String sno, String groupId,
			String url, String img) {
		int result = 0;
		String sql = "insert into gy_exercise(sno,sname,groupid,url,status)values('"
				+ sno + "','" + sname + "','" + groupId + "','" + url + "',0) ";
		System.out.println(sql);
		StudyDao dao = new StudyDao();
		result = dao.insertExercise(sql);
		System.out.println(result);
		return result;
	}

	public int updateStatus(String sno, String status) {
		int result = 0;
		String sql = "update gy_exercise t set t.status=" + status
				+ " where t.sno='" + sno + "' ";
		System.out.println(sql);
		StudyDao dao = new StudyDao();
		result = dao.updateUrl(sql);
		System.out.println(result);
		return result;
	}

	public int updateAllStatus() {
		int result = 0;
		String sql = "update gy_exercise t set t.status=0 ";
		System.out.println(sql);
		StudyDao dao = new StudyDao();
		result = dao.updateUrl(sql);
		System.out.println(result);
		return result;
	}

	public int deleteStudy(String sno) {
		int result = 0;
		String sql = "delete gy_exercise where sno= '" + sno + "'";

		if (sno == null || "".equals(sno) || "null".equals(sno)) {
			sql = "delete gy_exercise where sno is null";
		}
		System.out.println(sql);
		StudyDao dao = new StudyDao();
		result = dao.updateUrl(sql);
		System.out.println(result);
		return result;
	}
}
