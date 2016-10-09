package com.loner.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.loner.dubbo.api.HelloService;
import com.loner.dubbo.pojo.CnUser;

public class ConsumerTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring.xml" });
		HelloService helloService = (HelloService) context
				.getBean("helloService");
		String hello = helloService.sayHello("，田鹏程，欢迎来到Dubbo世界。");
		System.out.println("helloService.sayHello==" + hello);
		
		CnUser cnUser = helloService.findCnUserById("HYT48393");
		System.out.println("helloService.findCnUserById==" + cnUser.toString());
		context.close();
	}

}