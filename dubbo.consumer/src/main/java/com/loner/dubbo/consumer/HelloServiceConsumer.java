package com.loner.dubbo.consumer;

import com.loner.dubbo.api.HelloService;

/**
 *  类名：HelloServiceConsumer
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年9月13日 上午11:04:30
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 *
 */
public class HelloServiceConsumer {

	private HelloService helloService;

	public String helloFjx() {
		return helloService.sayHello("tianpc0318");
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}

}