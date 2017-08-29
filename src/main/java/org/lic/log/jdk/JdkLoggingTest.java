package org.lic.log.jdk;

import java.util.logging.Logger;

public class JdkLoggingTest {

	private static final Logger logger = Logger.getLogger(JdkLoggingTest.class.getName());
	public static void main(String[] args) {
		logger.info("jdk logging info : success!");
	}
}
