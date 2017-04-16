package org.dubbo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {

	private static final Logger logger = LoggerFactory.getLogger(Slf4jTest.class);

	public static void main(String[] args) {
		logger.info("我的名字是{}", "milesloner");
		logger.error("我知错了{}", "majoo");
		logger.warn("我fuck the {}", "world");
		logger.debug("被我调戏了 {}", "操蛋");
	}

}
