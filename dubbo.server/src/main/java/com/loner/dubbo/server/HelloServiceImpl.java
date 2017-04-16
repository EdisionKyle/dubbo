package com.loner.dubbo.server;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.loner.dubbo.api.HelloService;
import com.loner.dubbo.dao.CnCourseDao;
import com.loner.dubbo.dao.CnUserDao;
import com.loner.dubbo.pojo.CnUser;

/**
 *  类名：HelloServiceImpl.java
 *  说明：Hello服务逻辑实现
 *  创建时间：2017年4月16日 上午10:45:11
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *  @author milesloner
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {
	private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);
	@Resource
	private Map<String, String> bankcodemap;

	@Resource
	private CnUserDao cnUserDao;

	@Resource
	private CnCourseDao cnCourseDao;

	/**
	 * 暴露的接口
	 *
	 * @param name
	 * @return
	 */
	public String sayHello(String name) {
		System.out.println(cnCourseDao.getCourseByUid("u520"));
		return "Hello " + name;
	}

	/**
	 * 
	 * @author pengcheng.tian
	 * @param uid
	 * @return
	 */
	@Override
	public CnUser findCnUserById(String uid) {
		logger.info("HelloServiceImpl#findCnUserById input param {}", uid);
		System.out.println("findCnUserById.uid==" + uid);
		System.out.println("cnUserDao.findCnUsers==" + bankcodemap);
		System.out.println(cnUserDao.findCnUsers());
		return new CnUser(uid, "万里独行", "30", "广东省深圳市南山区");
	}

}
