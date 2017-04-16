package com.loner.dubbo.dao;

import org.springframework.stereotype.Service;

@Service("cnCourseDao")
public class CnCourseDao {

	public String getCourseByUid(String uid) {
		return uid + "喜欢的是古典诗集";
	}

}
