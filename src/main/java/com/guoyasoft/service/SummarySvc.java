package com.guoyasoft.service;

import com.guoyasoft.dao.SummaryDao;
import com.guoyasoft.tools.JDBCTools;

public class SummarySvc {

	public int insertSummary(String sno, String imgPath,String summaryDate) {
		String sql = " insert into gy_daily_summary (SNO, IMG_PATH, CREATE_TIME, SUMMARY_DATE)"
					+"values (\'"+sno+"\', \'"+imgPath+"\',sysdate, \'"+summaryDate+"\')" ;
		int result = JDBCTools.update(sql);
		return result;
	}

	public String querySummaryInfo(String summaryDate) {
		String json="";
		String sql="select a.sno,b.sname,a.img_path,a.summary_date from gy_daily_summary a,gy_exercise b where a.sno=b.sno and a.summary_date='"+summaryDate+"'";
		SummaryDao dao = new SummaryDao();
		json = dao.querySummaryInfo(sql,summaryDate);
		return json;
	}
}
