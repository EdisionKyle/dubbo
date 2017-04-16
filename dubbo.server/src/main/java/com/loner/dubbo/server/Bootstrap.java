package com.loner.dubbo.server;

public class Bootstrap {

	static {
		// 设置dubbo使用slf4j来记录日志
		System.setProperty("dubbo.application.logger", "slf4j");
	}

	/**
	 * 主函数
	 *
	 * @param args
	 *            启动参数
	 */
	public static void main(String[] args) throws Exception {
		com.alibaba.dubbo.container.Main.main(args);
	}

}