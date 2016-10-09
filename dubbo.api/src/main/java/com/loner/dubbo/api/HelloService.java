package com.loner.dubbo.api;

import com.loner.dubbo.pojo.CnUser;

public interface HelloService {

	public String sayHello(String name);
	
	public CnUser findCnUserById(String uid);

}