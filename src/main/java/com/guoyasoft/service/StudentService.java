package com.guoyasoft.service;

import com.guoyasoft.beans.Student;
import com.guoyasoft.dao.StudentDao;

public class StudentService {
	public boolean insert(Student s){
		StudentDao dao=new StudentDao();
		int result=dao.insert(s);
		if(result==1){
			return true;
		}else{
			return false;
		}
	}
}
