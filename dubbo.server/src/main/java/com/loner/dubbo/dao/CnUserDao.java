/**
 *  工程名：dubbo.server
 *  文件名：CnUserDao.java
 *  包名：com.loner.dubbo.dao
 *  创建时间：2016年9月29日 下午3:31:00
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.dubbo.dao;

import org.springframework.stereotype.Component;

import com.loner.dubbo.pojo.CnUser;

/**
 *  类名：CnUserDao
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年9月29日 下午3:31:00
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
@Component
public class CnUserDao {

	
	public CnUserDao() {
		super();
		System.out.println("初始化CnUserDao");
	}

	public CnUser findCnUsers() {
		return new CnUser("HW9872786234", "木木夕", "29", "广州市越秀区");
	}

}
