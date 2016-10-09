package com.loner.dubbo.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.common.util.concurrent.AbstractIdleService;

public class Bootstrap extends AbstractIdleService {

	private ClassPathXmlApplicationContext context;

	public static void main(String[] args) {

		Bootstrap bootstrap = new Bootstrap();
		bootstrap.startAsync();
		try {
			Object lock = new Object();
			synchronized (lock) {
				while (true) {
					lock.wait();
				}
			}
		} catch (InterruptedException ex) {
			System.err.println("ignoreinterruption");
		}

	}

	/**
	 * Start the service.
	 */
	@Override
	protected void startUp() throws Exception {
		context = new ClassPathXmlApplicationContext("dubbo-demo-provider.xml");
		context.start();
		context.registerShutdownHook();
		System.out
				.println("----------------provider service startedsuccessfully------------");
	}

	/**
	 * Stop the service.
	 */
	@Override
	protected void shutDown() throws Exception {
		context.stop();
		System.out
				.println("-------------service stoppedsuccessfully-------------");
	}

}