package com.guoyasoft.service;

import com.guoyasoft.beans.GyDailySummary;
import com.guoyasoft.dao.SummaryDao;
import com.guoyasoft.tools.JDBCTools;
import com.guoyasoft.tools.MyStringTools;

public class SummarySvc {

	public int insertSummary(String sno, String imgPath,String summaryDate) {
		String sql = " insert into gy_daily_summary (SNO, IMG_PATH, CREATE_TIME, SUMMARY_DATE)"
					+"values (\'"+sno+"\', \'"+imgPath+"\',sysdate, \'"+summaryDate+"\')" ;
		int result = JDBCTools.update(sql);
		return result;
	}

	public String querySummaryInfo(GyDailySummary bean) {
		String json="";
		String sql="select a.sno, b.sname, a.img_path, a.summary_date"
					+" from gy_daily_summary a, gy_exercise b"
					+" where 1=1 and a.sno = b.sno ";
					if(MyStringTools.isBlank(bean.getSno())){
						sql+=" and a.sno = '"+bean.getSno()+"'";
					}

					if(MyStringTools.isBlank(bean.getSummaryDate())){
						sql+=" and a.summary_date = '"+bean.getSummaryDate()+"'";
					}
					if(MyStringTools.isBlank(bean.getSname())){
						sql+=" and b.sname = '"+bean.getSname()+"'";
					}
					if(MyStringTools.isBlank(bean.getGroupId())){
						sql+=" and b.groupid='"+bean.getGroupId()+"'";
					}
					if(MyStringTools.isBlank(bean.getTutor())){
						sql+=" and b.tutor='"+bean.getTutor()+"'";
					} 
					if(MyStringTools.isBlank(bean.getOutstanding())){
						sql+=" and a.outstanding='"+bean.getOutstanding()+"'";
					}
				SummaryDao dao = new SummaryDao();
		json = dao.querySummaryInfo(sql);
		return json;
	}
	
	
}
